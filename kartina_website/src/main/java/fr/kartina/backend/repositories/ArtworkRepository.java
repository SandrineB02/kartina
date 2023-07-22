package fr.kartina.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.kartina.backend.entities.ArtworkEntity;

public interface ArtworkRepository extends CrudRepository<ArtworkEntity, Long> {
}
