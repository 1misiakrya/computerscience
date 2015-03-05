/*
*Name: Norway
*Date: March 4, 2015
*Author: Mr. R. Misiak
*Version: v0.01
*Description: This program creates the flag of Norway.
*/

//Gets rid of borders.
noStroke();

final double SIZE_FACTOR = 1;
final int BOX_WIDTH = (int) (400*SIZE_FACTOR);
final int BOX_HEIGHT = (int) (300*SIZE_FACTOR);
int xBoxLocation = 20;
int yBoxLocation = 20;

size((int) (500*SIZE_FACTOR), (int) (400*SIZE_FACTOR));

//Red Rectangle
fill(239,43,45);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH, BOX_HEIGHT);

//White Rectangles
fill(255,255,255);
rect(xBoxLocation+BOX_WIDTH*0.3, yBoxLocation, BOX_WIDTH*0.2, BOX_HEIGHT);

fill(255,255,255);
rect(xBoxLocation, yBoxLocation+BOX_HEIGHT*0.4, BOX_WIDTH, BOX_HEIGHT*0.2);

//Blue Rectangles
fill(0,40,104);
rect(xBoxLocation+BOX_WIDTH*0.35, yBoxLocation, BOX_WIDTH*0.1, BOX_HEIGHT);

fill(0,40,104);
rect(xBoxLocation, yBoxLocation+BOX_HEIGHT*0.45, BOX_WIDTH, BOX_HEIGHT*0.1);

