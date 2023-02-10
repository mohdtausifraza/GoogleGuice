package com.drawingapp.module;

/*import com.drawingapp.request.SquareRequest;
import com.drawingapp.request.SquareRequestSubClass;*/
import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;
import com.drawingapp.annotations.Square;
import com.drawingapp.providers.DrawCircleProvider;
import com.drawingapp.providers.DrawSquareProvider;
import com.drawingapp.request.SquareRequest;
import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scope;
import com.google.inject.Scopes;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import javax.inject.Singleton;

public class AppModule extends AbstractModule {
  @Override
  protected void configure() {
    /*bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class).in(Scopes.SINGLETON);
    bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class).in(Scopes.SINGLETON);*/
    /*bind(DrawShape.class).annotatedWith(Names.named("Square")).to(DrawSquare.class).in(Scopes.SINGLETON);
    bind(DrawShape.class).annotatedWith(Names.named("Circle")).to(DrawCircle.class).in(Scopes.SINGLETON);*/
    /*bind(SquareRequest.class).to(SquareRequestSubClass.class);*/
    bind(String.class).annotatedWith(ColorValue.class).toInstance("RED");
    bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(50);
    //bind(SquareRequest.class).in(Scopes.SINGLETON);
    /*bind(DrawShape.class).annotatedWith(Square.class).toProvider(DrawSquareProvider.class).in(Scopes.SINGLETON);
    bind(DrawShape.class).annotatedWith(Names.named("Circle")).toProvider(DrawCircleProvider.class).in(Scopes.SINGLETON);*/
    Multibinder<DrawShape> drawShapeBinder = Multibinder.newSetBinder(binder(), DrawShape.class);
    drawShapeBinder.addBinding().to(DrawSquare.class);
    drawShapeBinder.addBinding().to(DrawCircle.class);
  }

  /*@Provides
  @Singleton
  DrawShape providesDrawSquare(){
    DrawShape d = new DrawSquare("RED", 40);
    return d;
  }*/

  /*@Provides
  @Singleton
  @Named("Square")
  DrawShape providesDrawSquare(@ColorValue String color, @EdgeValue Integer edge){
    DrawShape d = new DrawSquare(color, edge);
    return d;
  }*/

  /*@Provides
  @Singleton
  @Circle
  DrawShape providesDrawCircle(@ColorValue String color, @EdgeValue Integer edge){
    DrawShape d = new DrawCircle(color, edge);
    return d;
  }*/
}
