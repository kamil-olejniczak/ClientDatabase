package com.company.configuration.security.repository;

import com.company.dao.AbstractDao;
import com.company.model.security.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;

@Repository
@Transactional(readOnly = true)
public class HibernateUserRepository extends AbstractDao<User, Long> implements UserRepository {

    @Autowired
    public HibernateUserRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public User findByUsername(String username) {
        String query = String.format("FROM %s WHERE USERNAME = '%s'",
                getPersistentClass().getSimpleName(), username);
        try {
            User user = sessionFactory.getCurrentSession()
                    .createQuery(query, User.class)
                    .getSingleResult();
            return user;
        } catch(NoResultException e) {
            return null;
        }
    }
}
