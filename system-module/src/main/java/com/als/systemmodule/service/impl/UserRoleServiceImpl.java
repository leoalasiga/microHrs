package com.als.systemmodule.service.impl;

import com.als.systemmodule.domain.UserRole;
import com.als.systemmodule.mapper.UserRoleMapper;
import com.als.systemmodule.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author liujiajie
 * @date 2019/7/17 17:25
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
}
