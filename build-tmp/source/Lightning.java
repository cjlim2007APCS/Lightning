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


int startX;
int startY;
int endX;
int endY;
int fillColor;
//int[] arrayR = {108, 235, 232, 116, 247, 89};
//int[] arrayG = {252, 255, 181, 237, 190, 117};
//int[] arrayB = {255, 105, 100, 102, 212, 255};
public void setup()
{
  size(300,300);
  strokeWeight(3);
  background(0,0,0);
  stroke(255,255,255);
}
public void draw()
{
	//fillColor = (int)(Math.random()*6);
}
public void mousePressed()
{
	
	lightning();
}
public void lightning()
{
	startX = 0;
	startY = 150;
	endX = 0;
	endY = 150;
	while(endX > 300) {
	endX = startX + (int)(Math.random() * 10);
	endY = startY + (int)(Math.random() * 20 - 10);
	line(startX, startY, endX, endY);
	startX = endX;
	startY = endY;
	}
	//stroke(arrayR[fillColor], arrayG[fillColor], arrayB[fillColor]);

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
