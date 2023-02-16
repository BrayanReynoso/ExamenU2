package mx.edu.utez.pokemonExamen.models.entrenadores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EntrenadoresRepository extends JpaRepository<Entrenadores, Long> {
    Optional<Entrenadores> findById(Long id);
    Optional<Entrenadores>findByName(String name);
}
