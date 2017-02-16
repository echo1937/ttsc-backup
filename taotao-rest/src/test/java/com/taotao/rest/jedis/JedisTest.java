package com.taotao.rest.jedis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;

/**
 * Created by Eric on 2/16/17.
 */
public class JedisTest {

    @Test
    public void testJedisSingle() {
        // 创建一个jedis的对象
        Jedis jedis = new Jedis("ttsc-redis", 6379);
        // 调用jedis对象的方法, 方法名称和redis的命令一致
        jedis.set("key1", "jedis test");
        String s = jedis.get("key1");
        System.out.println(s);
        // 关闭jedis
        jedis.close();
    }

    /*
    * 使用连接池
    * */
    @Test
    public void testJedisPool() {
        // 创建jedis连接池
        JedisPool pool = new JedisPool("ttsc-redis", 6379);
        // 从连接池中获得Jedis对象
        Jedis jedis = pool.getResource();
        String s = jedis.get("key1");
        System.out.println(s);
        // 关闭jedis对象
        jedis.close();
        pool.close();
    }

    /**
     * 集群版测试
     */

    @Test
    public void testJedisCluster() {
        HashSet<HostAndPort> nodes = new HashSet<>();
        nodes.add(new HostAndPort("ttsc-redis", 7001));
        JedisCluster cluster = new JedisCluster(nodes);
        cluster.set("key1", "1000");
        String s = cluster.get("key1");
        System.out.println(s);
        // cluster自带连接池
        cluster.close();
    }

    @Test
    public void testSpringJedisSingle() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        JedisPool pool = (JedisPool) applicationContext.getBean("redisClient");
        Jedis jedis = pool.getResource();
        String s = jedis.get("key1");
        System.out.println(s);
        jedis.close();
        pool.close();
    }

    @Test
    public void testSpringJedisCluster() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        JedisCluster jedisCluster = (JedisCluster) applicationContext.getBean("redisClusterClient");
        String s = jedisCluster.get("key1");
        System.out.println(s);
        jedisCluster.close();
    }

}
