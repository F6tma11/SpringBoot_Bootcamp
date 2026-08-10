package classes;

public class Circle implements Shape{

    private Draw2D draw2D;
    private Draw3D draw3D;

    public Circle(Draw2D draw2D,Draw3D draw3D){
        this.draw2D=draw2D;
        this.draw3D=draw3D;
    }

    @Override
    public void draw2D() {
        draw2D.draw("Circle");
    }

    @Override
    public void draw3D() {
        draw3D.draw("Circle");
    }
}
