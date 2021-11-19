import BeanLife.Orders;
import CollectionTest.Stu;
import FactoryBean.Course;
import Service.UserService;
import bean.Emp;
import config.SpringConfig;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void test1(){
        BeanFactory context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);
    }

    @Test
    public void test2(){
        BeanFactory context = new ClassPathXmlApplicationContext("bean5.xml");
        Stu stu = context.getBean("stu",Stu.class);
        System.out.println(stu);
    }

    @Test
    public void test3(){
        BeanFactory context = new ClassPathXmlApplicationContext("bean6.xml");
        Course course = context.getBean("myBean",Course.class);
        System.out.println(course);
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println("4.获取实例对象--------------");
        System.out.println(orders);
        context.close();
    }

    @Test
    public void test5(){
        BeanFactory context = new ClassPathXmlApplicationContext("bean7.xml");
        BeanFile beanFile = context.getBean("beanFile",BeanFile.class);
        System.out.println(beanFile);
    }

    @Test
    public void test6(){
        BeanFactory context = new ClassPathXmlApplicationContext("bean8.xml");
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.test();
    }

    @Test
    public void test7(){
        BeanFactory context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.test();
    }
}