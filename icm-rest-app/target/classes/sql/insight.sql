-- 权限点
-- 多维分析 start ------------------------------------------------------------------------------------------------
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (440, 1, SYSDATE(), '1-', 1, SYSDATE(), 'DATA_INSIGHT_RETRIEVE', '查询多维分析', '多维分析管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (441, 1, SYSDATE(), '1-', 1, SYSDATE(), 'DATA_INSIGHT_CREATE', '新建多维分析', '多维分析管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (442, 1, SYSDATE(), '1-', 1, SYSDATE(), 'DATA_INSIGHT_UPDATE', '更新多维分析', '多维分析管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (443, 1, SYSDATE(), '1-', 1, SYSDATE(), 'DATA_INSIGHT_DELETE', '删除多维分析', '多维分析管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (444, 1, SYSDATE(), '1-', 1, SYSDATE(), 'DATA_PIVOT_RETRIEVE', '查询即席综合查询', '即席综合查询管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (445, 1, SYSDATE(), '1-', 1, SYSDATE(), 'DATA_PIVOT_UPDATE', '更新即席综合查询', '即席综合查询管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (446, 1, SYSDATE(), '1-', 1, SYSDATE(), 'DATA_PIVOT_CREATE', '新增即席综合查询', '即席综合查询管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (447, 1, SYSDATE(), '1-', 1, SYSDATE(), 'DATA_PIVOT_DELETE', '删除即席综合查询', '即席综合查询管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (448, 1, SYSDATE(), '1-', 1, SYSDATE(), 'OLAP_DATASOURCE_JDBC_RETRIEVE', '查询JDBC数据源', 'JDBC数据源管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (449, 1, SYSDATE(), '1-', 1, SYSDATE(), 'OLAP_DATASOURCE_JDBC_CREATE', '新建JDBC数据源', 'JDBC数据源管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (450, 1, SYSDATE(), '1-', 1, SYSDATE(), 'OLAP_DATASOURCE_JDBC_UPDATE', '更新JDBC数据源', 'JDBC数据源管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (451, 1, SYSDATE(), '1-', 1, SYSDATE(), 'OLAP_DATASOURCE_JDBC_DELETE', '删除JDBC数据源', 'JDBC数据源管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (452, 1, SYSDATE(), '1-', 1, SYSDATE(), 'OLAP_DATASET_RETRIEVE', '查询数据集', '数据集管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (453, 1, SYSDATE(), '1-', 1, SYSDATE(), 'OLAP_DATASET_CREATE', '新建数据集', '数据集管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (454, 1, SYSDATE(), '1-', 1, SYSDATE(), 'OLAP_DATASET_UPDATE', '更新数据集', '数据集管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (455, 1, SYSDATE(), '1-', 1, SYSDATE(), 'OLAP_DATASET_DELETE', '删除数据集', '数据集管理');
INSERT INTO `mt_sys_authority`(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`) VALUES (456, 1, SYSDATE(), '1-', 1, SYSDATE(), 'OLAP_DATASOURCE_FILE_IMPORT', '数据源上传文件', '本地数据源管理');

INSERT INTO mt_sys_authority ( `id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type` ) SELECT IFNULL( MAX( id ), 0 ) + 1,'1',SYSDATE(),'','1',SYSDATE(),'DATA_TAG_RETRIEVE','分页查询标签信息','标签管理接口' FROM mt_sys_authority;
INSERT INTO mt_sys_authority ( `id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type` ) SELECT IFNULL( MAX( id ), 0 ) + 1,'1',SYSDATE(),'','1',SYSDATE(),'CACHE_CLEAR','清空后台所有的缓存','全局参数配置' FROM mt_sys_authority;
INSERT INTO mt_sys_authority ( `id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type` ) SELECT IFNULL( MAX( id ), 0 ) + 1,'1',SYSDATE(),'','1',SYSDATE(),'OLAP_CACHE_CLEAR','清空OLAP缓存','全局参数配置' FROM mt_sys_authority;

-- 公共目录树管理权限 start ------------------------------------------------------------------------------------------------
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (468,'COMM_CATEGORY_RETRIEVE', '查看公共目录树', '公共目录树管理','1', NOW(), '1', NOW());
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (469,'COMM_CATEGORY_CREATE', '创建公共目录树', '公共目录树管理','1', NOW(), '1', NOW());
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (470,'COMM_CATEGORY_UPDATE', '修改公共目录树', '公共目录树管理','1', NOW(), '1', NOW());
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (471,'COMM_CATEGORY_DELETE', '删除公共目录树', '公共目录树管理','1', NOW(), '1', NOW());
-- 公共目录树管理权限 end ------------------------------------------------------------------------------------------------

-- 资源权限 start ------------------------------------------------------------------------------------------------
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (472,'DATA_RESOURCE_CREATE', '创建资源', '资源管理','1', NOW(), '1', NOW());
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (473,'DATA_RESOURCE_UPDATE', '修改资源', '资源管理','1', NOW(), '1', NOW());
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (474,'DATA_RESOURCE_DELETE', '删除资源', '资源管理','1', NOW(), '1', NOW());
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (475,'DATA_RESOURCE_RETRIEVE', '查询资源', '资源管理','1', NOW(), '1', NOW());

INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (476,'DATA_RESOURCE_AUTHORITY_RETRIEVE', '查询资源授权', '资源授权管理','1', NOW(), '1', NOW());
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (477,'DATA_RESOURCE_AUTHORITY_UPDATE', '修改资源授权', '资源授权管理','1', NOW(), '1', NOW());
-- 资源权限 end ----------------------------------------------------------------------------------------------

INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (478,'ALARM_FUNCTION_CREATE', '创建预警函数', '预警函数管理','1', NOW(), '1', NOW());
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (479,'ALARM_FUNCTION_UPDATE', '修改预警函数', '预警函数管理','1', NOW(), '1', NOW());
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (480,'ALARM_FUNCTION_DELETE', '删除预警函数', '预警函数管理','1', NOW(), '1', NOW());
INSERT INTO mt_sys_authority(id,CODE, NAME, TYPE,  created_by, created_time, last_modified_by, last_modified_time)
VALUES (481,'ALARM_FUNCTION_RETRIEVE', '查询预警函数', '预警函数管理','1', NOW(), '1', NOW());

-- 菜单显示权限 start
insert into mt_sys_authority(id,code, name, type, created_by, created_time, last_modified_by, last_modified_time)
values(457,'DATA_MANAGE', '数据管理', '菜单显示', '1', NOW(), '1', NOW());

insert into mt_sys_authority(id,code, name, type, created_by, created_time, last_modified_by, last_modified_time)
values(458,'MODEL_KPI_MANAGE', '模型指标构建', '菜单显示', '1', NOW(), '1', NOW());
insert into mt_sys_authority(id,code, name, type, created_by, created_time, last_modified_by, last_modified_time)
values(459,'RESOURCE_MANAGE', '资源管理', '菜单显示', '1', NOW(), '1', NOW());

insert into mt_sys_authority(id,code, name, type, created_by, created_time, last_modified_by, last_modified_time)
values(460,'PANEL_EDIT', '多维自助分析', '菜单显示', '1', NOW(), '1', NOW());
insert into mt_sys_authority(id,code, name, type, created_by, created_time, last_modified_by, last_modified_time)
values(461,'INSIGHT_MANAGER', '多维分析模型', '菜单显示', '1', NOW(), '1', NOW());
insert into mt_sys_authority(id,code, name, type, created_by, created_time, last_modified_by, last_modified_time)
values(462,'PIVOT_MANAGER', '综合查询模型', '菜单显示', '1', NOW(), '1', NOW());
insert into mt_sys_authority(id,code, name, type, created_by, created_time, last_modified_by, last_modified_time)
values(463,'ALARM_FUNCTION', '函数指标构建', '菜单显示', '1', NOW(), '1', NOW());

insert into mt_sys_authority(id,code, name, type, created_by, created_time, last_modified_by, last_modified_time)
values(464,'DATA_SOURCE', '数据源管理', '菜单显示', '1', NOW(), '1', NOW());
insert into mt_sys_authority(id,code, name, type, created_by, created_time, last_modified_by, last_modified_time)
values(465,'DATA_SET', '数据集管理', '菜单显示', '1', NOW(), '1', NOW());
insert into mt_sys_authority(id,code, name, type, created_by, created_time, last_modified_by, last_modified_time)
values(466,'INSIGHT_RESOURCE_DIRECTORY', '数据目录管理', '菜单显示', '1', NOW(), '1', NOW());
insert into mt_sys_authority(id,code, name, type, created_by, created_time, last_modified_by, last_modified_time)
values(467,'INSIGHT_RESOURCE_AUTHORITY', '数据资源权限', '菜单显示', '1', NOW(), '1', NOW());
-- 菜单显示权限 end

-- 多维分析 end ------------------------------------------------------------------------------------------------

-- 初始化资源数据 start
-- 插入 数据集 的自定义顶级节点  备注：因为是父子结构，所以需要写死一个id  ,方便子节点获取
INSERT INTO mt_data_resource(filter_path, tree_path,tree_level,show_order,resource_root_default_type,id, parent_id, description, resource_code, resource_name, resource_type, resource_path,  source_name, created_time, last_modified_time)
 VALUES ('1-', '',1,1,'DATASET',3, NULL, NULL, '1-2-3', '数据集资源', 'FOLDER', NULL, '数据集资源', NOW(), NOW());

-- 插入 多维分析模型资源 的自定义顶级节点  备注：因为是父子结构，所以需要写死一个id  ,方便子节点获取
INSERT INTO mt_data_resource(filter_path, tree_path,tree_level,show_order,resource_root_default_type,id, parent_id, description, resource_code, resource_name, resource_type, resource_path,  source_name, created_time, last_modified_time)
 VALUES ('1-', '',1,1,'DATA_INSIGHT',4, NULL, NULL, '1-2-3', '多维分析模型', 'FOLDER', NULL, '多维分析模型', NOW(), NOW());

-- 插入 综合查询模型资源的  自定义顶级节点  备注：因为是父子结构，所以需要写死一个id  ,方便子节点获取
INSERT INTO mt_data_resource(filter_path, tree_path,tree_level,show_order,resource_root_default_type,id, parent_id, description, resource_code, resource_name, resource_type, resource_path,  source_name, created_time, last_modified_time)
 VALUES ('1-', '',1,1,'DATA_PIVOT',5, NULL, NULL, '1-2-3', '综合查询模型', 'FOLDER', NULL, '综合查询模型', NOW(), NOW());

-- 插入 智能审查资源  的自定义顶级节点  备注：因为是父子结构，所以需要写死一个id  ,方便子节点获取
INSERT INTO mt_data_resource(filter_path, tree_path,tree_level,show_order,resource_root_default_type,id, parent_id, description, resource_code, resource_name, resource_type, resource_path,  source_name, created_time, last_modified_time)
 VALUES ('1-', '',1,1,'INTELLIGENT',6, NULL, NULL, '1-2-3', '智能审查', 'FOLDER', NULL, '智能审查', NOW(), NOW());

-- 插入 自定义平台服务资源  的自定义顶级节点  备注：因为是父子结构，所以需要写死一个id  ,方便子节点获取  start ===================
INSERT INTO mt_data_resource(filter_path, tree_path,tree_level,show_order,resource_root_default_type,id, parent_id, description, resource_code, resource_name, resource_type, resource_path,  source_name, created_time, last_modified_time)
 VALUES ('1-', '',1,1,'SERVICE',7, NULL, NULL, '1-2-3', '平台服务', 'FOLDER', NULL, '平台服务', NOW(), NOW());

INSERT INTO mt_data_resource(filter_path, tree_path,tree_level,show_order,resource_root_default_type,id, parent_id, description, resource_code, resource_name, resource_type, resource_path,  source_name, created_time, last_modified_time)
 VALUES ('1-', '',1,1,'SERVICE',100, 7, '根据传入参数查找出报表定义与年份并在路由界面中展示', '1-2-3', '报表展示', 'SERVICE', '/exam/report/preview', '报表展示', NOW(), NOW());
-- 插入 自定义平台服务资源  的自定义顶级节点  备注：因为是父子结构，所以需要写死一个id  ,方便子节点获取  end ===================

-- 初始化资源数据 end
-- 多维分析菜单
INSERT INTO mt_sys_menu(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `show_order`, `tree_level`, `tree_path`, `acl`, `external_link`, `is_group_name`, `is_hide`, `is_hide_in_breadcrumb`, `i18n`, `icon_theme`, `icon`, `link`, `is_link_exact`, `is_menu_group`, `link_target`, `name`, `remark`, `is_reuse`, `is_shortcut`, `is_shortcut_root`, `parent_id`, `is_children_interface`, `mobile_terminal_sort`, `is_mobile_terminal`, `resource_id`, `resource_type`, `skip_mode`) VALUES (24, 1, now(), '1-', 1, now(), 95, 2, '15-24-', 'DATA_MANAGE', NULL, true, false, false, NULL, 'outline', 'bar-chart', NULL, false, true, 'SELF', '数据管理', NULL, true, false, false, 15, false, 'HORIZONTAL', false, '', NULL, 'DROPDOWN');
INSERT INTO mt_sys_menu(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `show_order`, `tree_level`, `tree_path`, `acl`, `external_link`, `is_group_name`, `is_hide`, `is_hide_in_breadcrumb`, `i18n`, `icon_theme`, `icon`, `link`, `is_link_exact`, `is_menu_group`, `link_target`, `name`, `remark`, `is_reuse`, `is_shortcut`, `is_shortcut_root`, `parent_id`, `is_children_interface`, `mobile_terminal_sort`, `is_mobile_terminal`, `resource_id`, `resource_type`, `skip_mode`) VALUES (37, 1, now(), '1-', 1, now(), 2, 3, '15-24-37-', 'MODEL_KPI_MANAGE', NULL, true, false, false, NULL, 'outline', 'area-chart', NULL, false, true, 'SELF', '模型指标构建', NULL, true, false, false, 24, true, 'HORIZONTAL', false, '', NULL, 'DROPDOWN');
INSERT INTO mt_sys_menu(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `show_order`, `tree_level`, `tree_path`, `acl`, `external_link`, `is_group_name`, `is_hide`, `is_hide_in_breadcrumb`, `i18n`, `icon_theme`, `icon`, `link`, `is_link_exact`, `is_menu_group`, `link_target`, `name`, `remark`, `is_reuse`, `is_shortcut`, `is_shortcut_root`, `parent_id`, `is_children_interface`, `mobile_terminal_sort`, `is_mobile_terminal`, `resource_id`, `resource_type`, `skip_mode`) VALUES (38, 1, now(), '1-', 1, now(), 30, 4, '15-24-37-38-', 'PIVOT_MANAGER', NULL, true, false, false, NULL, 'outline', '', '/insight/data-pivot/pivot-manager', false, false, 'SELF', '综合查询模型', NULL, true, false, false, 37, false, 'HORIZONTAL', false, '', NULL, 'DROPDOWN');
INSERT INTO mt_sys_menu(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `show_order`, `tree_level`, `tree_path`, `acl`, `external_link`, `is_group_name`, `is_hide`, `is_hide_in_breadcrumb`, `i18n`, `icon_theme`, `icon`, `link`, `is_link_exact`, `is_menu_group`, `link_target`, `name`, `remark`, `is_reuse`, `is_shortcut`, `is_shortcut_root`, `parent_id`, `is_children_interface`, `mobile_terminal_sort`, `is_mobile_terminal`, `resource_id`, `resource_type`, `skip_mode`) VALUES (39, 1, now(), '1-', 1, now(), 20, 4, '15-24-37-39-', 'INSIGHT_MANAGER', NULL, true, false, false, NULL, 'outline', '', '/insight/data-insight/insight-manager', false, false, 'SELF', '多维分析模型', NULL, true, false, false, 37, false, 'HORIZONTAL', false, '', NULL, 'DROPDOWN');
INSERT INTO mt_sys_menu(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `show_order`, `tree_level`, `tree_path`, `acl`, `external_link`, `is_group_name`, `is_hide`, `is_hide_in_breadcrumb`, `i18n`, `icon_theme`, `icon`, `link`, `is_link_exact`, `is_menu_group`, `link_target`, `name`, `remark`, `is_reuse`, `is_shortcut`, `is_shortcut_root`, `parent_id`, `is_children_interface`, `mobile_terminal_sort`, `is_mobile_terminal`, `resource_id`, `resource_type`, `skip_mode`) VALUES (118, 1, now(), '1-', 1, now(), 10, 4, '15-24-37-118-', 'PANEL_EDIT', NULL, true, false, false, NULL, 'outline', '', '/insight/data-insight/panel-edit', false, false, 'SELF', '多维自助分析', NULL, true, false, false, 37, false, 'HORIZONTAL', false, '', '', 'DROPDOWN');
INSERT INTO mt_sys_menu(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `show_order`, `tree_level`, `tree_path`, `acl`, `external_link`, `is_group_name`, `is_hide`, `is_hide_in_breadcrumb`, `i18n`, `icon_theme`, `icon`, `link`, `is_link_exact`, `is_menu_group`, `link_target`, `name`, `remark`, `is_reuse`, `is_shortcut`, `is_shortcut_root`, `parent_id`, `is_children_interface`, `mobile_terminal_sort`, `is_mobile_terminal`, `resource_id`, `resource_type`, `skip_mode`) VALUES (105, 1, now(), '1-', 1, now(), 40, 4, '15-24-37-105-', 'ALARM_FUNCTION', NULL, true, false, false, NULL, 'outline', '', '/alarm/alarm-function', false, false, 'SELF', '函数指标构建', NULL, true, false, false, 37, false, 'HORIZONTAL', false, '', '', 'DROPDOWN');
INSERT INTO mt_sys_menu(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `show_order`, `tree_level`, `tree_path`, `acl`, `external_link`, `is_group_name`, `is_hide`, `is_hide_in_breadcrumb`, `i18n`, `icon_theme`, `icon`, `link`, `is_link_exact`, `is_menu_group`, `link_target`, `name`, `remark`, `is_reuse`, `is_shortcut`, `is_shortcut_root`, `parent_id`, `is_children_interface`, `mobile_terminal_sort`, `is_mobile_terminal`, `resource_id`, `resource_type`, `skip_mode`) VALUES (32, 1, now(), '1-', 1, now(), 3, 3, '15-24-32-', 'RESOURCE_MANAGE', NULL, true, false, false, NULL, 'outline', 'snippets', NULL, false, true, 'SELF', '资源管理', NULL, true, false, false, 24, true, 'HORIZONTAL', false, '', NULL, 'DROPDOWN');
INSERT INTO mt_sys_menu(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `show_order`, `tree_level`, `tree_path`, `acl`, `external_link`, `is_group_name`, `is_hide`, `is_hide_in_breadcrumb`, `i18n`, `icon_theme`, `icon`, `link`, `is_link_exact`, `is_menu_group`, `link_target`, `name`, `remark`, `is_reuse`, `is_shortcut`, `is_shortcut_root`, `parent_id`, `is_children_interface`, `mobile_terminal_sort`, `is_mobile_terminal`, `resource_id`, `resource_type`, `skip_mode`) VALUES (33, 1, now(), '1-', 1, now(), 1, 4, '15-24-32-33-', 'DATA_SOURCE', NULL, true, false, false, NULL, 'outline', '', '/insight/data-source', false, false, 'SELF', '数据源管理', NULL, true, false, false, 32, false, 'HORIZONTAL', false, '', NULL, 'DROPDOWN');
INSERT INTO mt_sys_menu(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `show_order`, `tree_level`, `tree_path`, `acl`, `external_link`, `is_group_name`, `is_hide`, `is_hide_in_breadcrumb`, `i18n`, `icon_theme`, `icon`, `link`, `is_link_exact`, `is_menu_group`, `link_target`, `name`, `remark`, `is_reuse`, `is_shortcut`, `is_shortcut_root`, `parent_id`, `is_children_interface`, `mobile_terminal_sort`, `is_mobile_terminal`, `resource_id`, `resource_type`, `skip_mode`) VALUES (34, 1, now(), '1-', 1, now(), 1, 4, '15-24-32-34-', 'DATA_SET', NULL, true, false, false, NULL, 'outline', '', '/insight/data-set', false, false, 'SELF', '数据集管理', NULL, true, false, false, 32, false, 'HORIZONTAL', false, '', NULL, 'DROPDOWN');
INSERT INTO mt_sys_menu(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `show_order`, `tree_level`, `tree_path`, `acl`, `external_link`, `is_group_name`, `is_hide`, `is_hide_in_breadcrumb`, `i18n`, `icon_theme`, `icon`, `link`, `is_link_exact`, `is_menu_group`, `link_target`, `name`, `remark`, `is_reuse`, `is_shortcut`, `is_shortcut_root`, `parent_id`, `is_children_interface`, `mobile_terminal_sort`, `is_mobile_terminal`, `resource_id`, `resource_type`, `skip_mode`) VALUES (35, 1, now(), '1-', 1, now(), 3, 4, '15-24-32-35-', 'INSIGHT_RESOURCE_DIRECTORY', NULL, true, false, false, NULL, 'outline', '', '/base-data/resource-directory', false, false, 'SELF', '数据目录管理', NULL, true, false, false, 32, false, 'HORIZONTAL', false, '', NULL, 'DROPDOWN');
INSERT INTO mt_sys_menu(`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `show_order`, `tree_level`, `tree_path`, `acl`, `external_link`, `is_group_name`, `is_hide`, `is_hide_in_breadcrumb`, `i18n`, `icon_theme`, `icon`, `link`, `is_link_exact`, `is_menu_group`, `link_target`, `name`, `remark`, `is_reuse`, `is_shortcut`, `is_shortcut_root`, `parent_id`, `is_children_interface`, `mobile_terminal_sort`, `is_mobile_terminal`, `resource_id`, `resource_type`, `skip_mode`) VALUES (36, 1, now(), '1-', 1, now(), 5, 4, '15-24-32-36-', 'INSIGHT_RESOURCE_AUTHORITY', NULL, true, false, false, NULL, 'outline', '', '/base-data/resource-authority', false, false, 'SELF', '数据资源权限', NULL, true, false, false, 32, false, 'HORIZONTAL', false, '', NULL, 'DROPDOWN');
