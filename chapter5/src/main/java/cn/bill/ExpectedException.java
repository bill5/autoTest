package cn.bill;

import org.testng.annotations.Test;

/*异常测试*/
public class ExpectedException {
    /*
    * 什么时候会用到异常测试
    * 在我们期望结果为某一个异常的时候
    * 比如：我们传入了某些不合法的参数，程序抛了异常
    * 也就是说我的预期结果就是这个异常
    * */

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("ExpectedException.runTimeExceptionFailed");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("ExpectedException.runTimeExceptionSuccess");
        throw new RuntimeException();
    }
}
