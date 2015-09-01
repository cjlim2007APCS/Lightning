import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {


int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;
int setY;
int fillColor;
int[] arrayR = {108, 235, 232, 116, 247, 89};
int[] arrayG = {252, 255, 181, 237, 190, 117};
int[] arrayB = {255, 105, 100, 102, 212, 255};
public void setup()
{
  size(300,300);
  background(0,0,0);
  strokeWeight(5);
  noLoop();
}
public void draw()
{
	while(endX < 300) {
	fillColor = (int)(Math.random()*6);
	stroke(arrayR[fillColor], arrayG[fillColor], arrayB[fillColor]);
	endX = startX + (int)(Math.random() * 10);
	endY = startY + (int)((Math.random() * 20) - 10);
	line(startX, startY, endX, endY);
	startX = endX;
	startY = endY;
	}
	setY = (int)(Math.random() * 300);
	startX = 0;
	startY = setY;
	endX = 0;
	endY = setY;
}
public void mousePressed()
{
	redraw();
	
}



  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
