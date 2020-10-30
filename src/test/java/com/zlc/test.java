package com.zlc;

import com.zlc.crm.utils.DateTimeUtil;
import com.zlc.crm.utils.MD5Util;
import com.zlc.crm.utils.TransactionInvocationHandler;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

    //日期工具类的使用，判定失效时间是否超过
    @Test
    public void currentTime(){
        String expireTime="2020-11-10 10:10:10";
        Date date=new Date();
        String str = DateTimeUtil.getSysTime();
        int count = expireTime.compareTo(str);
        System.out.println(count);
    }

    //判定是否锁定
    @Test
    public void state(){
        String lockState="0";
        //判断字符串的时候，一定要把常量放在前面
        if ("0".equals(lockState)) {
            System.out.println("账号已锁定");
        }
    }

    @Test
    public void ipif(){
        String ip="192.168.1.1";
        String allowIps="192.168.1.1,192.168.1.2";

        if (allowIps.contains(ip)){
            System.out.println("有效的ip地址，允许访问系统");
        }else {
            System.out.println("ip地址受限，请联系管理员");
        }
    }

    //MD5加密方式
    @Test
    public void psd(){
        String pwd="";
        pwd=MD5Util.getMD5(pwd);
        System.out.println("加密后" + pwd);
    }

}
