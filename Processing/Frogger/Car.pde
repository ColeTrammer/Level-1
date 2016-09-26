public class Car {
  int x, y;
  int size;
  int speed;
  
  public Car(int x, int y, int size, int speed) {
      this.x = x;
      this.y = y;
      this.size = size;
      this.speed = speed;
  }
  public void show() {
    fill(0, 255, 0);
    rect(x, y, size, 50);
  }
  public void moveLeft() {
    x -= speed; 
    if (x < -size)
      x = screenX;
  }
}
