package com.itheima.cloud.mapper;

import com.itheima.cloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
