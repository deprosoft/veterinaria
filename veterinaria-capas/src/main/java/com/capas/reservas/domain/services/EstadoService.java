package com.capas.reservas.domain.services;

import com.capas.reservas.domain.entity.Estado;
import com.capas.reservas.domain.gateway.EstadoGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EstadoService {

    @Autowired
    private EstadoGateway gateway;

   public List<Estado> getAll()
   {
       return gateway.getAll();
   }
    public  Optional<Estado> getEstadoById(Integer idEstado)
    {
        return gateway.getEstadoById(idEstado);
    }
    public  Estado saveEstado(Estado estado)
    {
        return gateway.saveEstado(estado);
    }
    public  Boolean deleteEstado(Integer idEstado)
    {
        return gateway.deleteEstado(idEstado);
    }

}
