package com.veterinaria.proyecto.application.services.mascota;

import com.veterinaria.proyecto.application.domain.entity.Mascota;
import com.veterinaria.proyecto.application.ports.in.mascota.FindByRazaUseCase;
import com.veterinaria.proyecto.application.ports.out.mascota.MascotaGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.List;

public class FindByRazaService implements FindByRazaUseCase {


    @Autowired
    private MascotaGateway gateway;
    @Autowired
    MessageSource msg;

    @Override
    public List<Mascota> execute(String s) {
        return null;
    }
}
