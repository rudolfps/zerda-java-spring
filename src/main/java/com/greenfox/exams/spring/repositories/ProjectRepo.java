
package com.greenfox.exams.spring.repositories;

import com.greenfox.exams.spring.project.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rudolfps on 2017.01.11..
 */

@Repository
public interface ProjectRepo extends CrudRepository<Project, Long> {

    }

