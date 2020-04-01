-- 插入权限
INSERT INTO mt_sys_authority (`id`, `created_by`, `created_time`, `filter_path`, `last_modified_by`, `last_modified_time`, `code`, `name`, `type`)
SELECT IFNULL(MAX(id),0) + 1, '1', SYSDATE(), '1-19-137616697988354048-', '1', SYSDATE(), 'AUTHORITY_CREATE', '创建权限', '权限管理' FROM mt_sys_authority;
