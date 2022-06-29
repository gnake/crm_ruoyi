#组织表(部门表)
DROP TABLE IF EXISTS `SECURITY_GROUP`;
CREATE TABLE IF NOT EXISTS `SECURITY_GROUP`
(
    `GRP_ID`    bigint primary key not null comment '组织ID',
    `GRP_CODE`  varchar(32) comment '组织编码',
    `GRP_NAME`  varchar(32) comment '组织名',
    `GRP_PID`   bigint comment '组织父ID',
    `GRP_DESC`  varchar(128) comment '组织描述',
    `GRP_STATE` int(1) comment '组织状态',
    `GRP_SORT`  int(11) comment '组织排序',
    `GRP_TYPE`  varchar(32) comment '组织类型',
    `GRP_RANK`  varchar(32) comment '组织等级'
) DEFAULT CHARSET = utf8mb4 comment '组织部门表';

#系统日志表
DROP TABLE IF EXISTS `SYS_LOG`;
CREATE TABLE IF NOT EXISTS `SYS_LOG`
(
    `SYS_ID`      bigint primary key comment '主键',
    `OPER_TIME`   timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '操作时间',
    `IP_ADDTRESS` varchar(32) comment '所在地址',
    `USER_ID`     varchar(32) comment '用户表示',
    `USER_NAME`   varchar(32) comment '用户名称',
    `FUNC_NAME`   varchar(64) comment '功能名称',
    `ACTION_TYPE` varchar(32) comment '操作类型'
) DEFAULT CHARSET = utf8mb4 comment '系统日志表';
