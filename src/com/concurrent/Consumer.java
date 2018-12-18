package com.concurrent;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 消费者
 */
public class Consumer extends Thread{
    private ArrayBlockingQueue<Object> queue;
    public Consumer(ArrayBlockingQueue queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while(true){
            try {
                Object obj = queue.take();
                System.out.println("consumer:"+obj);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
