float x = 0;
import ddf.minim.*;  
Minim minim;
AudioPlayer sound;
float y = 0;
 float frequency = .001;
float noiseInterval = PI;
void setup(){
size(600,600);
background(0,0,0);
minim = new Minim (this);
sound = minim.loadFile("rain.wav");

}

void draw(){
  
  noStroke();
   fill(52,80,247);
  ellipse(x,y,14,14);
  x = random(600);
  y = random(600);
 makeMagical();
 
}
void makeMagical() {
     fill( 0, 0, 10, 20 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}