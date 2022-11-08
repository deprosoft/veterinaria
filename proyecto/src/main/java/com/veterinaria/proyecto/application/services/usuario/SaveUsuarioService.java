package com.veterinaria.proyecto.application.services.usuario;

import com.veterinaria.proyecto.application.domain.entity.Usuario;
import com.veterinaria.proyecto.application.ports.in.usuario.SaveUsuarioUseCase;
import com.veterinaria.proyecto.application.ports.out.usuario.UsuarioGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.Locale;

public class SaveUsuarioService implements SaveUsuarioUseCase {

    @Autowired
    private UsuarioGateway gateway;

    @Autowired
    MessageSource msg;



    @Override
    public String execute(Usuario usuario, Locale locale) {

        gateway.saveUsuario(usuario);

        return String.format(msg.getMessage("usuario.create.message", null, locale), String.valueOf(usuario.getId()));
    }

    @Override
    public String execute(Usuario usuario) {
        gateway.saveUsuario(usuario);

        return String.format(msg.getMessage("usuario.create.message", null, null), String.valueOf(usuario.getId()));
    }
}
