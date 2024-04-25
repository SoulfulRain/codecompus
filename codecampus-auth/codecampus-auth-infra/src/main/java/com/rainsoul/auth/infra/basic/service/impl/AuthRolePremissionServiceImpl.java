package com.rainsoul.auth.infra.basic.service.impl;

import com.rainsoul.auth.infra.basic.dao.AuthRolePremissionDao;
import com.rainsoul.auth.infra.basic.entity.AuthRolePermission;
import com.rainsoul.auth.infra.basic.service.AuthRolePremissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (AuthRolePremission)表服务实现类
 *
 * @author makejava
 * @since 2024-04-25 19:02:51
 */
@Service("authRolePremissionService")
public class AuthRolePremissionServiceImpl implements AuthRolePremissionService {
    @Resource
    private AuthRolePremissionDao authRolePremissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuthRolePermission queryById(Long id) {
        return this.authRolePremissionDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param authRolePremission 实例对象
     * @return 实例对象
     */
    @Override
    public AuthRolePermission insert(AuthRolePermission authRolePremission) {
        this.authRolePremissionDao.insert(authRolePremission);
        return authRolePremission;
    }

    /**
     * 修改数据
     *
     * @param authRolePremission 实例对象
     * @return 实例对象
     */
    @Override
    public AuthRolePermission update(AuthRolePermission authRolePremission) {
        this.authRolePremissionDao.update(authRolePremission);
        return this.queryById(authRolePremission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.authRolePremissionDao.deleteById(id) > 0;
    }
}