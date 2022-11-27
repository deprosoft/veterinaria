package com.capas.reservas.persistence.crud;

import com.capas.reservas.persistence.models.ReservaDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservaCrudRepository extends CrudRepository<ReservaDAO, Integer> {

    List<ReservaDAO> getReservaByIdEstado(Integer idEstado);
    List<ReservaDAO> getReservaBynombreMascota(String nombre);
}
