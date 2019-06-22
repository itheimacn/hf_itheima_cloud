package com.itheima.cloud.service;

import com.itheima.cloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
