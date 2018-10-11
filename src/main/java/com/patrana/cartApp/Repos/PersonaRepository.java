package com.patrana.cartApp.Repos;

import com.patrana.cartApp.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository  extends JpaRepository<Persona,Integer>{
}
