package cn.bill.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("GroupsOnMethod.test1 服务端组测试1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("GroupsOnMethod.test2 服务端组测试2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("GroupsOnMethod.test3 客户端组测试1");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("GroupsOnMethod.test4 客户端组测试2");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("GroupsOnMethod.beforeGroupsOnServer 服务端组测试");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("GroupsOnMethod.afterGroupsOnServer 服务端组测试");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("GroupsOnMethod.beforeGroupsOnClient 客户端组测试");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("GroupsOnMethod.afterGroupsOnClient 客户端组测试");
    }
}
