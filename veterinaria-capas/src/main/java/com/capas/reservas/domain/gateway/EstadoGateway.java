package com.capas.reservas.domain.gateway;

import com.capas.reservas.domain.entity.Estado;

import java.util.List;
import java.util.Optional;

public interface EstadoGateway {

    List<Estado> getAll();
    Optional<Estado> getEstadoById(Integer idEstado);
    Estado saveEstado(Estado estado);
    Boolean deleteEstado(Integer idEstado);

}
