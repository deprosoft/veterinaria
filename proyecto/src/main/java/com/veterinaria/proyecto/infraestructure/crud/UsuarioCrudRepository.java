package com.veterinaria.proyecto.infraestructure.crud;

import com.veterinaria.proyecto.infraestructure.models.UsuarioDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrudRepository  extends CrudRepository<UsuarioDAO, Integer> {

    public List<UsuarioDAO> findBynombreCompletoContains(String nombreCompleto);

}
