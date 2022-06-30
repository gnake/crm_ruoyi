
#潜在客户表
drop table if exists CRM_ORG_INFO;
create table if not exists CRM_ORG_INFO
(
    ORG_ID               bigint
        primary key comment '主键',
    ORG_NAME             varchar(32)   comment '组织名称',
    ORG_TYPE             varchar(32)  comment '组织性质',
    ORG_INTRODUCTION     text          comment '简要介绍',
    ORG_LINKMAN_NAME     varchar(32)  comment '联系人',
    ORG_EMAIL            varchar(32)  comment '邮箱',
    ORG_CONTACT_WAY      varchar(256) comment '联系方式',
    ORG_STATE            varchar(32) comment '状态',
    ORG_LABELS           varchar(32)  comment '标签，0表未标记，1表已标记，2表无人接听，3表号码信息不符，4表空号，5表暂停服务，6表暂无需求，7表后续联系，8表态度恶劣',
    ORG_ADDRESS          varchar(256) comment '地址',
    ORG_WEBSITE          varchar(128) comment '公司网站',
    ORG_CREATER          char(36)      comment '创建人',
    ORG_CREATE_TIME      varchar(32)  comment '创建时间',
    ORG_UPDATE_TIME      varchar(32)   comment '更新时间',
    ORG_CLASSIFICATION   varchar(32)   comment '公司分类',
    ORG_VISIT_AGAIN_TIME varchar(32)   comment '计划拜访时间',
    CUST_ID              bigint     comment '客户管理(CRM_CUSTOMER_INFO)',
    ORG_SOURCES          varchar(32)   comment '来源渠道',
    ORG_SALESMAN         char(36)     comment '跟进人员',
    ORG_CLASSIFY         int(1)     comment '分类，0表示其他，1表企业实体，2表软件开发商，3表软件代理商，4表系统集成商',
)DEFAULT CHARSET = utf8mb4 comment '潜在客户';

#拜访记录表
drop table if exists CRM_VISIT;
create table if not exists CRM_VISIT
(
    VISIT_ID            bigint
        primary key comment '主键',
    VISIT_TYPE            varchar(32)     comment '拜访类型',
    VISIT_CUST_ID         bigint        comment 'TODO客户ID-是否是外键，关联哪个表',
    VISIT_RECEPTION_NAME  char(36)        comment '接待人姓名',
    VISIT_RECEPTION_SEX   varchar(32)     comment '接待人性别',
    VISIT_RECEPTION_JOB   varchar(32)    comment '接待人职位',
    VISIT_RECEPTION_PHONE varchar(128)   comment '接待人电话',
    VISIT_USER_ID         bigint       comment '拜访人员',
    VISIT_PEER_NAME       varchar(32)    comment '同行人员',
    VISIT_DATE            datetime        comment '拜访日期',
    VISIT_CONTENT         varchar(256)   comment '交互内容',
    VISIT_CUST_FOCUS      varchar(256)    comment '客户关注点',
    VISIT_EFFECT          varchar(32)    comment '沟通效果',
    VISIT_IMPROVEMENT     varchar(32)     comment '待改进情况',
    VISIT_COST            decimal(10, 2)  comment '拜访费用',
    VISIT_COST_EXPLAIN    varchar(256)    comment '费用说明',
    VISIT_STATE           varchar(32)     comment '状态，1表示正在拜访，0表示没有拜访',
    VISIT_FILL_ID         bigint      comment '填写人',
    VISIT_FILL_TIME       datetime      comment '填写时间',
    VISIT_CONFIRM_ID      bigint       comment '确认人',
    VISIT_CONFIRM_TIME    datetime       comment '确认时间'
)DEFAULT CHARSET = utf8mb4 comment '拜访记录';