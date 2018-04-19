package cn.bill.multiThread;

import org.testng.annotations.Test;
/*多线程测试*/
public class MultiThreadOnAnnotation {

    @Test(invocationCount = 10,threadPoolSize = 10)/*invocationCount 线程个数  threadPoolSize 线程池个数*/
    public void test1(){
        System.out.println("MultiThreadOnAnnotation.test1");
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
