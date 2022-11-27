package com.capas.reservas.domain.services;

import com.capas.reservas.domain.entity.Reserva;
import com.capas.reservas.domain.gateway.ReservaGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.List;
import java.util.Optional;

public class ReservaService {

    @Autowired
    private ReservaGateway gateway;
    @Autowired
    MessageSource msg;


    public List<Reserva> getAll()    {  return gateway.getAll();    }
    public Optional<Reserva> getReservaById(Integer idReserva)
    {
        return gateway.getReservaById(idReserva);
    }
    public String saveReserva(Reserva reserva) {

        List<Reserva> lstReservaExistente = gateway.getReservaBynombreMascota(reserva.getNombreMascota());

        String msjRes = msg.getMessage("reserva.save.message", null, null);
        msjRes = msjRes.format(msjRes, reserva.getIdReserva());

        return msjRes;
    }
    public String deleteReserva(Integer idReserva) {
        String mje="";

        Optional<Reserva> res = gateway.getReservaById(idReserva);

        if(!res.isEmpty())
        {
            int codEstadoRes = res.get().getIdEstado();
        }

        Boolean borro = gateway.deleteReserva(idReserva);

        mje=msg.getMessage("reserva.delete.mesage", null,null);

        return mje;
    }
    public List<Reserva> getReservaByIdEstado(Integer idEstado)
    {
        return gateway.getReservaByIdEstado(idEstado);
    }

    public  List<Reserva> getReservaBynombreMascota(String nombre){ return gateway.getReservaBynombreMascota(nombre); }

}
