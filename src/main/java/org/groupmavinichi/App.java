package org.groupmavinichi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
                 // SoundInterface sound1 = new TutturuClass();   not the best way if we want to get a unique code
        // sound1.MakeSound();  we have to get rid of the dependencies from the left and right (TutturuClass is a dependency on the right side)
        // We NEED BeenFactory or ApplicationContext for reading beans [getBean] from xml files :)
        //BeenFactory is used for creating small apps
        // In general ApplicationContext is better and includes all the functional stuff from BeenFactory in it
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        boolean bean = context.containsBean("lalalaClass");
//        System.out.println(bean);
//        SoundInterface obj1 = (SoundInterface)context.getBean("tutturuClass");    // getBean returns type (object) and we need (SoundInteface)
//        obj1.MakeSound();
//
//        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Annotation based configuration >>>>>>>>>>>>>>>>>>>>>>>>>>");
//        PersonIntro person1 = (PersonIntro)context.getBean("personintro");
//        System.out.println(person1);
//
//        System.out.println(person1.getName());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextXmlAlterntaive.class);
        PersonIntro p1 = context.getBean(PersonIntro.class);
        //System.out.println(p1);
    }
}



/*  ======================= spring bean definition ===============================
<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">


   <!-- A bean definition with destruction method -->
   <bean id = "..." class = "..." destroy-method = "...">
      <!-- collaborators and configuration for this bean go here -->
   </bean>

</beans>
*
* */