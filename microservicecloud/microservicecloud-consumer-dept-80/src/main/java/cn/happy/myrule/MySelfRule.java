package cn.happy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author：  刘涛
 *  自定义ribbon负载均衡的策略
 * @create 2018-11-23 8:53
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myCustomRule(){
        return new RandomRule();
    }
}
