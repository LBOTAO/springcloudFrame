package cn.happy.springcloud.dao;

import cn.happy.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author：  刘涛
 *
 * @create 2018-11-17 10:51
 */
@Mapper
public interface IDeptDAO {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
