package com.itheima.cloud.contorller;

import com.itheima.cloud.pojo.Dept;
import com.itheima.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;
    @PostMapping(value="/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }
    @GetMapping(value="/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id1) {
        return service.get(id1);
    }
    @GetMapping(value="/dept/list")
    public List<Dept> list() {
        return service.list();
    }
}
