package com.drawingapp.main;

import com.drawingapp.module.AppModule;
//import com.drawingapp.request.CircleRequest;
import com.drawingapp.request.ShapeRequest;
import com.drawingapp.request.SquareRequest;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {

  private static final String SQUARE_REQ =  "SQUARE";

  private static final String CIRCLE_REQ =  "CIRCLE";

  private static void sendRequest(String squareReq){
    if (squareReq.equals(SQUARE_REQ)){
      //DrawShape d = new DrawSquare();
      // 1 Create Injector
      Injector injector = Guice.createInjector(new AppModule());
      // 2. Get Instance from that injector
      //DrawShape d = injector.getInstance(DrawShape.class);
      //SquareRequest request = new SquareRequest(d);
//      SquareRequest request = injector.getInstance(SquareRequest.class);
//      request.makeRequest();

      /*SquareRequest request1 = injector.getInstance(SquareRequest.class);
      request1.makeRequest();

      System.out.println(request == request1);
      System.out.println(request.getShape() == request1.getShape());*/

      ShapeRequest request = injector.getInstance(ShapeRequest.class);
      request.makeRequest(squareReq);

    }

    /*if (squareReq.equals(CIRCLE_REQ)){
      Injector injector = Guice.createInjector(new AppModule());
      CircleRequest request = injector.getInstance(CircleRequest.class);
      request.makeRequest();
    }*/
  }
  public static void main(String[] args) {
    sendRequest(SQUARE_REQ);
//    sendRequest(CIRCLE_REQ);
  }
}