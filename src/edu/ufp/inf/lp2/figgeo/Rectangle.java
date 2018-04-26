package edu.ufp.inf.lp2.figgeo;

public class Rectangle extends FigGeo {

    public Rectangle (Point1 lup , Point1 rdp){
       
        this.addPoint(lup);
        this.addPoint(rdp);
        
        
    }
    
    @Override
    public double area() {
        Point1 lup = this.getPoint(0);
        Point1 rdp = this.getPoint(1);
        return Math.abs(lup.distx(rdp) * lup.disty(rdp));
    }

    @Override
    public double perimetro() {
       
        Point1 lup = this.getPoint(0);
        Point1 rdp = this.getPoint(1);
       
      return ( 2 * Math.abs(lup.distx(rdp))+ 2* Math.abs(lup.disty(rdp)));
       
    }

    @Override
    public boolean islnside(FigGeo f) {
        if (f instanceof Rectangle){
        Point1 lup = this.getPoint(0);
        Point1 rdp = this.getPoint(1);
        
        Point1 flop = f.getPoint(0);
        Point1 rdpf = f.getPoint(1);
        
        if(flop .xBetweenPoints(lup, rdp) && flop.yBetweenPoints(lup, rdp) && rdpf.xBetweenPoints(lup, rdp) && rdpf.yBetweenPoints(lup, rdp))
        return true;
    }
        return false ;
    }

    @Override
    public boolean isInterceptedBy(FigGeo f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}