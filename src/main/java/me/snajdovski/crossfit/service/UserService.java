package me.snajdovski.crossfit.service;

import me.snajdovski.crossfit.data.ICrossfitUsersRepository;
import me.snajdovski.crossfit.controller.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//bean
//@Component -> @Service (za semanti4ki da bide korektno)
@Service
public class UserService {

    private final ICrossfitUsersRepository ICrossfitUsersRepository;

    @Autowired
    public UserService(ICrossfitUsersRepository ICrossfitUsersRepository) {
        this.ICrossfitUsersRepository = ICrossfitUsersRepository;
    }
    public List<User> getSubscribers(){

        return ICrossfitUsersRepository.findAll();
    }

    public void addNewSubscriber(User user) {

        Optional<User> userByNameOptional = ICrossfitUsersRepository.findUserByName(user.getName());
        if(userByNameOptional.isPresent()){
            throw new IllegalStateException("User already exists");
        }
        ICrossfitUsersRepository.save(user);
        System.out.printf("User %s added to the list of subscribers", user.getName());
    }
}
