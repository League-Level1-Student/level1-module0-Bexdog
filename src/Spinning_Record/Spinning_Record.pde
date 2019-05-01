PImage pictureOfRecord;     //as member variable
int rotation=1;
import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
void setup(){
  
minim = new Minim(this);  //in the setup method
song = minim.loadFile("gong.wav");//in the setup method
  size(500,500);     //in setup method  
pictureOfRecord= loadImage("download-1.jpg");   }//in setup method  
void draw(){
  background(0);
  if(mousePressed){
rotateImage(pictureOfRecord, rotation);
song.play();
  }
  else{
    song.pause();
    song.rewind();
  }
image(pictureOfRecord, 0, 0);     //in draw method

rotation++;
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/3);
     translate(-image.width/2, -image.height/2);
}