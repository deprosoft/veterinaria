package com.veterinaria.proyecto.application.ports.out.mascota;

import com.veterinaria.proyecto.application.domain.entity.Mascota;

import java.util.List;
import java.util.Optional;

public interface MascotaGateway {

    List<Mascota> getAll();
    Optional<Mascota> getMascotaByNombre(String nombre);
    Mascota saveMascota(Mascota mascota);
    Boolean deleteMascota(String nombre);

    Mascota createMascota(Mascota mascota);
    List<Mascota> getMascotaByRaza(String raza);
}
