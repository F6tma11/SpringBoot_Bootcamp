import classes.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Create container with bean config
        ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");

        //Retrive Beans
        Shape circle=container.getBean("circle", Circle.class);
        circle.draw2D();
        circle.draw3D();

        Shape rectangle=container.getBean("rectangle" , Rectangle.class);
        rectangle.draw2D();
        rectangle.draw3D();

        Shape triangle=container.getBean("triangle", Triangle.class);
        triangle.draw2D();
        triangle.draw3D();

//        Draw2D draw2D=new Draw2D();
//        Shape tri=new Triangle(draw2D);

    }
}