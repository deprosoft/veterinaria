package com.veterinaria.proyecto.infraestructure.crud;

import com.veterinaria.proyecto.infraestructure.models.MascotaDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MascotaCrudRepository extends CrudRepository<MascotaDAO, String> {

    List<MascotaDAO> findMascotaByRaza(String raza);
}
