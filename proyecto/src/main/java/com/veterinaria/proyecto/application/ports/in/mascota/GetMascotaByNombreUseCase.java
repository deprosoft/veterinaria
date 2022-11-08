package com.veterinaria.proyecto.application.ports.in.mascota;

import com.veterinaria.proyecto.application.domain.entity.Mascota;
import com.veterinaria.proyecto.commons.UseCase;

import java.util.Optional;

public interface GetMascotaByNombreUseCase extends UseCase<String, Optional<Mascota>> {
}
