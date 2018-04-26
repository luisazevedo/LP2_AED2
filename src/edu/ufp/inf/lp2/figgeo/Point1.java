package edu.ufp.inf.lp2.figgeo;



public class Point1 {

  private float x;

  private float y;

  public float distx(Point1 p) {
    
    return (x - p.getX());
  }

  public float disty(Point1 p) {
   return (y - p.getY());
  }

  public float dist(Point1 p) {
  float distX = this.distx(p);
  float distY = this.disty(p);
  return (float)java.lang. Math.sqrt(distX * distX + distY * distY);
  }
  
  public boolean xBetweenPoints (Point1 leftPt, Point1 rightPt)
  {
      return this.x >= leftPt.x && this.x <= rightPt.x;
  }
  
  
  public boolean yBetweenPoints (Point1 upperPt, Point1 lowerPt)
  {
      return this.y <= upperPt.y && this.y >= lowerPt.y;
  }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    public Point1(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point1{" +   this.x + "," + this.y + '}';
    }
    

}
