drop database if exists  CRM;

create database if not exists CRM;

use CRM;

DROP TABLE IF EXISTS MY_TASKS;
create table IF NOT EXISTS MY_TASKS
(
    TASK_ID           bigint not null primary key,
    ORG_ID            bigint not null comment '潜在客户(ORG_INFO) 关联',
    CUST_ID           bigint not null comment '客户管理(CUSTOMER_INFO) 关联',
    TASK_REVIEW_ID    bigint not null comment '任务计划&总结(TASK_REVIEW) 关联',
    SALE_ID           bigint comment '销售人员',
    TASK_FOLLOW_STATE varchar(32) comment '跟进状态',
    TASK_CLASS        varchar(32) comment '任务类别',
    TASK_CREATE_TIME  varchar(32) comment '创建任务时间',
    TASK_FINISH_TIME  varchar(32) comment '任务完成时间',
    TASK_CUST_STATE   varchar(32) comment '客户状态'
) DEFAULT CHARSET = utf8mb4 comment '我的任务细项表';

DROP TABLE IF EXISTS TASK_REVIEW;
CREATE TABLE IF NOT EXISTS TASK_REVIEW
(
    `TASK_REVIEW_ID`               bigint not null primary key,
    `TC_ID`                        bigint not null comment '任务周期定义(TASK_CYCLE) 关联',
    `SALE_ID`                      char(36) comment '销售人员',
    `TASK_REVIEW_STATE`            varchar(32) comment '总结状态',
    `TASK_REVIEW_DESC`             text comment '总结说明',
    `TASK_REVIEW_VISITS_TOTAL`     int(11) comment '拜访总数',
    `TASK_REVIEW_STRANGE`          int(11) comment '陌生拜访记录',
    `TASK_REVIEW_RETURNVISIT`      int(11) comment '回访拜访记录',
    `TASK_REVIEW_NEW_INTENCUST`    int(11) comment '新增意向客户',
    `TASK_REVIEW_RETURNVISIT_HIST` int(11) comment '回访历史客户',
    `TASK_REVIEW_LOSS`             int(11) comment '流失客户'
) DEFAULT CHARSET = utf8mb4 comment '任务计划&总结表';

DROP TABLE IF EXISTS TASK_CYCLE;
create table IF NOT EXISTS TASK_CYCLE
(
    TC_ID    bigint      not null primary key,
    TC_BEGIN varchar(32) null comment '起始日期',
    TC_END   varchar(32) null comment '结束日期'
) DEFAULT CHARSET = utf8mb4 comment '任务周期定义表';

DROP TABLE IF EXISTS OPP_INFO;
CREATE TABLE IF NOT EXISTS OPP_INFO
(
    `OPP_ID`              bigint not null primary key,
    `OPP_NAME`            varchar(32) comment '商机名称',
    `CLUE_ID`             char(36) comment '线索标识',
    `CUST_ID`             char(36) comment '客户标识',
    `CONT_ID`             char(36) comment '联系人标识',
    `OPP_DES`             varchar(256) comment '商机说明',
    `OPP_CONCERN_PRODUCT` varchar(256) comment '关注产品',
    `OPP_EXPECT_INVEST`   decimal(10, 2) comment '预期投入',
    `OPP_START_TIME`      varchar(32) comment '启动时间',
    `OPP_STATE`           varchar(32) comment '状态',
    `CLUE_SALESMAN`       char(36) comment '销售人员',
    `OPP_CREATER`         char(36) comment '创建人',
    `OPP_CREATE_TIME`     varchar(32) comment '创建时间'
) DEFAULT CHARSET = utf8mb4 comment '商机管理表';

DROP TABLE IF EXISTS ORDER_ENTRY;
CREATE TABLE IF NOT EXISTS ORDER_ENTRY
(
    ENTRY_ID            BIGINT NOT NULL COMMENT '主键',
    ORDER_ID            BIGINT NOT NULL COMMENT '订单标识，关联订单管理表',
    ENTRY_ORDER_PRODUCT VARCHAR(32) COMMENT '预订产品',
    ENTRY_PRODUCT_MODEL VARCHAR(32) COMMENT '产品型号',
    ENTRY_NUMBER        DECIMAL(6, 0) COMMENT '数量',
    ENTRY_UNIT_PRICE    DECIMAL(10, 2) COMMENT '单价',
    ENTRY_DISCOUNT      DECIMAL(3, 2) COMMENT '折扣',
    ENTRY_REAL_PRICE    DECIMAL(10, 2) COMMENT '实际价格',
    PRIMARY KEY (ENTRY_ID)
) DEFAULT CHARSET = utf8mb4 COMMENT '订单明细表';

DROP TABLE IF EXISTS ORDER_INFO;
CREATE TABLE IF NOT EXISTS ORDER_INFO
(
    ORDER_ID             BIGINT(36) NOT NULL COMMENT '主键',
    OPP_ID               CHAR(36) COMMENT '商机名称',
    ORDER_CHIEF          VARCHAR(32) COMMENT '负责人',
    ORDER_DELIVERY_COST  DECIMAL(10, 2) COMMENT '交付费用',
    ORDER_COST           DECIMAL(10, 2) COMMENT '订单费用',
    ORDER_DES            VARCHAR(200) COMMENT '订单说明',
    ORDER_STATE          VARCHAR(32) COMMENT '状态',
    ORDER_CREATER        CHAR(36) COMMENT '创建人',
    ORDER_CREATE_TIME    VARCHAR(32) COMMENT '创建时间',
    ORDER_CONFIRM_PERSON CHAR(36) COMMENT '确认人',
    ORDER_CONFIRM_TIME   VARCHAR(32) COMMENT '确认时间',
    CLUE_SALESMAN        CHAR(36) COMMENT '销售人员',
    PRIMARY KEY (ORDER_ID)
) DEFAULT CHARSET = utf8mb4 COMMENT '订单管理表';

DROP TABLE IF EXISTS SECURITY_USER;
CREATE TABLE IF NOT EXISTS SECURITY_USER
(
    USER_ID       BIGINT NOT NULL COMMENT '用户ID',
    USER_NAME     VARCHAR(32) COMMENT '姓名',
    USER_CODE     VARCHAR(32) COMMENT '用户编码',
    USER_PWD      VARCHAR(32) COMMENT '密码',
    USER_SEX      VARCHAR(1) COMMENT '性别',
    USER_DESC     VARCHAR(128) COMMENT '描述',
    USER_STATE    VARCHAR(32) COMMENT '状态',
    USER_MAIL     VARCHAR(64) COMMENT '邮箱',
    USER_SORT     INT COMMENT '排序',
    USER_PHONE    VARCHAR(64) COMMENT '手机',
    DISPLAY_COUNT INT COMMENT '显示个数',
    GRP_ID        BIGINT COMMENT '组织ID，关联SECURITY_GROUP',
    PRIMARY KEY (USER_ID)
) DEFAULT CHARSET = utf8mb4 comment '系统用户表';

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

DROP TABLE IF EXISTS `SYS_CODETYPE`;
CREATE TABLE IF NOT EXISTS SYS_CODETYPE
(
    TYPE_ID      bigint not null primary key comment '主键',
    TYPE_IDENT   varchar(32) comment '类型标识',
    TYPE_NAME    varchar(32) comment '类型名称',
    TYPE_GROUP   varchar(32) comment '类型分组',
    IS_EDITABLE  int(1) comment '是否可编辑',
    IS_EFFECTIVE int(1) comment '是否失效',
    IS_EXTEND    int(1) comment '是否SQL扩展'
) COMMENT '编码类型'
    DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `SYS_CODELIST`;
CREATE TABLE IF NOT EXISTS SYS_CODELIST
(
    CODE_ID    bigint not null primary key comment '主键',
    TYPE_ID    bigint comment '编码标识,关联SYS_CODETYPE',
    CODE_VALUE varchar(36) comment '编码值',
    CODE_SORT  int(11) comment '编码排序'
) COMMENT '编码管理'
    DEFAULT CHARSET = utf8mb4;

drop table if exists CRM_ORG_INFO;
create table if not exists CRM_ORG_INFO
(
    ORG_ID               bigint not null
        primary key comment '主键',
    ORG_NAME             varchar(32) comment '组织名称',
    ORG_TYPE             varchar(32) comment '组织性质',
    ORG_INTRODUCTION     text comment '简要介绍',
    ORG_LINKMAN_NAME     varchar(32) comment '联系人',
    ORG_EMAIL            varchar(32) comment '邮箱',
    ORG_CONTACT_WAY      varchar(256) comment '联系方式',
    ORG_STATE            varchar(32) comment '状态',
    ORG_LABELS           varchar(32) comment '标签',
    ORG_ADDRESS          varchar(256) comment '地址',
    ORG_WEBSITE          varchar(128) comment '公司网站',
    ORG_CREATER          char(36) comment '创建人',
    ORG_CREATE_TIME      varchar(32) comment '创建时间',
    ORG_UPDATE_TIME      varchar(32) comment '更新时间',
    ORG_CLASSIFICATION   varchar(32) comment '公司分类',
    ORG_VISIT_AGAIN_TIME varchar(32) comment '计划拜访时间',
    CUST_ID              bigint comment '客户管理(CRM_CUSTOMER_INFO)',
    ORG_SOURCES          varchar(32) comment '来源渠道',
    ORG_SALESMAN         char(36) comment '跟进人员',
    ORG_CLASSIFY         int(1) comment '分类'
) DEFAULT CHARSET = utf8mb4 comment '潜在客户';

drop table if exists CRM_VISIT;
create table if not exists CRM_VISIT
(
    VISIT_ID              bigint not null
        primary key comment '主键',
    VISIT_TYPE            varchar(32) comment '拜访类型',
    VISIT_CUST_ID         bigint comment '客户ID 关联客户管理表',
    VISIT_RECEPTION_NAME  char(36) comment '接待人姓名',
    VISIT_RECEPTION_SEX   varchar(32) comment '接待人性别',
    VISIT_RECEPTION_JOB   varchar(32) comment '接待人职位',
    VISIT_RECEPTION_PHONE varchar(128) comment '接待人电话',
    VISIT_USER_ID         bigint comment '拜访人员',
    VISIT_PEER_NAME       varchar(32) comment '同行人员',
    VISIT_DATE            datetime comment '拜访日期',
    VISIT_CONTENT         varchar(256) comment '交互内容',
    VISIT_CUST_FOCUS      varchar(256) comment '客户关注点',
    VISIT_EFFECT          varchar(32) comment '沟通效果',
    VISIT_IMPROVEMENT     varchar(32) comment '待改进情况',
    VISIT_COST            decimal(10, 2) comment '拜访费用',
    VISIT_COST_EXPLAIN    varchar(256) comment '费用说明',
    VISIT_STATE           varchar(32) comment '状态',
    VISIT_FILL_ID         bigint comment '填写人',
    VISIT_FILL_TIME       datetime comment '填写时间',
    VISIT_CONFIRM_ID      bigint comment '确认人',
    VISIT_CONFIRM_TIME    datetime comment '确认时间'
) DEFAULT CHARSET = utf8mb4 comment '拜访记录';

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
    `CUST_CREATE_ID`        bigint comment '创建人',
    `CUST_CREATE_TIME`      datetime comment '创建时间',
    `CUST_SUBMIT_ID`        bigint comment '提交人',
    `CUST_SUBMIT_TIME`      datetime comment '提交时间',
    `CUST_CONFIRM_ID`       bigint comment '确认人',
    `CUST_CONFIRM_TIME`     datetime comment '确认时间',
    `CUST_PROGRESS_STATE`   varchar(32) comment '进展状态',
    `CUST_LEVEL`            varchar(32) comment '级别',
    `CUST_COMPANY_WEB`      varchar(128) comment '公司网站',
    `ORG_ID`                bigint comment '潜在客户',
    `CUST_VISIT_AGAIN_TIME` datetime comment '计划拜访时间',
    PRIMARY KEY (`CUST_ID`)
) DEFAULT CHARSET = utf8mb4 comment '客户管理表';

DROP TABLE IF EXISTS `CRM_CUSTOMER_GRP_REL`;
CREATE TABLE IF NOT EXISTS `CRM_CUSTOMER_GRP_REL`
(
    `GRP_ID`  bigint NOT NULL,
    `CUST_ID` bigint NOT NULL,
    PRIMARY KEY (`GRP_ID`, `CUST_ID`)
) DEFAULT CHARSET = utf8 comment '分组跟客户关联表';

DROP TABLE IF EXISTS `CRM_CUSTOMER_GROUP`;
CREATE TABLE IF NOT EXISTS `CRM_CUSTOMER_GROUP`
(
    `GRP_ID`     bigint NOT NULL comment '分组ID',
    `GRP_SUP_ID` bigint       DEFAULT NULL comment '上级ID',
    `GRP_CODE`   varchar(32)  DEFAULT NULL comment '编码',
    `GRP_NAME`   varchar(32)  DEFAULT NULL comment '名称',
    `GRP_SORT`   int(11)      DEFAULT NULL comment '排序',
    `GRP_STATE`  varchar(32)  DEFAULT NULL comment '状态',
    `GRP_DESC`   varchar(256) DEFAULT NULL comment '描述',
    PRIMARY KEY (`GRP_ID`)
) DEFAULT CHARSET = utf8mb4 comment '客户分组表';


