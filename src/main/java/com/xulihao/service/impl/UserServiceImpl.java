package com.xulihao.service.impl;

import com.xulihao.dao.UserDao;
import com.xulihao.domain.User;
import com.xulihao.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private List<String> stringList;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
        System.out.println(stringList);
        System.out.println("userService执行了！");
    }
}
