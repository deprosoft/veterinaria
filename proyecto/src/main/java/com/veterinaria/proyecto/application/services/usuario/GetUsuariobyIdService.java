package com.veterinaria.proyecto.application.services.usuario;

import com.veterinaria.proyecto.application.domain.entity.Usuario;
import com.veterinaria.proyecto.application.ports.in.usuario.GetUsuariobyIdUseCase;
import com.veterinaria.proyecto.application.ports.out.usuario.UsuarioGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class GetUsuariobyIdService implements GetUsuariobyIdUseCase {

    @Autowired
    private UsuarioGateway gateway;

    @Override
    public Optional<Usuario> execute(Integer id) {
        return gateway.getUsuariobyId(id);
    }
}
