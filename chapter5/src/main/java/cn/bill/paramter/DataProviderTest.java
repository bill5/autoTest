package cn.bill.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")/*参数传递*/
    public void dataProviderTest(String name,int age){
        System.out.println("DataProviderTest.dataProviderTest name = " + name + " age = " + age);
    }

    /*构造参数*/
    @DataProvider(name = "data") /*数组运行n次*/
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsam",10},
                {"lisi",19},
                {"wangwu",18}
        };
        return o;
    }

    /*每个测试获取特定的数据*/
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("DataProviderTest.test1 name = " + name + " age = " + age);
    }

    /*每个测试获取特定的数据*/
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("DataProviderTest.test2 name = " + name + " age = " + age);
    }

    /*根据方法提供指定数据*/
    @DataProvider(name = "methodData")
    public Object[][] methodDataProvider(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",10},
                    {"lisi",14}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",12},
                    {"wangba",10}
            };
        }
        return result;
    }
}
