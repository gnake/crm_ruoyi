#客户管理表
DROP TABLE IF EXISTS `CRM_CUSTOMER_INFO`;
CREATE TABLE IF NOT EXISTS `CRM_CUSTOMER_INFO`
(
    `CUST_ID`               bigint comment '主键',
    `CUST_NAME`             varchar(32) comment '名称',
    `CUST_INDUSTRY`         varchar(32) comment '行业',
    `CUST_PROVINCE`         varchar(32) comment '省份',
    `CUST_CITY`             varchar(32) comment '城市',
    `CUST_ADDRESS`          varchar(128) comment '地址',
    `CUST_SCALE`            varchar(32) comment '规模',
    `CUST_NATURE`           varchar(32) comment '性质',
    `CUST_INTRODUCE`        varchar(1024) comment '简要介绍',
    `CUST_STATE`            varchar(32) comment '状态',
    `CUST_CREATE_ID`        char(36) comment '创建人',
    `CUST_CREATE_TIME`      datetime comment '创建时间',
    `CUST_SUBMIT_ID`        char(36) comment '提交人',
    `CUST_SUBMIT_TIME`      datetime comment '提交时间',
    `CUST_CONFIRM_ID`       char(36) comment '确认人',
    `CUST_CONFIRM_TIME`     datetime comment '确认时间',
    `CUST_PROGRESS_STATE`   varchar(32) comment '进展状态',
    `CUST_LEVEL`            varchar(32) comment '级别',
    `CUST_COMPANY_WEB`      varchar(128) comment '公司网站',
    `ORG_ID`                bigint comment '潜在客户',
    `CUST_VISIT_AGAIN_TIME` datetime comment '计划拜访时间',
    PRIMARY KEY (`CUST_ID`)
) DEFAULT CHARSET = utf8mb4 comment '';

#分组跟客户关联表
DROP TABLE IF EXISTS `crm_customer_grp_rel`;
CREATE TABLE `crm_customer_grp_rel`
(
    `GRP_ID`  char(36) NOT NULL,
    `CUST_ID` char(36) NOT NULL,
    PRIMARY KEY (`GRP_ID`, `CUST_ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

#客户分组表
DROP TABLE IF EXISTS `crm_customer_group`;
CREATE TABLE `crm_customer_group`
(
    `GRP_ID`     char(36) NOT NULL comment '分组ID',
    `GRP_SUP_ID` char(36)     DEFAULT NULL comment '上级ID',
    `GRP_CODE`   varchar(32)  DEFAULT NULL comment '编码',
    `GRP_NAME`   varchar(32)  DEFAULT NULL comment '名称',
    `GRP_SORT`   int(11)      DEFAULT NULL comment '排序',
    `GRP_STATE`  varchar(32)  DEFAULT NULL comment '状态',
    `GRP_DESC`   varchar(256) DEFAULT NULL comment '描述',
    PRIMARY KEY (`GRP_ID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


