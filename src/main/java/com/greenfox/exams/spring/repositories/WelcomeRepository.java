package com.greenfox.exams.spring.repositories;

import com.greenfox.exams.spring.domain.WelcomeForm;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rudolfps on 2017.01.11..
 */
public interface WelcomeRepository  extends CrudRepository<WelcomeForm, Long> {
}
