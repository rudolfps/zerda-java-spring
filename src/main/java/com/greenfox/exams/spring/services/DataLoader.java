
package com.greenfox.exams.spring.services;

/**
 * Created by gabkamabka on 2017.01.11..


    @Component
    public class DataLoader implements CommandLineRunner {

        @Autowired
        ProjectRepo repo;

        @Override
        public void run(String... strings) throws Exception {
            repo.save(new Project("Clash of Zerda", "android"));
            repo.save(new Project("Clash of Zerda", "spring"));
            repo.save(new Project("Zerda Reader", "android"));
            repo.save(new Project("Zerda Reader", "spring"));
            repo.save(new Project("Konnekt Contact Manager", "spring"));
        }
 }
*/
