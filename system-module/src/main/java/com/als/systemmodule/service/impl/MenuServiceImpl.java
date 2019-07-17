package com.als.systemmodule.service.impl;

import com.als.systemmodule.domain.Menu;
import com.als.systemmodule.mapper.MenuMapper;
import com.als.systemmodule.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author liujiajie
 * @date 2019/7/17 17:28
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {
}
