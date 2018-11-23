package cn.happy.springcloud.controller;

import cn.happy.springcloud.entity.Dept;
import cn.happy.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author：  刘涛
 *
 * @create 2018-11-17 11:08
 */
@RestController
public class DeptController {
    @Autowired
    private IDeptService service;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }


    /**
     * 服务发现
     * @return
     */
    @RequestMapping(value = "/dept/disconver",method = RequestMethod.GET)
    public Object disconver(){
        List<String> list = client.getServices();
        System.out.println("==="+list);
        List<ServiceInstance> serviceInstanceList = client.getInstances("microservicecloud-dept");
        for (ServiceInstance item:serviceInstanceList){
            System.out.println(item.getServiceId()+"\t"+item.getHost()+"\t"+item.getPort()+"\t"+item.getMetadata()+item.getUri());
        }
        return this.client;
    }

}


