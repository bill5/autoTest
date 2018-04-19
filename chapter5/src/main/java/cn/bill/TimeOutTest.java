package cn.bill;

import org.testng.annotations.Test;
/*超时测试*/
public class TimeOutTest {

    @Test(timeOut = 3000)/*单位为毫秒值*/
    public void testSucess() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("TimeOutTest.testSucess 未超时");
    }

    @Test(timeOut = 3000)/*单位为毫秒值*/
    public void testFail() throws InterruptedException{
        Thread.sleep(4000);
        System.out.println("TimeOutTest.testFail 超时");
    }
}
