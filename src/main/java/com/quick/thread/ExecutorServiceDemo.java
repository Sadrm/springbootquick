package com.quick.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by wangxc on 2017/3/29.
 */
public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long stat = System.currentTimeMillis();
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<TaskSleep> callList = new ArrayList<TaskSleep>();
        for(int i=0;i<10;i++){
            callList.add(new TaskSleep(i));
        }
        List<Future<Integer>> futures = executorService.invokeAll(callList);
        executorService.shutdown();
        int sum=0;
        for(Future<Integer> item:futures){
            sum += item.get();
        }
        System.out.println("结果"+sum);
        long end = System.currentTimeMillis();
        System.out.println((double)(end-stat)/1000);
    }
}
