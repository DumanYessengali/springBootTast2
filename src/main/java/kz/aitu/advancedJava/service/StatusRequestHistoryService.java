package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.StatusRequestHistory;
import kz.aitu.advancedJava.repository.StatusRequestHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusRequestHistoryService {
    public final StatusRequestHistoryRepository statusRequestHistoryRepository;
    public StatusRequestHistoryService(StatusRequestHistoryRepository statusRequestHistoryRepository){
        this.statusRequestHistoryRepository = statusRequestHistoryRepository;
    }
    public List<StatusRequestHistory> getAll(){return (List<StatusRequestHistory>) statusRequestHistoryRepository.findAll();}
    public StatusRequestHistory getById(Long id) {return statusRequestHistoryRepository.findById(id).orElse(null);}
    public StatusRequestHistory create(StatusRequestHistory caseIndex) {return statusRequestHistoryRepository.save(caseIndex);}
    public StatusRequestHistory update(StatusRequestHistory caseIndex) {return statusRequestHistoryRepository.save(caseIndex);}
    public void delete(Long id) {statusRequestHistoryRepository.deleteById(id);}
}
