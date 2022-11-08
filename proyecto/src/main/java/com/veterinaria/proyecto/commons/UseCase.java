package com.veterinaria.proyecto.commons;

import com.veterinaria.proyecto.application.domain.exception.DuenoNoExisteException;
import com.veterinaria.proyecto.application.domain.exception.MascotaEnTratamientoException;

public interface UseCase<Input, Output> {
    Output execute(Input input) throws MascotaEnTratamientoException, DuenoNoExisteException;
}
