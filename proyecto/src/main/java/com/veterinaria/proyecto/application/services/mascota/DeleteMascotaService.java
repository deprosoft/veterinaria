package com.veterinaria.proyecto.application.services.mascota;

import com.veterinaria.proyecto.application.domain.entity.Mascota;
import com.veterinaria.proyecto.application.domain.exception.MascotaEnTratamientoException;
import com.veterinaria.proyecto.application.ports.in.mascota.DeleteMascotaUseCase;
import com.veterinaria.proyecto.application.ports.out.mascota.MascotaGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.Optional;

public class DeleteMascotaService implements DeleteMascotaUseCase {

    @Autowired
    private MascotaGateway gateway;
    @Autowired
    MessageSource msg;

    @Override
    public String execute(String nombre) throws MascotaEnTratamientoException {

        Optional<Mascota> mascotaSel = gateway.getMascotaByNombre(nombre);

        //Regla de negocio
        if(!mascotaSel.isEmpty())
        {
            if(mascotaSel.get().isTratamientoActivo())
            {
                throw new MascotaEnTratamientoException(mascotaSel.get().getNombre());
            }
        }

       Boolean res= gateway.deleteMascota(nombre);

       if(res==false)
       {
           return String.format(msg.getMessage("mascota.delete.error.message", null, null),nombre);
       }

        return String.format(msg.getMessage("mascota.create.message", null, null), nombre);

    }
}
