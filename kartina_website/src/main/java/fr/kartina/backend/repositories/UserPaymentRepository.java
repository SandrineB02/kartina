package fr.kartina.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.kartina.backend.entities.UserPaymentEntity;

public interface UserPaymentRepository extends CrudRepository<UserPaymentEntity, Long> {
}