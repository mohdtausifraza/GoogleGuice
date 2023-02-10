package com.drawingapp.providers;

import com.drawingapp.services.DrawCircle;
import com.google.inject.Provider;
import javax.inject.Named;

public class DrawCircleProvider implements Provider<DrawCircle> {

  @Override
  public DrawCircle get() {
    return new DrawCircle("BLUE", 10);
  }
}
