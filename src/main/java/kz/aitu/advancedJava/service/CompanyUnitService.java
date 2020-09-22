package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.CompanyUnit;
import kz.aitu.advancedJava.repository.CompanyUnitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyUnitService {
    public final CompanyUnitRepository companyUnitRepository;
    public CompanyUnitService(CompanyUnitRepository companyUnitRepository){
        this.companyUnitRepository = companyUnitRepository;
    }
    public List<CompanyUnit> getAll(){return (List<CompanyUnit>) companyUnitRepository.findAll();}
    public CompanyUnit getById(Long id) {return companyUnitRepository.findById(id).orElse(null);}
    public CompanyUnit create(CompanyUnit caseIndex) {return companyUnitRepository.save(caseIndex);}
    public CompanyUnit update(CompanyUnit caseIndex) {return companyUnitRepository.save(caseIndex);}
    public void delete(Long id) {companyUnitRepository.deleteById(id);}
}
