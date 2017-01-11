package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.domain.WelcomeForm;
import com.greenfox.exams.spring.repositories.WelcomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rudolfs on 2017.01.11..
 */
@Service
public class WelcomeService {
     static WelcomeRepository welcomeRepository;
     WelcomeForm welcomeForm;

    @Autowired
    public WelcomeService(WelcomeRepository welcomeRepository) {
        this.welcomeRepository = welcomeRepository;
    }

    public void save(WelcomeForm welcomeForm) {
        welcomeRepository.save(welcomeForm);
    }

    List<String> expected = new ArrayList<>(Arrays.asList("amazing", "awesome", "blithesome", "excellent", "fabulous",
            "fantastic", "favorable", "fortuitous", "great", "incredible", "ineffable", "mirthful", "outstanding",
            "perfect", "propitious", "remarkable", "smart", "spectacular", "splendid", "stellar", "stupendous",
            "super", "ultimate", "unbelievable", "wondrous"));



    public static WelcomeForm saveData(WelcomeForm welcomeForm) {
        return welcomeRepository.save(welcomeForm);
    }

    public static Iterable<WelcomeForm> list() {
        return welcomeRepository.findAll();
    }
}

