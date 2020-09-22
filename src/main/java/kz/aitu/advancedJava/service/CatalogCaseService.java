package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.CatalogCase;
import kz.aitu.advancedJava.repository.CatalogCaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogCaseService {
    public final CatalogCaseRepository catalogCaseRepository;
    public CatalogCaseService(CatalogCaseRepository catalogCaseRepository){
        this.catalogCaseRepository = catalogCaseRepository;
    }
    public List<CatalogCase> getAll(){return (List<CatalogCase>) catalogCaseRepository.findAll();}
    public CatalogCase getById(Long id) {return catalogCaseRepository.findById(id).orElse(null);}
    public CatalogCase create(CatalogCase caseIndex) {return catalogCaseRepository.save(caseIndex);}
    public CatalogCase update(CatalogCase caseIndex) {return catalogCaseRepository.save(caseIndex);}
    public void delete(Long id) {catalogCaseRepository.deleteById(id);}
}
