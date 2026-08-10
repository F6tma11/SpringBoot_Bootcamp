package classes;

public class Triangle implements Shape{
    private Draw2D draw2D;
    private Draw3D draw3D;

    public Triangle(Draw2D draw2D){
        this.draw2D=draw2D;
    }

    public void setDraw3D(Draw3D draw3D){
        this.draw3D=draw3D;
    }

    @Override
    public void draw2D() {
        draw2D.draw("Triangle");
    }

    @Override
    public void draw3D() {
        draw3D.draw("Triangle");
    }
}
