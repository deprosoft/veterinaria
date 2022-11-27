package com.capas.reservas.persistence.crud;

import com.capas.reservas.persistence.models.EstadoDAO;
import org.springframework.data.repository.CrudRepository;

public interface EstadoCrudRepository extends CrudRepository<EstadoDAO,Integer> {
}
