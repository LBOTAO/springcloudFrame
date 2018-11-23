package cn.happy.springcloud.controller;

import cn.happy.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * author：  刘涛
 *
 * @create 2018-11-17 12:19
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private RestTemplate restTemplate;
    /**
     * (url, requestMap, ResponseBean.class)这三个参数分别代表 
     REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。

     */

    //private final static String REST_URL_PREFIX="http://localhost:8001";

    //ribbon和eureka整合后consumer可以直接调用服务而不用关心地址和端口号
    private final static String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";
    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept ,Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
    @RequestMapping(value = "/consumer/dept/disconver")
    public Object disconver(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/disconver",Object.class);
    }
}
