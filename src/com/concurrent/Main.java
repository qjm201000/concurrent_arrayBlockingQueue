package com.concurrent;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        //声明队列
        ArrayBlockingQueue queue = new ArrayBlockingQueue(10);

        //生产者
        Producer producer= new Producer(queue);
        producer.start();

        //消费者
        Consumer consumer= new Consumer(queue);
        consumer.start();
    }
}
