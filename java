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
