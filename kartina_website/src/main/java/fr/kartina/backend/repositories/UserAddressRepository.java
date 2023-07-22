package fr.kartina.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import fr.kartina.backend.entities.UserAddressEntity;

public interface UserAddressRepository extends CrudRepository<UserAddressEntity, Long> {
}

