#我的任务细项表
DROP TABLE IF EXISTS MY_TASKS;
create table IF NOT EXISTS MY_TASKS
(
    TASK_ID           bigint primary key,
    ORG_ID            bigint comment '潜在客户(ORG_INFO) 关联',
    CUST_ID           bigint comment '客户管理(CUSTOMER_INFO) 关联',
    TASK_REVIEW_ID    bigint comment '任务计划&总结(TASK_REVIEW) 关联',
    SALE_ID           bigint comment '销售人员',
    TASK_FOLLOW_STATE varchar(32) comment '跟进状态',
    TASK_CLASS        varchar(32) comment '任务类别',
    TASK_CREATE_TIME  datatime comment '创建任务时间',
    TASK_FINISH_TIME  datatime comment '任务完成时间',
    TASK_CUST_STATE   varchar(32) comment '客户状态'
    ) DEFAULT CHARSET = utf8mb4 comment '我的任务细项表';

#任务计划&总结表
DROP TABLE IF EXISTS TASK_REVIEW;
CREATE TABLE IF NOT EXISTS TASK_REVIEW
(
    `TASK_REVIEW_ID`               bigint primary key,
    `TC_ID`                        bigint comment '任务周期定义(TASK_CYCLE) 关联',
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

#任务周期定义表
DROP TABLE IF EXISTS TASK_CYCLE;
create table IF NOT EXISTS TASK_CYCLE
(
    TC_ID    bigint primary key,
    TC_BEGIN datatime comment '起始日期',
    TC_END   datatime comment '结束日期'
    ) DEFAULT CHARSET = utf8mb4 comment '任务周期定义表';


#拜访记录
DROP TABLE IF EXISTS VISIT;
create table IF NOT EXISTS VISIT
(
    VISIT_ID               bigint not null primary key,
    VISIT_TYPE             varchar(32) comment '拜访类型',
    VISIT_CUST_ID          char(36) comment '客户ID',
    VISIT_RECEPTION_NAME   varchar(32) comment '接待人姓名',
    VISIT_RECEPTION_SEX    varchar(32) comment '接待人性别',
    VISIT_RECEPTION_JOB    varchar(32) comment '接待人职位',
    VISIT_RECEPTION_PHONE  varchar(32) comment '接待人电话',
    VISIT_USER_ID          char(36) comment '拜访人员',
    VISIT_PEER_NAME        varchar(32) comment '同行人员',
    VISIT_DATE             date comment '拜访日期',
    VISIT_CONTENT          varchar(256) comment '交互内容',
    VISIT_CUST_FOCUS       varchar(32) comment '客户关注点',
    VISIT_EFFECT           varchar(32) comment '沟通效果',
    VISIT_IMPROVEMENT      varchar(32) comment '待改进情况',
    VISIT_COST             decimal(10,2) comment '拜访费用',
    VISIT_COST_EXPLAIN     varchar(256) comment '费用说明',
    VISIT_STATE            varchar(32) comment '状态',
    VISIT_FILL_ID          char(36) comment '填写人',
    VISIT_FILL_TIME        datetime comment '填写时间',
    VISIT_CONFIRM_ID       char(36) comment '确认人',
    VISIT_CONFIRM_TIME     datetime comment '确认时间'
    ) DEFAULT CHARSET = utf8mb4 comment '拜访记录表';

#商机管理
DROP TABLE IF EXISTS opp_info;
CREATE TABLE IF NOT EXISTS opp_info (
                                        `OPP_ID` bigint not null primary key,
                                        `OPP_NAME` varchar(32) comment '商机名称',
    `CLUE_ID` char(36) comment '线索标识',
    `CUST_ID` char(36) comment '客户标识',
    `CONT_ID` char(36) comment '联系人标识',
    `OPP_DES` varchar(256) comment '商机说明',
    `OPP_CONCERN_PRODUCT` varchar(256) comment '关注产品',
    `OPP_EXPECT_INVEST` decimal(10,2) comment '预期投入',
    `OPP_START_TIME` datatime comment '启动时间',
    `OPP_STATE` varchar(32) comment '状态',
    `CLUE_SALESMAN` char(36) comment '销售人员',
    `OPP_CREATER` char(36) comment '创建人',
    `OPP_CREATE_TIME` varchar(32) comment '创建时间'
    ) DEFAULT CHARSET = utf8mb4 comment '商机管理表';