package cn.happy.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * author：  刘涛
 *
 * @create 2018-11-17 11:55
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced   /*ribbon客户端的负载均衡*/
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /*@Bean
    public IRule customeLoadBalanced(){
        return new RetryRule();
    }*/
}
