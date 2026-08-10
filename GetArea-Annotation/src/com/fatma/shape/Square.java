package com.fatma.shape;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape{

    @Override
    public double getArea(double line) {
        return line*line;
    }
}
