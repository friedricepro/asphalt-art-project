
import org.code.neighborhood.*;
public class PainterPlus extends Painter{
  
     public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
     }

public void takeAllPaint(){
  while (isOnBucket()){
    takePaint();
  }
}

  public void moveFast(){
    while (canMove()){
      move();
    }
  }

  public void paintToEmpty(String color){
    while (hasPaint()){
      paint(color);
        move();
    }
  }

public void paintDonut(String color){
  while (hasPaint()){
    move();
      turnRight(); 
    paint(color);
        move();
    paint(color);
  }
}
  public void turnAround(){
    turnLeft();
    turnLeft();
  }
   /* ------------------ paintRow ------------------
   Adapted from BackgroundPainter, used in GroundPainter
   to paint the grass
   * --------------------------------------------------
   */
   public void paintRow(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
    paint(color);
  }
   /* ------------------ moveToCorner ------------------
 Adapted from BackgroundPainter in order to organize 
 the painters
   * --------------------------------------------------
   */
 public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
  /* ------------------ paintSquare ------------------
   * paintSquare is a helper method in the painterPlus
   class in order to help the paintWindows method in
   the BuildingPainter class
   * --------------------------------------------------
   */
public void paintSquare(String color){
  paint(color);
  move();
  paint(color);
  turnRight();
  move();
  turnRight();
  paint(color);
  move();
  paint(color);
  turnRight();
  move();
  turnRight();
 }
}


