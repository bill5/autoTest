package cn.bill;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.*;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class HttpApplication {

    private String httpUrl;

    private String getHttpUrl;

    ResourceBundle bundle;

    @BeforeTest
    public void beforeMethod(){
        bundle = ResourceBundle.getBundle("application");
        httpUrl = bundle.getString("test.url");
        getHttpUrl = bundle.getString("cookie.get.url");
    }

    @Test
    public void test1(){
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get =new HttpGet("http://www.sogou.com");
        try {
            CloseableHttpResponse response =httpClient.execute(get);
            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        CookieStore cookieStore = new BasicCookieStore();
        CloseableHttpClient client = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
        HttpGet get = new HttpGet(httpUrl + getHttpUrl);
        try {
            CloseableHttpResponse response = client.execute(get);
            System.out.println(EntityUtils.toString(response.getEntity()));
            List<Cookie> list = cookieStore.getCookies();
            for(Cookie cookie : list){
                System.out.println("name : " + cookie.getName() + " value : " + cookie.getValue());
            }
            response.close();
            client.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
