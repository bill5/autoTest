package cn.bill.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*参数测试*/
public class ParamterTest {

    @Test
    @Parameters({"name","age"})/*参数声明*/
    public void paramTest1(String name,int age){
        System.out.println("ParamterTest.paramTest1 name = " + name + " age = " + age );
    }
}
