import com.fatma.shape.Circle;
import com.fatma.shape.Shape;
import com.fatma.shape.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ToDo : Will change it by annotation config
        ApplicationContext container=new ClassPathXmlApplicationContext("application.context.xml");

        Shape circle=container.getBean("circle", Circle.class);
        double cirArea=circle.getArea(3);
        System.out.println(String.format("Circle Area : %s",cirArea));

        Shape square=container.getBean("square" , Square.class);
        double squArea=square.getArea(3);
        System.out.println(String.format("Square Area: %s",squArea));
    }
}