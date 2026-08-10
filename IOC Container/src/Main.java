import com.ioc.classes.Circle;
import com.ioc.classes.Rectangle;
import com.ioc.classes.Shape;
import com.ioc.classes.Traiangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Create Spring Container
        ApplicationContext container= new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve Beans from spring container

        Shape circle=container.getBean("Circle", Circle.class);
        circle.draw();

        Shape triangle=container.getBean("triangle", Traiangle.class);
        triangle.draw();

        Shape rectangle=container.getBean("rectangle", Rectangle.class);
        rectangle.draw();
    }
}