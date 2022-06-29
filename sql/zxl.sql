-- auto-generated definition
drop table if exists crm_org_info;
create table crm_org_info
(
    ORG_ID               bigint     not null
        primary key comment '主键',
    ORG_NAME             varchar(32)  null comment '组织名称',
    ORG_TYPE             varchar(32)  null comment '组织性质',
    ORG_INTRODUCTION     text         null comment '简要介绍',
    ORG_LINKMAN_NAME     varchar(32)  null comment '联系人',
    ORG_EMAIL            varchar(32)  null comment '邮箱',
    ORG_CONTACT_WAY      varchar(256) null comment '联系方式',
    ORG_STATE            varchar(32)  null comment '状态',
    ORG_LABELS           varchar(32)  null comment '标签',
    ORG_ADDRESS          varchar(256) null comment '地址',
    ORG_WEBSITE          varchar(128) null comment '公司网站',
    ORG_CREATER          char(36)     null comment '创建人',
    ORG_CREATE_TIME      varchar(32)  null comment '创建时间',
    ORG_UPDATE_TIME      varchar(32)  null comment '更新时间',
    ORG_CLASSIFICATION   varchar(32)  null comment '公司分类',
    ORG_VISIT_AGAIN_TIME varchar(32)  null comment '计划拜访时间',
    CUST_ID              bigint     null comment '客户管理(CRM_CUSTOMER_INFO)',
    ORG_SOURCES          varchar(32)  null comment '来源渠道',
    ORG_SALESMAN         char(36)     null comment '跟进人员'
)comment '潜在客户';

-- auto-generated definition
drop table if exists crm_visit;
create table crm_visit
(
    VISIT_ID            bigint       not null
        primary key comment '主键',
    VISIT_TYPE            varchar(32)    null comment '拜访类型',
    VISIT_CUST_ID         bigint       null comment 'TODO//客户ID-是否是外键，关联哪个表',
    VISIT_RECEPTION_NAME  char(36)       null comment '接待人姓名',
    VISIT_RECEPTION_SEX   varchar(32)    null comment '接待人性别',
    VISIT_RECEPTION_JOB   varchar(32)    null comment '接待人职位',
    VISIT_RECEPTION_PHONE varchar(128)   null comment '接待人电话',
    VISIT_USER_ID         bigint       null comment '拜访人员',
    VISIT_PEER_NAME       varchar(32)    null comment '同行人员',
    VISIT_DATE            datetime       null comment '拜访日期',
    VISIT_CONTENT         varchar(256)   null comment '交互内容',
    VISIT_CUST_FOCUS      varchar(256)   null comment '客户关注点',
    VISIT_EFFECT          varchar(32)    null comment '沟通效果',
    VISIT_IMPROVEMENT     varchar(32)    null comment '待改进情况',
    VISIT_COST            decimal(10, 2) null comment '拜访费用',
    VISIT_COST_EXPLAIN    varchar(256)   null comment '费用说明',
    VISIT_STATE           varchar(32)    null comment '状态',
    VISIT_FILL_ID         bigint       null comment '填写人',
    VISIT_FILL_TIME       datetime       null comment '填写时间',
    VISIT_CONFIRM_ID      bigint       null comment '确认人',
    VISIT_CONFIRM_TIME    datetime       null comment '确认时间'
)comment '拜访记录';