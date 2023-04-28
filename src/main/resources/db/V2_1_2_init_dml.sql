-- 菜单 SQL
insert into bus.sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息', '3', '1', 'company', 'module/company/index', 1, 'C', '0', '0', 'ruoyi:company:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '公司信息菜单');


-- 按钮 SQL
insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息查询', 2808, '1',  '#', '', 1,  'F', '0',  '0', 'ruoyi:company:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息新增', 2808, '2',  '#', '', 1,  'F', '0',  '0', 'ruoyi:company:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息修改', 2808, '3',  '#', '', 1,  'F', '0',  '0', 'ruoyi:company:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息删除', 2808, '4',  '#', '', 1,  'F', '0',  '0', 'ruoyi:company:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司信息导出', 2808, '5',  '#', '', 1,  'F', '0',  '0', 'ruoyi:company:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');


-- 菜单 SQL
insert into bus.sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车队信息', '3', '1', 'fleet', 'module/fleet/index', 1, 'C', '0', '0', 'ruoyi:fleet:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '车队信息菜单');



-- 按钮 SQL
insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车队信息查询', 2820, '1',  '#', '', 1,  'F', '0',  '0', 'ruoyi:fleet:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车队信息新增', 2820, '2',  '#', '', 1,  'F', '0',  '0', 'ruoyi:fleet:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车队信息修改', 2820, '3',  '#', '', 1,  'F', '0',  '0', 'ruoyi:fleet:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车队信息删除', 2820, '4',  '#', '', 1,  'F', '0',  '0', 'ruoyi:fleet:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车队信息导出', 2820, '5',  '#', '', 1,  'F', '0',  '0', 'ruoyi:fleet:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');



-- 菜单 SQL
insert into bus.sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('终端信息', '3', '1', 'terminal', 'module/terminal/index', 1, 'C', '0', '0', 'ruoyi:terminal:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '终端信息菜单');


-- 按钮 SQL
insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('终端信息查询', 2814, '1',  '#', '', 1,  'F', '0',  '0', 'ruoyi:terminal:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('终端信息新增', 2814, '2',  '#', '', 1,  'F', '0',  '0', 'ruoyi:terminal:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('终端信息修改', 2814, '3',  '#', '', 1,  'F', '0',  '0', 'ruoyi:terminal:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('终端信息删除', 2814, '4',  '#', '', 1,  'F', '0',  '0', 'ruoyi:terminal:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('终端信息导出', 2814, '5',  '#', '', 1,  'F', '0',  '0', 'ruoyi:terminal:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

-- 菜单 SQL
insert into bus.sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备厂商信息', '3', '1', 'factory', 'module/factory/index', 1, 'C', '0', '0', 'ruoyi:factory:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '设备厂商信息菜单');



-- 按钮 SQL
insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备厂商信息查询', 2826, '1',  '#', '', 1,  'F', '0',  '0', 'ruoyi:factory:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备厂商信息新增', 2826, '2',  '#', '', 1,  'F', '0',  '0', 'ruoyi:factory:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备厂商信息修改', 2826, '3',  '#', '', 1,  'F', '0',  '0', 'ruoyi:factory:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备厂商信息删除', 2826, '4',  '#', '', 1,  'F', '0',  '0', 'ruoyi:factory:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备厂商信息导出', 2826, '5',  '#', '', 1,  'F', '0',  '0', 'ruoyi:factory:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

-- 菜单 SQL
insert into bus.sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('卡号信息', '3', '1', 'Card', 'module/card/index', 1, 'C', '0', '0', 'ruoyi:card:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '卡号信息菜单');



-- 按钮 SQL
insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('卡号信息查询', 2832, '1',  '#', '', 1,  'F', '0',  '0', 'ruoyi:card:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('卡号信息新增', 2832, '2',  '#', '', 1,  'F', '0',  '0', 'ruoyi:card:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('卡号信息修改', 2832, '3',  '#', '', 1,  'F', '0',  '0', 'ruoyi:card:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('卡号信息删除', 2832, '4',  '#', '', 1,  'F', '0',  '0', 'ruoyi:card:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('卡号信息导出', 2832, '5',  '#', '', 1,  'F', '0',  '0', 'ruoyi:card:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');


-- 菜单 SQL
insert into bus.sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('站点信息', '3', '1', 'station', 'module/station/index', 1, 'C', '0', '0', 'ruoyi:station:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '站点信息菜单');

-- 按钮 SQL
insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('站点信息查询', 2838, '1',  '#', '', 1,  'F', '0',  '0', 'ruoyi:station:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('站点信息新增', 2838, '2',  '#', '', 1,  'F', '0',  '0', 'ruoyi:station:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('站点信息修改', 2838, '3',  '#', '', 1,  'F', '0',  '0', 'ruoyi:station:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('站点信息删除', 2838, '4',  '#', '', 1,  'F', '0',  '0', 'ruoyi:station:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('站点信息导出', 2838, '5',  '#', '', 1,  'F', '0',  '0', 'ruoyi:station:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('站点信息导入', 2838, '6',  '#', '', 1,  'F', '0',  '0', 'ruoyi:station:import',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');


-- 菜单 SQL
insert into bus.sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('驾驶员信息', '3', '1', 'driver', 'module/driver/index', 1, 'C', '0', '0', 'ruoyi:driver:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '驾驶员信息菜单');


-- 按钮 SQL
insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('驾驶员信息查询', 2845, '1',  '#', '', 1,  'F', '0',  '0', 'ruoyi:driver:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('驾驶员信息新增', 2845, '2',  '#', '', 1,  'F', '0',  '0', 'ruoyi:driver:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('驾驶员信息修改', 2845, '3',  '#', '', 1,  'F', '0',  '0', 'ruoyi:driver:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('驾驶员信息删除', 2845, '4',  '#', '', 1,  'F', '0',  '0', 'ruoyi:driver:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('驾驶员信息导出', 2845, '5',  '#', '', 1,  'F', '0',  '0', 'ruoyi:driver:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

-- 菜单 SQL
insert into bus.sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('守线员信息', '3', '1', 'guarder', 'module/guarder/index', 1, 'C', '0', '0', 'ruoyi:guarder:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '守线员信息菜单');


-- 按钮 SQL
insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('守线员信息查询', 2851, '1',  '#', '', 1,  'F', '0',  '0', 'ruoyi:guarder:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('守线员信息新增', 2851, '2',  '#', '', 1,  'F', '0',  '0', 'ruoyi:guarder:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('守线员信息修改', 2851, '3',  '#', '', 1,  'F', '0',  '0', 'ruoyi:guarder:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('守线员信息删除', 2851, '4',  '#', '', 1,  'F', '0',  '0', 'ruoyi:guarder:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('守线员信息导出', 2851, '5',  '#', '', 1,  'F', '0',  '0', 'ruoyi:guarder:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');


-- 菜单 SQL
insert into bus.sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('趟检员信息', '3', '1', 'inspector', 'module/inspector/index', 1, 'C', '0', '0', 'ruoyi:inspector:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '趟检员信息菜单');


-- 按钮 SQL
insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('趟检员信息查询', 2857, '1',  '#', '', 1,  'F', '0',  '0', 'ruoyi:inspector:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('趟检员信息新增', 2857, '2',  '#', '', 1,  'F', '0',  '0', 'ruoyi:inspector:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('趟检员信息修改', 2857, '3',  '#', '', 1,  'F', '0',  '0', 'ruoyi:inspector:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('趟检员信息删除', 2857, '4',  '#', '', 1,  'F', '0',  '0', 'ruoyi:inspector:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('趟检员信息导出', 2857, '5',  '#', '', 1,  'F', '0',  '0', 'ruoyi:inspector:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

-- 菜单 SQL
insert into bus.sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车辆信息', '3', '1', 'car', 'module/car/index', 1, 'C', '0', '0', 'ruoyi:car:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '车辆信息菜单');


-- 按钮 SQL
insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车辆信息查询', 2863, '1',  '#', '', 1,  'F', '0',  '0', 'ruoyi:car:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车辆信息新增', 2863, '2',  '#', '', 1,  'F', '0',  '0', 'ruoyi:car:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车辆信息修改', 2863, '3',  '#', '', 1,  'F', '0',  '0', 'ruoyi:car:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车辆信息删除', 2863, '4',  '#', '', 1,  'F', '0',  '0', 'ruoyi:car:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into bus.sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('车辆信息导出', 2863, '5',  '#', '', 1,  'F', '0',  '0', 'ruoyi:car:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');





