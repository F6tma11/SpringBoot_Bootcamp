package com.fatma.shape;

import com.fatma.drawing.Draw2D;
import com.fatma.drawing.Draw3D;

public class Rectangle implements Shape{
    private Draw2D draw2D;
    private Draw3D draw3D;

    public void setDraw2D(Draw2D draw2D){
        this.draw2D=draw2D;
    }

    public void setDraw3D(Draw3D draw3D){
        this.draw3D=draw3D;
    }

    @Override
    public void draw2D(String shape) {
        draw2D.draw(shape);
    }

    @Override
    public void draw3D(String shape) {
        draw3D.draw(shape);
    }
}
