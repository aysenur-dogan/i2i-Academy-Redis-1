package com.i2i.redis;

import redis.clients.jedis.Jedis;

public class App {
    public static void main(String[] args) {

        Jedis jedis = new Jedis("localhost", 6379);

        System.out.println("Redis connection successful.");

        for (int i = 1; i <= 10000; i++) {
            Person person = new Person(i, "Person" + i, 20 + (i % 30));
            jedis.set("person:" + i, person.toJson());
        }

        System.out.println("10,000 Person objects inserted into Redis.");

        System.out.println("Sample records from Redis:");

        for (int i = 1; i <= 5; i++) {
            String value = jedis.get("person:" + i);
            System.out.println("person:" + i + " = " + value);
        }

        jedis.close();
    }
}