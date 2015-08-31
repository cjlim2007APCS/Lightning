
int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;
int fillColor;
int[] arrayR = {108, 235, 232, 116, 247, 89};
int[] arrayG = {252, 255, 181, 237, 190, 117};
int[] arrayB = {255, 105, 100, 102, 212, 255};
void setup()
{
  size(300,300);
  background(0,0,0);
  strokeWeight(3);
  frameRate(10);
  noLoop();
}
void draw()
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
	startX = 0;
	startY = 150;
	endX = 0;
	endY = 150;
}
void mousePressed()
{
	redraw();
	
}



