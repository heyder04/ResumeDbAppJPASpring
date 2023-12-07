package com.company.dao.inter;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
 User findByName(String nm);
 User findByNameAndSurname(String nm,String sm);
}
