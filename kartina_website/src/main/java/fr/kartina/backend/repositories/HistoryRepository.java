package fr.kartina.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.kartina.backend.entities.HistoryEntity;

public interface HistoryRepository extends CrudRepository<HistoryEntity, Long> {
}