package src.main.java.com.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import src.main.java.com.domain.model.entity.Veterinario;

public interface VeterinarioCrudRepository extends MongoRepository<Veterinario, String> {
}
