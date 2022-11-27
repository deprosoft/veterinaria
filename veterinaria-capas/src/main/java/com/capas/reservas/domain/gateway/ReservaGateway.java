package com.capas.reservas.domain.gateway;

import com.capas.reservas.domain.entity.Reserva;

import java.util.List;
import java.util.Optional;

public interface ReservaGateway {

    List<Reserva> getAll();
    Optional<Reserva> getReservaById(Integer idReserva);
    Reserva saveReserva(Reserva reserva);
    Boolean deleteReserva(Integer idReserva);
    List<Reserva> getReservaByIdEstado(Integer idEstado);

    List<Reserva> getReservaBynombreMascota(String nombre);

}
