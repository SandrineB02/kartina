package 
fr.kartina.backend.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.kartina.backend.entities.ArtworkEntity;
import fr.kartina.backend.repositories.ArtworkRepository;

@Service
public class ArtworkService {
    @Autowired
    private ArtworkRepository artworkRepository;

    public Iterable<ArtworkEntity> findAll(){
        return artworkRepository.findAll();
    }

    public Optional<ArtworkEntity> findById(Long id){
        return artworkRepository.findById(id);
    }

    public ArtworkEntity save(ArtworkEntity contact){
        return artworkRepository.save(contact);
    }

    public void deleteById(Long id){
        artworkRepository.deleteById(id);
    }
}
