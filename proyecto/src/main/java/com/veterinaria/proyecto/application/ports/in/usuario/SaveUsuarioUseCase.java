package com.veterinaria.proyecto.application.ports.in.usuario;

import com.veterinaria.proyecto.application.domain.entity.Usuario;
import com.veterinaria.proyecto.commons.UseCase;

import java.util.Locale;

public interface SaveUsuarioUseCase extends UseCase<Usuario, String> {
    String execute(Usuario usuario, Locale locale);
}
