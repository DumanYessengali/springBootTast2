package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.CaseIndex;
import kz.aitu.advancedJava.repository.CaseIndexRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseIndexService {
    public final CaseIndexRepository caseIndexRepository;
    public CaseIndexService(CaseIndexRepository caseIndexRepository){
        this.caseIndexRepository = caseIndexRepository;
    }
    public List<CaseIndex> getAll(){return (List<CaseIndex>) caseIndexRepository.findAll();}
    public CaseIndex getById(Long id) {return caseIndexRepository.findById(id).orElse(null);}
    public CaseIndex create(CaseIndex caseIndex) {return caseIndexRepository.save(caseIndex);}
    public CaseIndex update(CaseIndex caseIndex) {return caseIndexRepository.save(caseIndex);}
    public void delete(Long id) {caseIndexRepository.deleteById(id);}
}
