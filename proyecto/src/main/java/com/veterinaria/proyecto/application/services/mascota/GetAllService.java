package com.veterinaria.proyecto.application.services.mascota;

import com.veterinaria.proyecto.application.domain.entity.Mascota;
import com.veterinaria.proyecto.application.ports.in.mascota.GetAllUseCase;
import com.veterinaria.proyecto.application.ports.out.mascota.MascotaGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GetAllService implements GetAllUseCase {

    @Autowired
    private MascotaGateway gateway;

    @Override
    public List<Mascota> execute(Void unused) {
        return gateway.getAll();
    }
}
