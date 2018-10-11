package com.patrana.cartApp.model;

import javax.persistence.*;

@Table
@Entity(name="Persona")
public class Persona {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idPersona")
    private Integer idPersona;

    @Column(name="nombre")
    private String nombre;

    @Column(name="paterno")
    private String paterno;

    @Column(name="materno")
    private String materno;

    @Column(name="correo")
    private String correo;

    @Lob
    @Column(name="QR")
    private String QR;


    public Persona(Integer idPersona, String nombre, String paterno, String materno, String correo, String QR) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.correo = correo;
        this.QR = QR;
    }

    public Persona() {
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getQR() {
        return QR;
    }

    public void setQR(String QR) {
        this.QR = QR;
    }
}
