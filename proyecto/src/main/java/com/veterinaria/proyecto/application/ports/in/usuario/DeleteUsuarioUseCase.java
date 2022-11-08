package com.veterinaria.proyecto.application.ports.in.usuario;

import com.veterinaria.proyecto.commons.UseCase;

import java.util.Locale;

public interface DeleteUsuarioUseCase extends UseCase<Integer, String> {
    String execute(Integer integer, Locale local);
}
