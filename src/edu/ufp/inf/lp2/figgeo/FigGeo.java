package edu.ufp.inf.lp2.figgeo;

import java.util.ArrayList;


public abstract class FigGeo implements FigGeoDimsI, FigGeoRelsI {

 private ArrayList<Point1> poits = new ArrayList();

  public void addPoint(Point1 p) {
      this.poits.add(p);
      
  }

  public Point1 getPoint(int index) {
 
   return this.poits.get(index);
  }

}