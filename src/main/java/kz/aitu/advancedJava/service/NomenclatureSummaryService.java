package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.NomenclatureSummary;
import kz.aitu.advancedJava.repository.NomenclatureSummaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NomenclatureSummaryService {
    public final NomenclatureSummaryRepository nomenclatureSummaryRepository;
    public NomenclatureSummaryService(NomenclatureSummaryRepository nomenclatureSummaryRepository){
        this.nomenclatureSummaryRepository = nomenclatureSummaryRepository;
    }
    public List<NomenclatureSummary> getAll(){return (List<NomenclatureSummary>) nomenclatureSummaryRepository.findAll();}
    public NomenclatureSummary getById(Long id) {return nomenclatureSummaryRepository.findById(id).orElse(null);}
    public NomenclatureSummary create(NomenclatureSummary caseIndex) {return nomenclatureSummaryRepository.save(caseIndex);}
    public NomenclatureSummary update(NomenclatureSummary caseIndex) {return nomenclatureSummaryRepository.save(caseIndex);}
    public void delete(Long id) {nomenclatureSummaryRepository.deleteById(id);}

}
