package com.itheima.cloud.controller;

import com.itheima.cloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class DeptController {
    @Autowired
    RestTemplate restTemplate;


    private static final String REST_URL_PREFIX = "http://HF-ITHEIMA-CLOUD-PROVIDER";

    @GetMapping(value = "/dept/list")
    public List<Dept> findAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept,
                Boolean.class);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id,
                Dept.class);
    }
}
