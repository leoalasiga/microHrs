package com.als.systemmodule.service.impl;

import com.als.systemmodule.domain.User;
import com.als.systemmodule.mapper.UserMapper;
import com.als.systemmodule.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author liujiajie
 * @date 2019/7/17 17:24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
