/*
*Name: Pacman
 *Date: April 15, 2015
 *Author: Mr. R. Misiak
 *Version: v0.01
 *Description: This program draws pacman.
 */

int locX = 30;
int locY = 30;
final int DIAMETER = 30;
boolean open = true;

public void setup() {
  size(500, 500);
  smooth();
  noStroke();
  background(100, 100, 100);
  frameRate(10);
}

public void drawPacmanFacingRightOpen() {
  //Pacman facing right mouth open.
  fill(255, 255, 0);
  arc(locX, locY, DIAMETER, DIAMETER, radians(30), radians(330));
  fill(0, 0, 0);
  ellipse(locX-5, locY -5, 4, 4);
}

public void drawPacmanFacingRightClosed() {
  //Pacman facing right mouth closed.
  fill(255, 255, 0);
  ellipse(locX, locY, DIAMETER, DIAMETER);
  fill(0, 0, 0);
  ellipse(locX-5, locY-5, 4, 4);
}

public void erasePacman(){
  //Erasing Pacman
  fill(100, 100, 100);
  ellipse(locX, locY, DIAMETER, DIAMETER);
  fill(100, 100, 100);
  ellipse(locX-5, locY-5, 4, 4);
}


public void draw() {

  erasePacman();
  if (open) {
    drawPacmanFacingRightOpen();
    open = false;
  } else {
    drawPacmanFacingRightClosed(); 
    open = true;
  }
}

