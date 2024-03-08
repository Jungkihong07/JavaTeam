package com.example.javateam.repository;

import com.example.javateam.domain.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class UserRepoTests {

    @Autowired
    private UserRepo userRepo;

    @Test
    public void insertUsers() {

        IntStream.rangeClosed(1, 10).forEach(i -> {
            UserDao userDao = UserDao.builder()
                    .email("u" + i + "@naver.com")
                    .password("1111")
                    .nickname("nickname"+ i).build();

            userRepo.save(userDao);
        });
    }
}
