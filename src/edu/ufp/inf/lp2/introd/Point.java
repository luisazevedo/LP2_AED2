package edu.ufp.inf.lp2.introd;

public class Point {

  private float x;

  private float y;

  public float distx(Point p) {
    
    return this.x - p.getX();
  }

  public float disty(Point p) {
   return this.y -  p.getY();
  }

  public float dist(Point p) {
  float distX = this.distx(p);
  float distY = this.disty(p);
  return (float)java.lang. Math.sqrt(distX * distX + distY * distY);
  }
  
  public boolean xBetweenPoints (Point leftPt, Point rightPt)
  {
      return this.x >= leftPt.x && this.x <= rightPt.x;
  }
  
  
  public boolean yBetweenPoints (Point upperPt, Point lowerPt)
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

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    

}
