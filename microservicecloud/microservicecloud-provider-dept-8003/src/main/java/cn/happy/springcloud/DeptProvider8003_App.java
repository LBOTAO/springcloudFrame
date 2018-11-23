package cn.happy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * author：  刘涛
 *
 * @create 2018-11-17 11:15
 */
@SpringBootApplication
@EnableEurekaClient  //标识eureka client  注册到eureka server
@EnableDiscoveryClient  //服务发现
public class DeptProvider8003_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003_App.class,args);
    }
}
