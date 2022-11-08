package com.veterinaria.proyecto.application.services.mascota;

import com.veterinaria.proyecto.application.domain.entity.Mascota;
import com.veterinaria.proyecto.application.ports.in.mascota.GetMascotaByNombreUseCase;
import com.veterinaria.proyecto.application.ports.out.mascota.MascotaGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class GetMascotaByNombreService implements GetMascotaByNombreUseCase {
    @Autowired
    private MascotaGateway gateway;

    @Override
    public Optional<Mascota> execute(String nombre) {
        return gateway.getMascotaByNombre(nombre);
    }
}
