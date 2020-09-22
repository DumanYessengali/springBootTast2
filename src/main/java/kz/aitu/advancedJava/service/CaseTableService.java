package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.CaseTable;
import kz.aitu.advancedJava.repository.CaseTableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseTableService {
    public final CaseTableRepository caseTableRepository;
    public CaseTableService(CaseTableRepository caseTableRepository){
        this.caseTableRepository = caseTableRepository;
    }
    public List<CaseTable> getAll(){return (List<CaseTable>) caseTableRepository.findAll();}
    public CaseTable getById(Long id) {return caseTableRepository.findById(id).orElse(null);}
    public CaseTable create(CaseTable caseIndex) {return caseTableRepository.save(caseIndex);}
    public CaseTable update(CaseTable caseIndex) {return caseTableRepository.save(caseIndex);}
    public void delete(Long id) {caseTableRepository.deleteById(id);}
}
