/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : mail

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-03-15 13:56:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `username` varchar(64) NOT NULL COMMENT '登录名称',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `name` varchar(64) DEFAULT NULL COMMENT '用户名称',
  `employNo` varchar(64) DEFAULT NULL COMMENT '员工编号',
  `status` int(2) DEFAULT NULL COMMENT '用户状态',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uni_username_idx` (`username`) COMMENT '用户登录名唯一约束'
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for user_mails
-- ----------------------------
DROP TABLE IF EXISTS `user_mails`;
CREATE TABLE `user_mails` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` int(11) NOT NULL COMMENT '关联用户id',
  `eimail` varchar(255) NOT NULL COMMENT '邮件地址',
  `create_time` datetime DEFAULT NULL,
  `status` int(2) DEFAULT '1' COMMENT '邮箱状态 1 表示正常状态， -1 表示邮箱删除',
  `is_receive_mail` int(2) DEFAULT '0' COMMENT '是否是用户的接收邮箱，0 不是， 1 是用户接收的邮箱',
  `mail_host` varchar(64) NOT NULL COMMENT '邮件服务器地址',
  `mail_password` varchar(64) NOT NULL COMMENT '邮箱密码',
  `mail_port` varchar(16) NOT NULL COMMENT '邮箱端口号',
  `mail_protocol` varchar(16) NOT NULL DEFAULT '' COMMENT '邮箱协议类型Pop3  stmpt 等',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_mail_index` (`eimail`,`is_receive_mail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户邮箱绑定表， 用于群发邮箱， 和收件邮箱';
