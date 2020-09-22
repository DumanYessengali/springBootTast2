package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Record;
import kz.aitu.advancedJava.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecordService {
    public final RecordRepository recordRepository;
    public RecordService(RecordRepository recordRepository){
        this.recordRepository = recordRepository;
    }
    public List<Record> getAll(){return (List<Record>) recordRepository.findAll();}
    public Record getById(Long id) {return recordRepository.findById(id).orElse(null);}
    public Record create(Record caseIndex) {return recordRepository.save(caseIndex);}
    public Record update(Record caseIndex) {return recordRepository.save(caseIndex);}
    public void delete(Long id) {recordRepository.deleteById(id);}
}
