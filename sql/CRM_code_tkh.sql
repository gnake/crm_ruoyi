DROP TABLE IF EXISTS `CRM_SYS_CODETYPE`;
CREATE TABLE  IF NOT EXISTS CRM_SYS_CODETYPE
(
    TYPE_ID      bigint primary key comment '主键',
    TYPE_IDENT   varchar(32) comment '类型标识',
    TYPE_NAME    varchar(32) comment '类型名称',
    TYPE_GROUP   varchar(32) comment '类型分组',
    IS_EDITABLE  int(1) comment '是否可编辑',
    IS_EFFECTIVE int(1) comment '是否失效',
    IS_EXTEND    int(1) comment '是否SQL扩展'
    ) COMMENT '编码类型'
    DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `CRM_SYS_CODELIST`;
CREATE TABLE IF NOT EXISTS CRM_SYS_CODELIST
(
    CODE_ID    bigint primary key comment '主键',
    TYPE_ID    bigint comment '编码标识,关联SYS_CODETYPE',
    CODE_VALUE varchar(36) comment '编码值',
    CODE_SORT  int(11) comment '编码排序'
    ) COMMENT '编码管理'
    DEFAULT CHARSET = utf8mb4;