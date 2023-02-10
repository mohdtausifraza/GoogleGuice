package com.drawingapp.services;

import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;
import com.google.inject.Inject;

public class DrawCircle implements DrawShape{

  private final String color;
  private final Integer edge;

  @Inject
  public DrawCircle(@ColorValue String color,@EdgeValue Integer edge) {
    this.color = color;
    this.edge = edge;
  }
  @Override
  public void draw() {
    System.out.println("Drawing Circle!!!");
  }

  @Override
  public String canDrawShapeType() {
    return "CIRCLE";
  }
}
