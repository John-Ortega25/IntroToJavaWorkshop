int Pong=100;
void setup(){
  size(500,500);
}

void draw(){
 background(255,255,255) ;
 ellipse(Pong,250,100,100);
 stroke(50,50,50);
  Pong+=20;
}

