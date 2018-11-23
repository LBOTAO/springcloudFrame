package cn.happy.springcloud.service;

import cn.happy.springcloud.entity.Dept;

import java.util.List;

/**
 * author：  刘涛
 *
 * @create 2018-11-17 11:00
 */
public interface IDeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();

}
