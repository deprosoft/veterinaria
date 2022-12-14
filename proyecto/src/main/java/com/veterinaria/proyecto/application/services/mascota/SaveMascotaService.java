package com.veterinaria.proyecto.application.services.mascota;

import com.veterinaria.proyecto.application.domain.entity.Mascota;
import com.veterinaria.proyecto.application.domain.entity.Usuario;
import com.veterinaria.proyecto.application.domain.exception.DuenoNoExisteException;
import com.veterinaria.proyecto.application.ports.in.mascota.SaveMascotaUseCase;
import com.veterinaria.proyecto.application.ports.out.mascota.MascotaGateway;
import com.veterinaria.proyecto.application.ports.out.usuario.UsuarioGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.Optional;

public class SaveMascotaService implements SaveMascotaUseCase {
    @Autowired
    private MascotaGateway gateway;

    @Autowired
    private UsuarioGateway userGateway;

    @Autowired
    MessageSource msg;
    @Override
    public String execute(Mascota mascota) throws DuenoNoExisteException {

        if(mascota.getIdUsuario()>0)
        {
            Optional<Usuario> usr = userGateway.getUsuariobyId(mascota.getIdUsuario());

            if(usr.isEmpty())
            {
                //Toda mascota debe tener dueño
                String msgE = msg.getMessage("error.mascotasindueno", null, null);

                throw new DuenoNoExisteException(msgE);
            }

        }

        gateway.saveMascota(mascota);

        return String.format(msg.getMessage("mascota.create.message", null, null), mascota.getNombre());

    }
}
