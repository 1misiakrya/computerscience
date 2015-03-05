/*
*Name: Seychelles
*Date: March 4, 2015
*Author: Mr. R. Misiak
*Version: v0.01
*Description: This program creates the flag of Seychelles.
*/

//Gets rid of borders.
noStroke();

final double SIZE_FACTOR = 1;
final int BOX_WIDTH = (int) (400*SIZE_FACTOR);
final int BOX_HEIGHT = (int) (300*SIZE_FACTOR);
int xBoxLocation = 20;
int yBoxLocation = 20;

size((int) (500*SIZE_FACTOR), (int) (400*SIZE_FACTOR));

//Red filler box
fill(214,40,40);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH, BOX_HEIGHT);

//Blue Triangle
fill(0,63,135);
triangle(xBoxLocation, yBoxLocation, xBoxLocation, yBoxLocation+BOX_HEIGHT, xBoxLocation+BOX_WIDTH*0.4, yBoxLocation);

//Yellow Triangle
fill(252,216,86);
triangle(xBoxLocation+BOX_WIDTH*0.4, yBoxLocation, xBoxLocation, yBoxLocation+BOX_HEIGHT, xBoxLocation+BOX_WIDTH*0.75, yBoxLocation);

//White Triangle
fill(255,255,255);
triangle(xBoxLocation+BOX_WIDTH, yBoxLocation+BOX_HEIGHT*0.33, xBoxLocation+BOX_WIDTH, yBoxLocation+BOX_HEIGHT*0.66, xBoxLocation, yBoxLocation+BOX_HEIGHT);

//Green Triangle
fill(0,122,61);
triangle(xBoxLocation, yBoxLocation+BOX_HEIGHT, xBoxLocation+BOX_WIDTH, yBoxLocation+BOX_HEIGHT*0.66, xBoxLocation+BOX_WIDTH, yBoxLocation+BOX_HEIGHT);
