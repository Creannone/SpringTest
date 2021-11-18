import Service.UserService;
import bean.Emp;
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

}