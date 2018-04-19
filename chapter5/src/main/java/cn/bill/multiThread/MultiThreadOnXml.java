package cn.bill.multiThread;

import org.testng.annotations.Test;

/*配置文件多线程测试*/
public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("test1 Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("test2 Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("test3 Thread Id : %s%n",Thread.currentThread().getId());
    }
}
