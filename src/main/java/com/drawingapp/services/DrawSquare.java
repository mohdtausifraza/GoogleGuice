package com.drawingapp.services;

import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;
import javax.inject.Inject;

public class DrawSquare implements DrawShape{

  private final String color;
  private final Integer edge;

  @Inject
  public DrawSquare(@ColorValue String color,@EdgeValue Integer edge) {
    this.color = color;
    this.edge = edge;
  }
  /*public DrawSquare(String color,Integer edge) {
    this.color = color;
    this.edge = edge;
  }*/

  @Override
  public void draw() {
    System.out.println("Drawing Square of Color:"+color+" And Edge:"+edge);
  }

  @Override
  public String canDrawShapeType() {
    return "SQUARE";
  }

}
