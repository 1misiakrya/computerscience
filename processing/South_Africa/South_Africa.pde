/*
*Name: South Africa
*Date: March 4, 2015
*Author: Mr. R. Misiak
*Version: v0.01
*Description: This program creates the flag of South Africa.
*/

//Gets rid of borders.
noStroke();

final double SIZE_FACTOR = 1;
final int BOX_WIDTH = (int) (400*SIZE_FACTOR);
final int BOX_HEIGHT = (int) (300*SIZE_FACTOR);
int xBoxLocation = 20;
int yBoxLocation = 20;

size((int) (500*SIZE_FACTOR), (int) (400*SIZE_FACTOR));

//Blue Rectangle
fill(0,32,159);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH, BOX_HEIGHT);

//Red Rectangle
fill(226,56,40);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH, BOX_HEIGHT*0.5);

//White Rectangles
fill(255,255,255);
rect(xBoxLocation, yBoxLocation+BOX_HEIGHT*0.3, BOX_WIDTH, BOX_HEIGHT*0.4);

fill(255,255,255);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH*0.15, BOX_HEIGHT);

//White Triangle
fill(255,255,255);
triangle(xBoxLocation+BOX_WIDTH*0.15, yBoxLocation, xBoxLocation+BOX_WIDTH*0.7, yBoxLocation+BOX_HEIGHT*0.5, xBoxLocation+BOX_WIDTH*0.15, yBoxLocation+BOX_HEIGHT);

//Green Rectangles
fill(0,119,75);
rect(xBoxLocation, yBoxLocation+BOX_HEIGHT*0.4, BOX_WIDTH, BOX_HEIGHT*0.2);

fill(0,119,75);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH*0.05, BOX_HEIGHT);

//Green Triangle
fill(0,119,75);
triangle(xBoxLocation+BOX_WIDTH*0.05, yBoxLocation+BOX_HEIGHT, xBoxLocation+BOX_WIDTH*0.6, yBoxLocation+BOX_HEIGHT*0.5, xBoxLocation+BOX_WIDTH*0.05, yBoxLocation);

//Yellow Triangle
fill(254,178,0);
triangle(xBoxLocation, yBoxLocation+BOX_HEIGHT*0.25, xBoxLocation, yBoxLocation+BOX_HEIGHT*0.75, xBoxLocation+BOX_WIDTH*0.3, yBoxLocation+BOX_HEIGHT*0.5);

//Black Triangle
fill(0,0,0);
triangle(xBoxLocation, yBoxLocation+BOX_HEIGHT*0.3, xBoxLocation, yBoxLocation+BOX_HEIGHT*0.7, xBoxLocation+BOX_WIDTH*0.25, yBoxLocation+BOX_HEIGHT*0.5);

