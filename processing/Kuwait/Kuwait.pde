/*
*Name: Kuwait
*Date: March 4, 2015
*Author: Mr. R. Misiak
*Version: v0.01
*Description: This program creates the flag of Kuwait.
*/

//Gets rid of borders.
noStroke();

final double SIZE_FACTOR = 1;
final int BOX_WIDTH = (int) (400*SIZE_FACTOR);
final int BOX_HEIGHT = (int) (300*SIZE_FACTOR);
int xBoxLocation = 20;
int yBoxLocation = 20;

size((int) (500*SIZE_FACTOR), (int) (400*SIZE_FACTOR));

//Red Box
fill(222,16,24);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH, BOX_HEIGHT);

//Green Box
fill(16,148,82);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH, BOX_HEIGHT*0.5);

//Black Triangle
fill(0,0,0);
triangle(xBoxLocation, yBoxLocation, xBoxLocation, yBoxLocation+BOX_HEIGHT, xBoxLocation+BOX_WIDTH*0.5, yBoxLocation+BOX_HEIGHT*0.5);

//White Box
fill(255,255,255);
rect(xBoxLocation+BOX_WIDTH*0.33, yBoxLocation+BOX_HEIGHT*0.33, BOX_WIDTH-BOX_WIDTH*0.33, BOX_HEIGHT*0.34);

