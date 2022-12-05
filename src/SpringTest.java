import com.spring.test.Address;
import com.spring.test.InitAndDestroyBean;
import com.spring.test.Trainee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) { 
        /** xml based configuration */
        /*
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring-context.xml");
        Trainee trainee = (Trainee) ct.getBean("t");
        trainee.setName("Mr. A");
        System.out.println(trainee.getName());
        */
        
        /** Java based configuration */
//        ApplicationContext ct = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        Student student = ct.getBean(Student.class);
//        student.setRollNo(101);
//        System.out.println(student.getRollNo());
        
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring-context.xml");
        //Address addr = (Address) ct.getBean("addr");
        //Trainee trainee = (Trainee) ct.getBean("t121");
        //System.out.println(trainee);
        //ct.registerShutdownHook();
        //Trainee t = new Trainee(101);
        //InitAndDestroyBean ib = (InitAndDestroyBean) ct.getBean("ib");
        //ct.registerShutdownHook();
        
//        MyBeanPostProcessor xyz = (MyBeanPostProcessor) ct.getBean("postProcessor");
//        xyz.toString();
    }
}