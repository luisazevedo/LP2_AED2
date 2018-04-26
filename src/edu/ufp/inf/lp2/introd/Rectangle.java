package edu.ufp.inf.lp2.introd;

import java.lang.Math;

public class Rectangle {

    private Point ulp;

    private Point drp;

    public float area() {
       
        return comprimento() * altura ();
                
           }

    public float altura (){
        
        return Math.abs(this.drp.disty(drp));
        
    }
    
    public float comprimento (){
        
        return Math.abs(this.drp.distx(ulp));
        
    }


    public float perimetro() {
        float px = this.ulp.distx(ulp) + this.ulp.distx(ulp);
        float py = this.drp.disty(drp) + this.drp.disty(drp);
        return px + py;
    }

    public float diagonal() {
        float px = this.ulp.distx(ulp);
        float py = this.drp.disty(drp);
        return (float)java.lang. Math.sqrt(px * px + py * py);
    }

    /**
     * @return the ulp
     */
    public Point getUlp() {
        return ulp;
    }

    /**
     * @param ulp the ulp to set
     */
    public void setUlp(Point ulp) {
        this.ulp = ulp;
    }

    /**
     * @return the drp
     */
    public Point getDrp() {
        return drp;
    }

    /**
     * @param drp the drp to set
     */
    public void setDrp(Point drp) {
        this.drp = drp;
    }

    public Rectangle(Point ulp, Point drp) {
        this.ulp = ulp;
        this.drp = drp;
    }

}
