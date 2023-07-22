package fr.kartina.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.kartina.backend.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}