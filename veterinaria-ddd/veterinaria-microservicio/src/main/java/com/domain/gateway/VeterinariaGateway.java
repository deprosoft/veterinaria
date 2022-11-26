package src.main.java.com.domain.gateway;

import src.main.java.com.domain.model.entity.Veterinaria;

import java.util.List;
import java.util.Optional;

public interface VeterinariaGateway {
    List<Veterinaria> getAll();
    Optional<Veterinaria> getVeterinariaById(String id);
    Veterinaria saveVeterinaria(Veterinaria vet);
    Boolean deleteVeterinaria(String id);

}
