/*
*Name: Czech Republic
*Date: March 4, 2015
*Author: Mr. R. Misiak
*Version: v0.01
*Description: This program creates the flag of Czech Republic.
*/

//Gets rid of borders.
noStroke();

final double SIZE_FACTOR = 1;
final int BOX_WIDTH = (int) (400*SIZE_FACTOR);
final int BOX_HEIGHT = (int) (300*SIZE_FACTOR);
int xBoxLocation = 20;
int yBoxLocation = 20;

size((int) (500*SIZE_FACTOR), (int) (400*SIZE_FACTOR));

fill(215,20,26);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH, BOX_HEIGHT);

fill(255,255,255);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH, BOX_HEIGHT*0.5);

fill(17,69,126);
triangle(xBoxLocation, yBoxLocation, xBoxLocation, yBoxLocation+BOX_HEIGHT, xBoxLocation+BOX_WIDTH*0.5, yBoxLocation+BOX_HEIGHT*0.5);
