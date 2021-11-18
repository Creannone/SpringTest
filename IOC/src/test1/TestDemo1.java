package test1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo1 {
    @Test
    public void test1(){
        BeanFactory context =
                new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user",User.class);

        System.out.println(user);
    }
}
