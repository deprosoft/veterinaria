package com.capas.reservas.persistence.mappers;


import com.capas.reservas.domain.entity.Estado;
import com.capas.reservas.persistence.models.EstadoDAO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstadoMapper {

    @Mappings({
            @Mapping(source = "idEstado", target = "idEstado"),
            @Mapping(source = "nombreEstado", target = "nombreEstado")
    })
    Estado toEstado(EstadoDAO estado);

    List<Estado> toEstados(List<EstadoDAO> estados);

    @InheritInverseConfiguration
    EstadoDAO toEstadoDAO(Estado estado);

}
