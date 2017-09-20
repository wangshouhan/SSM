package com.kangda.dao;

import com.kangda.model.User;

/**
 * Created by: shouhan
 *
 * @Date: 15:00 2017/9/20
 */
public interface  IUserDao {
    User selectUser(long id);
}
