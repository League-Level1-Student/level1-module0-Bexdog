int y = 70;
 float x = random(500);
 int score;
void setup(){
  size(500,500);
}
void draw(){
 
  background(255, 36, 65);
  fill(7, 100, 227);
stroke(2, 28, 242);
ellipse(x, y, 30, 50);
stroke(142, 67, 23);
fill(180,102,56);
rect(mouseX-25, 400,50, 70);
y++;
if(y==400){
y=70;
checkCatch();
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
x = random(500);
}
}
void checkCatch(){
println(x + ", "+ mouseX);  

  if (x > mouseX-25 && x < mouseX+75)
         
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }