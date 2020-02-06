package com.ekleszcz.learning.jpa.jpain10steps.service;

import com.ekleszcz.learning.jpa.jpain10steps.entity.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {

  @PersistenceContext
  private EntityManager entityManager;

  public long insert(User user) {
    entityManager.persist(user);
    return user.getId();
  }
}
