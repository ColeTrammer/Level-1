int frogX = 20;
int frogY = 20;
int verticalSpeed = 5;
int horizontalSpeed = 5;
int screenX = 400;
int screenY = 400;
Car car1 = new Car(50, 50, 50, 5);

void setup() {
 size(screenX, screenY); 
}

void draw() {
  background(170, 170, 170);
  fill(210, 10 , 10);
  ellipse(frogX, frogY, 20, 20);
  car1.show();
  car1.moveLeft();
}

void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      //Frog Y position goes up
        frogY -= verticalSpeed;
        if (!shouldMove())
          frogY += verticalSpeed; 
      }
      else if(keyCode == DOWN)
      {
        //Frog Y position goes down
       frogY += verticalSpeed; 
       if (!shouldMove())
          frogY -= verticalSpeed; 
      }
      else if(keyCode == RIGHT)
      {
       //Frog X position goes right
         frogX += horizontalSpeed;
         if (!shouldMove())
          frogX -= horizontalSpeed; 
      }
      else if(keyCode == LEFT)
      {
        //Frog X position goes left
        frogX -= horizontalSpeed;
        if (!shouldMove())
          frogX += horizontalSpeed;  
    }
  }
}

Boolean shouldMove() {
  if (frogX >= screenX ||
      frogX <= 0 ||
      -frogY >= 0 ||
      -frogY <= -screenY)
      return false;
  return true;
}
