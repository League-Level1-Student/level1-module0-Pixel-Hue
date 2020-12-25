import ddf.minim.*; 
 Minim minim;        //as a member variable
  AudioPlayer song;
PImage pictureOfRecord;   //as member variable
int imageAngle = 0;
void setup() {
        size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.jpeg");      //in setup method
         pictureOfRecord.resize(height,width);
                    //at the very top of your sketch
       //as a member variable
  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);   //in the setup method
         
}
void draw() {
         //in draw method
         image(pictureOfRecord, 0, 0);
        imageAngle++;
        if (mousePressed == true) {
        rotateImage(pictureOfRecord, imageAngle);
         image(pictureOfRecord, 0, 0);
      //song.play();
        }
       else {
         //song.pause();
       }
}
 void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
