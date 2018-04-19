package cn.bill;

import org.testng.annotations.Test;

/*依赖测试*/
public class DependTest {

    @Test
    public void test1(){
        System.out.println("DependTest.test1");
        throw new RuntimeException();
    }

    /*依赖 test1,test2 会被依赖*/
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("DependTest.test2");
    }
}
