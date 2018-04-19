package cn.bill.group;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3  {

    public void tea1(){
        System.out.println("GroupsOnClass3.tea1");
    }

    public void tea2(){
        System.out.println("GroupsOnClass3.tea2");
    }
}
