package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Share;
import kz.aitu.advancedJava.repository.ShareRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShareService {
    public final ShareRepository shareRepository;
    public ShareService(ShareRepository shareRepository){
        this.shareRepository = shareRepository;
    }
    public List<Share> getAll(){return (List<Share>) shareRepository.findAll();}
    public Share getById(Long id) {return shareRepository.findById(id).orElse(null);}
    public Share create(Share caseIndex) {return shareRepository.save(caseIndex);}
    public Share update(Share caseIndex) {return shareRepository.save(caseIndex);}
    public void delete(Long id) {shareRepository.deleteById(id);}
}
