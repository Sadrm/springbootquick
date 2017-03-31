package com.quick.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangxc on 2017/3/27.
 */
public class CacheThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 15; i++)
            exec.execute(new MyThread("张"+i));
        exec.shutdown();//并不是终止线程的运行，而是禁止在这个Executor中添加新的任务
    }
}

class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("获取"+name+"的信息并保存");
    }
}
