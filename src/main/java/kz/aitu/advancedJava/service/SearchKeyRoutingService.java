package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.SearchKeyRouting;
import kz.aitu.advancedJava.repository.SearchKeyRoutingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchKeyRoutingService {
    public final SearchKeyRoutingRepository searchKeyRoutingRepository;
    public SearchKeyRoutingService(SearchKeyRoutingRepository searchKeyRoutingRepository){
        this.searchKeyRoutingRepository = searchKeyRoutingRepository;
    }
    public List<SearchKeyRouting> getAll(){return (List<SearchKeyRouting>) searchKeyRoutingRepository.findAll();}
    public SearchKeyRouting getById(Long id) {return searchKeyRoutingRepository.findById(id).orElse(null);}
    public SearchKeyRouting create(SearchKeyRouting caseIndex) {return searchKeyRoutingRepository.save(caseIndex);}
    public SearchKeyRouting update(SearchKeyRouting caseIndex) {return searchKeyRoutingRepository.save(caseIndex);}
    public void delete(Long id) {searchKeyRoutingRepository.deleteById(id);}
}
