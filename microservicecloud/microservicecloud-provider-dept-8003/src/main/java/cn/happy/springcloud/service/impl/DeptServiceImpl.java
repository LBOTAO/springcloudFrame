package cn.happy.springcloud.service.impl;

import cn.happy.springcloud.dao.IDeptDAO;
import cn.happy.springcloud.entity.Dept;
import cn.happy.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author：  刘涛
 *
 * @create 2018-11-17 11:02
 */
@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private IDeptDAO dao;


    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
