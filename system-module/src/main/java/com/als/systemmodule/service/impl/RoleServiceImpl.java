package com.als.systemmodule.service.impl;

import com.als.systemmodule.domain.Role;
import com.als.systemmodule.mapper.RoleMapper;
import com.als.systemmodule.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author liujiajie
 * @date 2019/7/17 17:26
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
}
