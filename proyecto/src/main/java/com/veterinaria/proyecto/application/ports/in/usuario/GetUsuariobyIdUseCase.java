package com.veterinaria.proyecto.application.ports.in.usuario;

import com.veterinaria.proyecto.application.domain.entity.Usuario;
import com.veterinaria.proyecto.commons.UseCase;

import java.util.Optional;

public interface GetUsuariobyIdUseCase extends UseCase<Integer, Optional<Usuario>> {
}
