package cn.bill;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Test这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Test这是测试用例2");
    }
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("afterMethod");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("afterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BasicAnnotation.beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("BasicAnnotation.afterSuite");
    }

    //忽略测试执行 enabled = true 测试执行，false 忽略执行
    @Test(enabled = false)
    public void ignore(){
        System.out.println("BasicAnnotation.ignore 忽略执行");
    }
}
