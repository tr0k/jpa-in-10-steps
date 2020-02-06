package com.ekleszcz.learning.jpa.jpain10steps;

import com.ekleszcz.learning.jpa.jpain10steps.entity.User;
import com.ekleszcz.learning.jpa.jpain10steps.service.UserDAOService;
import com.ekleszcz.learning.jpa.jpain10steps.service.UserRepository;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

  private static final Logger logger = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {
    User user = new User("Jill", "Admin");
    userRepository.save(user);
    Optional<User> userWithIdOne = userRepository.findById(1L);
    logger.info("User is retrieved: " + userWithIdOne);

    List<User> users = userRepository.findAll();
    logger.info("All users: " + users);


  }
}
