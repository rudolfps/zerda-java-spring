package com.greenfox.exams.spring.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by gabkamabka on 2017.01.11..
 */
@Data
@Entity
@Table(name = "welcome_page")
public class WelcomeForm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

        @NotNull
        @Size(min=1, max=500)
        private String experience;

        @NotNull
        @Min(1)
        @Max(10)
        private Integer rating;

        @NotEmpty
        @Email
        private String email;


}

