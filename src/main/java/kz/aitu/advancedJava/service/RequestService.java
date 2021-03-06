package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Request;
import kz.aitu.advancedJava.repository.RequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {
    public final RequestRepository requestRepository;
    public RequestService(RequestRepository requestRepository){
        this.requestRepository = requestRepository;
    }
    public List<Request> getAll(){return (List<Request>) requestRepository.findAll();}
    public Request getById(Long id) {return requestRepository.findById(id).orElse(null);}
    public Request create(Request caseIndex) {return requestRepository.save(caseIndex);}
    public Request update(Request caseIndex) {return requestRepository.save(caseIndex);}
    public void delete(Long id) {requestRepository.deleteById(id);}
}
