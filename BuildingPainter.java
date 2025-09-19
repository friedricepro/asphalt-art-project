import org.code.neighborhood.*;
public class BuildingPainter extends PainterPlus{

  
  /* ------------------ paintBuilding ------------------
   * paintBuilding paints an 8x11 building, uses paintEleven
   to paint the building
   * --------------------------------------------------
   */
  public void paintBuilding(String color){
while (hasPaint()){
  paintEleven("blue");
    }
  }

  /* ------------------ paintWindows ------------------
  paintWindows paints 2x2 squares on the building to 
  represent lit up windows, uses paintSquare from
  PainterPlus class
   * --------------------------------------------------
   */
public void paintWindows(String color){
  while(hasPaint()){
  paintSquare(color);
  moveFour();
  paintSquare(color);
  turnRight();
  moveFour();
  turnLeft();
  move();
  turnAround();
  paintSquare(color);
  moveFour();
  paintSquare(color);
  move();
  turnLeft();
  moveTwo();
  turnLeft();
  paintSquare(color);
  moveFour();
  paintSquare(color);
  }
}
 


  
  /* ------------------ paintEleven ------------------
   paintEleven paints 11 tiles in 2 rows, used in a 
   while loop to paint the building
   * --------------------------------------------------
   */
  public void paintEleven(String color){
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
     paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    turnRight();
  }

 /* ------------------ move methods ------------------
   All move methods are used to simplify redundant 
   move(); commands
   * --------------------------------------------------
   */
  
  public void moveFour(){
    move();
    move();
    move();
    move();
  }
   public void moveTwo(){
    move();
    move();
  }
   public void moveNine(){
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
  }
}
