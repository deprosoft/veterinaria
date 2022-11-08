package com.veterinaria.proyecto.application.services.usuario;

import com.veterinaria.proyecto.application.ports.in.usuario.DeleteUsuarioUseCase;
import com.veterinaria.proyecto.application.ports.out.usuario.UsuarioGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.Locale;

public class DeleteUsuarioService implements DeleteUsuarioUseCase {

    @Autowired
    private UsuarioGateway gateway;

    @Autowired
    MessageSource msg;

    @Override
    public String execute(Integer integer, Locale local) {
        Boolean res = gateway.deleteUsuario(integer);

        if(res==false)
        {
            return String.format(msg.getMessage("usuario.delete.error.message", null,local));
        }



        return String.format(msg.getMessage("usuario.delete.message", null, local), String.valueOf(integer));

    }

    @Override
    public String execute(Integer integer) {
        Boolean res = gateway.deleteUsuario(integer);

        if(res==false)
        {
            return String.format(msg.getMessage("usuario.delete.error.message", null,null));
        }



        return String.format(msg.getMessage("usuario.delete.message", null, null), String.valueOf(integer));

    }
}
