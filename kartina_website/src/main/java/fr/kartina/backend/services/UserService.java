package fr.kartina.backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.kartina.backend.entities.UserEntity;
import fr.kartina.backend.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public UserEntity save(UserEntity contact){
        return userRepository.save(contact);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

}
