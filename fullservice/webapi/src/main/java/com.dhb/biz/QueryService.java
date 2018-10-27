package com.dhb.biz;

import com.dhb.dao.UserDao;
import com.dhb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by mtime on 2018/9/12.
 */
@Service
public class QueryService {
    @Autowired
    private UserDao userDao;

    public User saveUserInfo(String name, String password, String email) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);
        user = userDao.save(user);
        System.out.println("save user out : " + user);
        return user;
    }

    @PostConstruct
    public void init() {
        System.out.println("Query serive init ... ");
    }
}
