package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.CatologTable;

import kz.aitu.advancedJava.repository.CatologTableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatologTableService {
    public final CatologTableRepository catologTableRepository;
    public CatologTableService(CatologTableRepository catologTableRepository){
        this.catologTableRepository = catologTableRepository;
    }
    public List<CatologTable> getAll(){return (List<CatologTable>) catologTableRepository.findAll();}
    public CatologTable getById(Long id) {return catologTableRepository.findById(id).orElse(null);}
    public CatologTable create(CatologTable caseIndex) {return catologTableRepository.save(caseIndex);}
    public CatologTable update(CatologTable caseIndex) {return catologTableRepository.save(caseIndex);}
    public void delete(Long id) {catologTableRepository.deleteById(id);}
}
