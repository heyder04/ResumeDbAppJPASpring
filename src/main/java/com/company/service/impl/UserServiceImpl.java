/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.service.impl;

import com.company.dao.inter.UserDaoInter;
import com.company.entity.User;
import com.company.service.inter.UserServiceInter;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author HP
 */
@Service
@Transactional
public class UserServiceImpl implements UserServiceInter {
//Data Access Object
 @Autowired
 @Qualifier("userDao1")
    private UserDaoInter userDao;

    @Override
    public List<User> getAll(String name,String surname,Integer nationalityId) {
    return  userDao.getAll(name,surname,nationalityId);
    }


        @Override
    public User findByEmailAndPassword(String email, String password) {
     return  userDao.findByEmailAndPassword(email,password);
    }

       @Override
    public User findByEmail(String email) {
      return  userDao.findByEmail(email);
    }


    @Override
    public boolean updateUser(User u) {
     return  userDao.updateUser(u);
    }
    
     @Override
    public boolean addUser(User u) {
    return  userDao.addUser(u);
    }

    @Override
    public boolean removeUser(int id) {
    return  userDao.removeUser(id);
    }

    @Override
    public User getById(int userId) {
    return  userDao.getById(userId);
    }
    


    


    
}
