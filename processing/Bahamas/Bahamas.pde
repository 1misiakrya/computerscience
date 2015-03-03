/*
*Name: Bahamas
*Date: March 3, 2015
*Author: Mr. R. Misiak
*Version: v0.01
*Description: This program creates the flag of Bahamas.
*/

final int BOX_HEIGHT = 300;
final int BOX_WIDTH = 300;
int xBoxLocation = 20;
int yBoxLocation = 20;

size( 400, 400 );

size( 400, 400 );

//Blue Box
fill(0,140,173);
rect(xBoxLocation,yBoxLocation,BOX_WIDTH,BOX_HEIGHT);

//Yellow Box
fill(255,239,49);
rect(xBoxLocation,yBoxLocation + BOX_HEIGHT*0.33, BOX_WIDTH, BOX_HEIGHT*0.33);

//Black Triangle
fill(0,0,0);
triangle(xBoxLocation, yBoxLocation, xBoxLocation, yBoxLocation + BOX_HEIGHT, xBoxLocation + BOX_WIDTH*0.5, yBoxLocation + BOX_HEIGHT*0.5);
