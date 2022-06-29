#我的任务细项表
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

#任务计划&总结表
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

#任务周期定义表
DROP TABLE IF EXISTS TASK_CYCLE;
create table IF NOT EXISTS TASK_CYCLE
(
    TC_ID    bigint not null primary key,
    TC_BEGIN varchar(32) null comment '起始日期',
    TC_END   varchar(32) null comment '结束日期'
) DEFAULT CHARSET = utf8mb4 comment '任务周期定义表';
