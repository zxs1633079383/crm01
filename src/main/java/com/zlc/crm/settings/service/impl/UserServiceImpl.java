package com.zlc.crm.settings.service.impl;

import com.zlc.crm.settings.dao.UserDao;
import com.zlc.crm.settings.service.UserService;
import com.zlc.crm.utils.SqlSessionUtil;


public class UserServiceImpl implements UserService {
    private UserDao userDao= SqlSessionUtil.getSqlSession().getMapper(UserDao.class);

}
