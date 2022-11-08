package com.veterinaria.proyecto.application.services.usuario;

import com.veterinaria.proyecto.application.domain.entity.Usuario;
import com.veterinaria.proyecto.application.ports.in.usuario.FindBynombreCompletoContainsUseCase;
import com.veterinaria.proyecto.application.ports.out.usuario.UsuarioGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FindBynombreCompletoContainsService implements FindBynombreCompletoContainsUseCase {

    @Autowired
    private UsuarioGateway gateway;



    @Override
    public List<Usuario> execute(String s) {
        return gateway.findBynombreCompletoContains(s);
    }
}
