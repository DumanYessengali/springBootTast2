package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.FileRouting;
import kz.aitu.advancedJava.repository.FileRoutingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileRoutingService {
    public final FileRoutingRepository fileRoutingRepository;
    public FileRoutingService(FileRoutingRepository fileRoutingRepository) {
        this.fileRoutingRepository = fileRoutingRepository;
    }

    public List<FileRouting> getAll(){return (List<FileRouting>) fileRoutingRepository.findAll();}
    public FileRouting getById(Long id) {return fileRoutingRepository.findById(id).orElse(null);}
    public FileRouting create(FileRouting caseIndex) {return fileRoutingRepository.save(caseIndex);}
    public FileRouting update(FileRouting caseIndex) {return fileRoutingRepository.save(caseIndex);}
    public void delete(Long id) {fileRoutingRepository.deleteById(id);}
}
