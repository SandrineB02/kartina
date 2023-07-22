package fr.kartina.backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.kartina.backend.entities.FilterEntity;
import fr.kartina.backend.repositories.FilterRepository;

@Service
public class FilterService {
    @Autowired
    private FilterRepository filterRepository;

    public Iterable<FilterEntity> findAll(){
        return filterRepository.findAll();
    }

    public Optional<FilterEntity> findById(Long id){
        return filterRepository.findById(id);
    }

    public FilterEntity save(FilterEntity contact){
        return filterRepository.save(contact);
    }

    public void deleteById(Long id){
        filterRepository.deleteById(id);
    }
}
