int Pong=100;
void setup(){
  size(800,800);
}

void draw(){
 background(255,255,255) ;
 fill(0,0,284);
 ellipse(Pong,250,100,100);
 stroke(50,50,50);
  Pong+=10;


if(Pong>=800){
  Pong=-Pong; 
}
}
