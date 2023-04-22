-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息', '3', '1', 'company', 'ruoyi/company/index', 1, 'C', '0', '0', 'ruoyi:company:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '公司信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息查询', @parentId, '1',  '#', '', 1,  'F', '0',  '0', 'ruoyi:company:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息新增', @parentId, '2',  '#', '', 1,  'F', '0',  '0', 'ruoyi:company:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息修改', @parentId, '3',  '#', '', 1,  'F', '0',  '0', 'ruoyi:company:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息删除', @parentId, '4',  '#', '', 1,  'F', '0',  '0', 'ruoyi:company:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息导出', @parentId, '5',  '#', '', 1,  'F', '0',  '0', 'ruoyi:company:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
