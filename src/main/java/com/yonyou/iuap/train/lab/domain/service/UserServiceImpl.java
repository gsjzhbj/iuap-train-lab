package com.yonyou.iuap.train.lab.domain.service;

import com.yonyou.iuap.train.lab.domain.bean.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public List<User> findAll() {
        return new ArrayList<>();
    }
}
