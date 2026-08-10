package com.fatma.shape;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
    @Value("${circle.bye}")
    private  double bye;

    @Override
    public double getArea(double line) {
        return bye*line*line;
    }
}
