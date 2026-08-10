import com.fatma.database.DatabaseOperations;
import com.fatma.shape.Circle;
import com.fatma.shape.Rectangle;
import com.fatma.shape.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("application.context.xml");

        Shape circle=container.getBean("circle", Circle.class);
        Shape circle2=container.getBean("circle", Circle.class);
        Shape rectangle=container.getBean("rectangle", Rectangle.class);
        Shape rectangle2=container.getBean("rectangle", Rectangle.class);
        DatabaseOperations databaseOperations=container.getBean("databaseOperation", DatabaseOperations.class);

        System.out.println(circle);
        System.out.println(circle2);
        circle.draw2D("Circle");

        System.out.println(rectangle);
        rectangle.draw3D("Rectangle");
        System.out.println(rectangle2);
        rectangle2.draw2D("Rectangle");

        ((ClassPathXmlApplicationContext)container).close();
    }
}