package com.dhb.dao;

import com.dhb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mtime on 2018/9/11.
 */
public interface UserDao extends JpaRepository<User, String> {

    List<User> findByName(String name);

    List<User> findByNameLike(String name);

    User findByNameAndTelephone(String name, String no);
}
