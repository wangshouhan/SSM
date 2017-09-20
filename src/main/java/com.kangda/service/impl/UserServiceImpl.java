package com.kangda.service.impl;

import com.kangda.dao.IUserDao;
import com.kangda.model.User;
import com.kangda.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by: shouhan
 *
 * @Date: 14:59 2017/9/20
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
