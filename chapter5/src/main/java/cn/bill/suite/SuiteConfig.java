package cn.bill.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("SuiteConfig.beforeSuite 运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("SuiteConfig.afterSuite 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("SuiteConfig.beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("SuiteConfig.afterTest");
    }
}
