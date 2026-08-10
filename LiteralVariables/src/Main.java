import com.fatma.vehicle.Car;
import com.fatma.vehicle.Plane;
import com.fatma.vehicle.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ToDo I will replace configuration container from xml file to annotations

        ApplicationContext container=new ClassPathXmlApplicationContext("application.context.xml");

        Vehicle car=container.getBean("car", Car.class);
        car.saveIntoDB("Opel GrandLand");

        Vehicle plane=container.getBean("plane", Plane.class);
        plane.saveIntoDB("Helicopter");
    }
}