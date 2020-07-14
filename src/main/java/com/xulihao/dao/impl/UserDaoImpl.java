package com.xulihao.dao.impl;

import com.xulihao.dao.UserDao;
import com.xulihao.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDaoImpl implements UserDao {
    private Map<String, User> userMap;

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public void save() {
        System.out.println("userMap="+userMap);
        Set<String> strings = userMap.keySet();
        for (String string : strings) {
            System.out.println("key为："+string);
        }
        System.out.println("userdao is runing..");
    }
}
