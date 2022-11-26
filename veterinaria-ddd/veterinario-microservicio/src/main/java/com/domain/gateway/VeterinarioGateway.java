package src.main.java.com.domain.gateway;

import src.main.java.com.domain.model.entity.Veterinario;

import java.util.List;
import java.util.Optional;

public interface VeterinarioGateway {

    List<Veterinario> getAll();
    Optional<Veterinario> getVeterinarioById(String id);
    Veterinario saveVeterinario(Veterinario vet);
    Boolean deleteVeterinario(String id);

}
