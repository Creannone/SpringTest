import CollectionTest.Stu;
import FactoryBean.Course;
import Service.UserService;
import bean.Emp;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
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
}