package com.als.systemmodule.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 菜单实体类
 *
 * @author liujiajie
 * @since 2019-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_menu")
//@ApiModel(value="WeatherStationPo对象", description="公路-气象站")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单名
     */
    @TableField("menu_name")
    private String menuName;

    /**
     * url地址
     */
    @TableField("url")
    private String url;

    /**
     * 父ID
     */
    @TableField("parent_id")
    private Integer parentId;

    /**
     * vue组件名
     */
    @TableField("component")
    private Integer component;

    /**
     * 是否删除(0否,1是)
     */
    @TableField("is_deleted")
    private Integer isDeleted;


}
