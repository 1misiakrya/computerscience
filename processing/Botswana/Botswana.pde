/*
*Name: Botswana
*Date: March 3, 2015
*Author: Mr. R. Misiak
*Version: v0.01
*Description: This program creates the flag of Botswana.
*/

final int BOX_HEIGHT = 300;
final int BOX_WIDTH = 300;
int xBoxLocation = 20;
int yBoxLocation = 20;

size( 400, 400 );

//Blue Box
fill(8, 115, 165);
rect(xBoxLocation, yBoxLocation, BOX_WIDTH, BOX_HEIGHT);

//White Box
fill(255,255,255);
rect(xBoxLocation, yBoxLocation + 0.35*BOX_HEIGHT, BOX_WIDTH, BOX_HEIGHT*.30);

//Black Box
fill(0,0,0);
rect(xBoxLocation, yBoxLocation + 0.40*BOX_HEIGHT, BOX_WIDTH, BOX_HEIGHT*.20);

