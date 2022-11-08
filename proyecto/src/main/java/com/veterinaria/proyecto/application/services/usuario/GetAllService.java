package com.veterinaria.proyecto.application.services.usuario;

import com.veterinaria.proyecto.application.domain.entity.Usuario;
import com.veterinaria.proyecto.application.ports.in.usuario.GetAllUseCase;
import com.veterinaria.proyecto.application.ports.out.usuario.UsuarioGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GetAllService implements GetAllUseCase {

    @Autowired
    private UsuarioGateway gateway;

    @Override
    public List<Usuario> execute(Void unused) {
        return gateway.getAll();
    }
}
