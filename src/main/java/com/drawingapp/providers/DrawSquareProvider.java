package com.drawingapp.providers;

import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Inject;
import com.google.inject.Provider;
import javax.inject.Named;

public class DrawSquareProvider implements Provider<DrawSquare> {

  private final String color;
  private final Integer edge;
  @Inject
  DrawSquareProvider(@ColorValue  String color, @EdgeValue Integer edge){
    this.color = color;
    this.edge = edge;
  }
  @Override
  public DrawSquare get() {
    DrawSquare d = new DrawSquare(color,edge);
    return d;
  }
}
