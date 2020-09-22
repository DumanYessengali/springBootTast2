package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.ActivateJournal;
import kz.aitu.advancedJava.repository.ActivateJournalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivateJournalService {
    public final ActivateJournalRepository activateJournalRepository;

    public ActivateJournalService(ActivateJournalRepository activateJournalRepository) {
        this.activateJournalRepository = activateJournalRepository;
    }

    public List<ActivateJournal> getAll() {
        return (List<ActivateJournal>) activateJournalRepository.findAll();
    }

    public ActivateJournal getById(Long id) {
        return activateJournalRepository.findById(id).orElse(null);
    }

    public ActivateJournal create(ActivateJournal activateJournal) {
        return activateJournalRepository.save(activateJournal);
    }

    public ActivateJournal update(ActivateJournal activateJournal) {
        return activateJournalRepository.save(activateJournal);
    }

    public void delete(Long id) {
        activateJournalRepository.deleteById(id);
    }
}
