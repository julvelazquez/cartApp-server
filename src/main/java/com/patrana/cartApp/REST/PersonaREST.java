package com.patrana.cartApp.REST;


import com.google.zxing.WriterException;
import com.patrana.cartApp.Repos.PersonaRepository;
import com.patrana.cartApp.Util.QRGenerator;
import com.patrana.cartApp.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Base64;

@RestController
public class PersonaREST {

    @Autowired
    PersonaRepository personaRepository;


    @PostMapping("/registro/nuevo.gen")
    public Persona create(
            @Param("nombre") String nombre,
            @Param("paterno") String paterno,
            @Param("materno") String materno,
            @Param("correo") String correo
    ){
        Persona p=new Persona();
        p.setNombre(nombre);
        p.setPaterno(paterno);
        p.setMaterno(materno);
        p.setCorreo(correo);


        try {

            String base64="data:image/png;base64,"+
                    Base64.getEncoder().encodeToString(
                            QRGenerator.getQRCodeImage(
                                p.getCorreo(),
                                    200,
                                200
                            )
                    );
        p.setQR(base64);
        personaRepository.save(p);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p;


    }

}
