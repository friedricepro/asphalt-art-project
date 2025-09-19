import org.code.neighborhood.*;
public class GroundPainter extends PainterPlus{


  /* ------------------ paintGrass ------------------
   * paintGrass is a method used to paint 2 rows of 
   green at the bottom for the building that 
   BuildingPainter will create on top of, uses paintRow
   from BackgroundPainter to simplify the code
   * --------------------------------------------------
   */
  
  public void paintGrass(){
while(canMove("north")){

  paintRow("Green");

  if(!canMove("west")){
    turnRight();
    move();
    turnRight();
  }
  //ends the while loop when the painter faces east after finishing the 2nd row
  if(!canMove("east")) {
  break;
  }
}


    
  }
}
  
