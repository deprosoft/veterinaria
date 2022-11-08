package com.veterinaria.proyecto.application.ports.in.mascota;

import com.veterinaria.proyecto.application.domain.entity.Mascota;
import com.veterinaria.proyecto.commons.UseCase;

import java.util.List;

public interface GetAllUseCase extends UseCase<Void, List<Mascota>> {
}
