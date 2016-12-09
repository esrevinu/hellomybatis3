package com.hellomybatis3.service.impl;

import com.hellomybatis3.dao.IUserDao;
import com.hellomybatis3.pojo.User;
import com.hellomybatis3.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

}
