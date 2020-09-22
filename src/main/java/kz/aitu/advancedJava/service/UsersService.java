package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Users;
import kz.aitu.advancedJava.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    public final UsersRepository usersRepository;
    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }
    public List<Users> getAll(){return (List<Users>) usersRepository.findAll();}
    public Users getById(Long id) {return usersRepository.findById(id).orElse(null);}
    public Users create(Users caseIndex) {return usersRepository.save(caseIndex);}
    public Users update(Users caseIndex) {return usersRepository.save(caseIndex);}
    public void delete(Long id) {usersRepository.deleteById(id);}
}
