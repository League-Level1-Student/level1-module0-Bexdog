import ddf.minim.*;  
Minim minim;
AudioSample sound;
int x = 50;
  int y = 93;
  int b = 4;
  int d =2;
void setup(){
size(500,500);
background(255,255,0);
minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
}
void draw(){
  background(255,255,0);
  fill(0, 0, 0);
stroke(10, 10, 10);
ellipse(x, y, 40, 40);
rect(mouseX,470, 90,10);
if(intersects(x,y, mouseX, 450,90)==true){
  d=-d;
}
x+=b;
y+=d;

if(x>480){
  b=-b;
}
if(x<20){
  b=-b;
}
if(y>480){
  d=-d;
  sound.trigger();
}
if(y<20){
 d=-d;
}
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}