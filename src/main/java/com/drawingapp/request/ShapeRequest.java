package com.drawingapp.request;

import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShapeRequest {

  Map<String, DrawShape> shapeNamesVsShape;

  @Inject
  public ShapeRequest(Set<DrawShape> set){
    shapeNamesVsShape = new HashMap<String,DrawShape>();
    for (DrawShape d : set){
      shapeNamesVsShape.put(d.canDrawShapeType(),d);
    }
  }

  public void makeRequest(String shapeName){
    DrawShape d = shapeNamesVsShape.get(shapeName);
    d.draw();
  }

}
