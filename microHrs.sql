--创建数据库
CREATE DATABASE `microHrs` DEFAULT CHARACTER SET utf8;
USE `microHrs`;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for appraise
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `isAlive` int(1) default 0 COMMENT '是否在线(0否,1是)',
  `isDeleted` int(1) default 0 COMMENT '是否删除(0否,1是)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `role_id` int(11) NOT NULL COMMENT '角色ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL COMMENT '用户ID',
  `role_code` varchar(32) NOT NULL COMMENT '角色编码',
  `role_name` varchar(32) NOT NULL COMMENT '角色名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `t_role_menu`;
CREATE TABLE `t_role_menu` (
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  `menu_id` int(11) NOT NULL COMMENT '菜单ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(32) NOT NULL COMMENT '菜单名',
  `url` varchar(32) NOT NULL COMMENT 'url地址',
  `parent_id` int(1) NOT NULL COMMENT '父ID',
  `component` int(1) default 0 COMMENT 'vue组件名',
  `is_deleted` int(1) default 0 COMMENT '是否删除(0否,1是)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;