package com.example.spring01.repository;

import com.example.spring01.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource()
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    List<Persona> findPersonaByApellidos(@Param("apellidos") String apellidos);
}
