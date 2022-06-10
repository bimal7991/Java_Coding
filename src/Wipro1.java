

class Rectangle{
    public int area(int length, int width){
          return  length*width;
    }
}
class Square extends Rectangle{
    public int area(long length, long width){
          return  (int) Math.pow(length, 2);
    }
}
public class  Wipro1{
    public static void main(String args[]){
          Square r = new Square();
          System.out.println(r.area(5 , 4));
    }
}