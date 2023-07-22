package fr.kartina.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.kartina.backend.entities.FilterEntity;

public interface FilterRepository extends CrudRepository<FilterEntity, Long> {
}