package com.greenfox.exams.spring.project;


import lombok.Data;

/**
 * Created by rudolfps on 2017.01.11..
 */

@Data
public class Project {

    private String name;
    private String developmentFramework;

    public Project(String name, String developmentFramework) {
    }

}
