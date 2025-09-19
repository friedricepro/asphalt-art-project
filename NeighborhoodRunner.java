import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    
    //Paints the background purple 
BackgroundPainter BG = new BackgroundPainter();
  BG.setPaint(1000);
    BG.paintBackground("purple");
    //Paints the background purple 


      //Paints 2 rows of grass for the building to reside on
    GroundPainter GP = new GroundPainter();
    GP.setPaint(1000);
    GP.moveToCorner();
  GP.turnLeft();
   GP.turnAround();
    GP.paintGrass();
 
//Paints the building with windows
    BuildingPainter BP = new BuildingPainter();
    //specifically 88 paint so the loop will stop when it has painted it all
    BP.setPaint(88);
    BP.moveToCorner();
    BP.turnRight();
    BP.moveFour();
    BP.turnRight();
    BP.moveTwo();
    BP.paintBuilding("Blue");
    BP.turnRight();
    BP.moveTwo();
    BP.turnLeft();
    BP.moveNine();
    BP.turnRight();
    BP.setPaint(24);
    //restocks to spefically 24 paint so the loop will stop after it has painted it all
    BP.paintWindows("yellow");

//Moves all painters into the corner to look organized
    BG.moveToCorner();
    GP.moveToCorner();
    BP.moveToCorner();

  }
}
