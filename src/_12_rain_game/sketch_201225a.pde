int ypos = 0;
int randomNumber = 150;
int score = 0;
void setup() {
  size(300, 300);
  
}
void draw() {
   ypos++;
  background(21, 64, 73);
  
    fill(0, 0, 255);
    stroke(0, 0, 73);
    ellipse(randomNumber, ypos, 32, 32);
    fill(100, 100, 100);
   rect(mouseX - 45, 270, 90, 30);
    if (ypos == 300) {
      ypos = 0;
        checkCatch(randomNumber);
      randomNumber = (int) random(width);
    
      System.out.println(mouseX);
    }
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
 void checkCatch(int x){
         if (x > mouseX - 45 && x < mouseX+45)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
