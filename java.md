```js
abstect class CShape{
    protected String color;
    public void setColor(String str){
         color=str;
    }
}


class CCircle extends CShape{
    protected double a,b,c;
    public CCircle(double a,double b,double c){
         this.a=a;
         this.b=b;
         this.c=c;
    }
    public void show(){
        system.out.print("color="+color+", ");
        system.out.println("area"+a*b/2);
    }
}
public class app11_1{
    public static void main(String args[]){
        CTriangle tri = new CTriangle(3,4,5);
        tri.setColor("Red");
        tri.show();
    }
}
```

---


```js

public interface Shape {  
   double getArea();
}

public class Rectangle implements Shape {  
   private int length;
   private int width;

   public Rectangle(int length, int width) {
      this.length = length;
      this.width = width;
   }

   @Override
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "]";
   }

   
   @Override
   public double getArea() {
      return length * width;
   }
}

public class Triangle implements Shape {
   private int base;
   private int height;

   public Triangle(int base, int height) {
      this.base = base;
      this.height = height;
   }

   @Override
   public String toString() {
      return "Triangle[base=" + base + ",height=" + height + "]";
   }

   @Override
   public double getArea() {
      return 0.5 * base * height;
   }
}


```
