package com.concurrent;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 生产者
 */
public class Producer extends Thread{
    private ArrayBlockingQueue<Object> queue;
    public Producer(ArrayBlockingQueue queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while(true){
            Object obj = new Object();
            try {
                queue.put(obj);
                System.out.println("producer:"+obj);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
