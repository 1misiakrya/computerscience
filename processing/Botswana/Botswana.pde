/*
*Name: Botswana
*Date: March 3, 2015
*Author: Mr. R. Misiak
*Version: v0.01
*Description: This program creates the flag of Botswana.
*/

//Gets rid of borders.
noStroke();

final double SIZE_FACTOR = 1;
final int BOX_WIDTH = (int) (400*SIZE_FACTOR);
final int BOX_HEIGHT = (int) (300*SIZE_FACTOR);
int xBoxLocation = 20;
int yBoxLocation = 20;

size((int) (500*SIZE_FACTOR), (int) (400*SIZE_FACTOR));

//Blue Box
fill(8, 115, 165);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH, BOX_HEIGHT);

//White Box
fill(255,255,255);
rect(xBoxLocation, yBoxLocation + 0.35*BOX_HEIGHT, BOX_WIDTH, BOX_HEIGHT*.30);

//Black Box
fill(0,0,0);
rect(xBoxLocation, yBoxLocation + 0.40*BOX_HEIGHT, BOX_WIDTH, BOX_HEIGHT*.20);

