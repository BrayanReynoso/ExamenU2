package mx.edu.utez.pokemonExamen.models.pokemom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    Optional<Pokemon> findById(Long id);
    Optional<Pokemon>findByName(String name);






}
