package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.DestructionAct;
import kz.aitu.advancedJava.repository.DestructionActRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestructionActService {
    public final DestructionActRepository destructionActRepository;
    public DestructionActService(DestructionActRepository destructionActRepository){
        this.destructionActRepository = destructionActRepository;
    }
    public List<DestructionAct> getAll(){return (List<DestructionAct>) destructionActRepository.findAll();}
    public DestructionAct getById(Long id) {return destructionActRepository.findById(id).orElse(null);}
    public DestructionAct create(DestructionAct caseIndex) {return destructionActRepository.save(caseIndex);}
    public DestructionAct update(DestructionAct caseIndex) {return destructionActRepository.save(caseIndex);}
    public void delete(Long id) {destructionActRepository.deleteById(id);}
}
