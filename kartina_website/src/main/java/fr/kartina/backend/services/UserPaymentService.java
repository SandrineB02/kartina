package fr.kartina.backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.kartina.backend.entities.UserPaymentEntity;
import fr.kartina.backend.repositories.UserPaymentRepository;

@Service
public class UserPaymentService {
    @Autowired
    private UserPaymentRepository userPaymentRepository;

    public Iterable<UserPaymentEntity> findAll(){
        return userPaymentRepository.findAll();
    }

    public Optional<UserPaymentEntity> findById(Long id){
        return userPaymentRepository.findById(id);
    }

    public UserPaymentEntity save(UserPaymentEntity contact){
        return userPaymentRepository.save(contact);
    }

    public void deleteById(Long id){
        userPaymentRepository.deleteById(id);
    }
}
