package fr.kartina.backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.kartina.backend.entities.HistoryEntity;
import fr.kartina.backend.repositories.HistoryRepository;

@Service
public class HistoryService {
    @Autowired
    private HistoryRepository historyRepository;

    public Iterable<HistoryEntity> findAll(){
        return historyRepository.findAll();
    }

    public Optional<HistoryEntity> findById(Long id){
        return historyRepository.findById(id);
    }

    public HistoryEntity save(HistoryEntity contact){
        return historyRepository.save(contact);
    }

    public void deleteById(Long id){
        historyRepository.deleteById(id);
    }
}
