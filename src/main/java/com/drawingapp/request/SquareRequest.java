package com.drawingapp.request;

import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Provider;
import javax.inject.Inject;
import javax.inject.Named;

public class SquareRequest {

  //@Inject
  // DrawShape shape;

  Provider<DrawSquare> squareProvider;
  @Inject
  public  SquareRequest(Provider<DrawSquare> squareProvider) {
    this.squareProvider = squareProvider;
  }

  /*@Inject
  public void setShape(DrawShape shape){
    this.shape = shape;
  }*/
  public void makeRequest() {
    DrawShape shape1 = squareProvider.get();
    shape1.draw();
    DrawShape shape2 = squareProvider.get();
    shape2.draw();
  }

  /*public DrawShape getShape(){
    return shape;
  }*/
}
