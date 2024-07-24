public class Cp {
    int modelYear;
    String modelName;
  
    public Cp(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      Cp myCar = new Cp(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }