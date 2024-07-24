package Inheritance_Java;

class OuterClass {
    int x = 10;

   static class InnerClass {
      int y = 5;
    }
  }
  
  public class NestingClass {
    public static void main(String[] args) {
      OuterClass myOut =new OuterClass();
      OuterClass.InnerClass myInClass = new OuterClass.InnerClass();
      System.out.println(myOut.x + myInClass.y);

    }
  }
