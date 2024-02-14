package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Optional;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public UserEntity createUser(User user) {
        UserEntity entity = mapper.convertValue(user, UserEntity.class);

        return userRepository.save(entity);
    }

    @Override
    public String generateTin(Long id) {
        Random random = new Random();

        Optional<UserEntity> entity = userRepository.findById(id);
        Iterator<UserEntity> iterator = entity.stream().iterator();

        UserEntity user = iterator.next();

        String nic = user.getNic();
        String[] str = user.getBirthday().split("-");
        String date=str[1]+""+str[2];

        if (nic.length()>4 && date.length()>8) {
            String tinNic = nic.substring(nic.length()-4);
            String tinDate = date.substring(date.length()-4);

            int number1 = random.nextInt(999);
            String tinRandom1 = String.format("%03d", number1);

            int number2 = random.nextInt(999);
            String tinRandom2 = String.format("%03d", number2);

            return (tinNic+"-"+tinDate+"-"+tinRandom1+"-"+tinRandom2);
        }
        return "Error";
    }
}
