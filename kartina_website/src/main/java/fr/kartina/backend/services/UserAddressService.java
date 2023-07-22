package fr.kartina.backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.kartina.backend.entities.UserAddressEntity;
import fr.kartina.backend.repositories.UserAddressRepository;

@Service
public class UserAddressService {
    @Autowired
    private UserAddressRepository userAddressRepository;

    public Iterable<UserAddressEntity> findAll(){
        return userAddressRepository.findAll();
    }

    public Optional<UserAddressEntity> findById(Long id){
        return userAddressRepository.findById(id);
    }

    public UserAddressEntity save(UserAddressEntity contact){
        return userAddressRepository.save(contact);
    }

    public void deleteById(Long id){
        userAddressRepository.deleteById(id);
    }
}
