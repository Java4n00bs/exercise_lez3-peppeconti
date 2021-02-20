package exercise3;

public class Solid {

  float height;
  float lenght;
  float depth;

    public Solid(float height, float lenght, float depth){
      this.height = height;
      this.lenght = lenght;
      this.depth = depth;
    }

    // public equals(){
    //}
}

class Cube extends Solid {
  float side;

  public Cube(float side, float height, float lenght, float depth) {
      super(height, lenght, depth);
      this.side = side;
  }
  public String Volume() {
      float volume = side * side * side;
      String solution = "Il volume del cubo è " + volume;
      return solution; 
  }
}

class Sphere extends Solid {
  float radius;

  public Sphere(float radius, float height, float lenght, float depth) {
      super(height, lenght, depth);
      this.radius = radius;
  }
  public String Volume() {
      float volume = (4*3.14f*(radius*radius*radius))/3;
      String solution = "Il volume della sfera è " + volume;
      return solution; 
  }
}