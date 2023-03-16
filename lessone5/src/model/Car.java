package model;
public class Car {
   private String model;
   private double engin;
   private int year;
   public double getEngin(){
      return engin;
   }
   public void setEngin(double e){
      if(e > 0)
      engin = e;
      else
       engin =  e * -1;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;}

   public int getYear() {
      return year;
   }

   public void setYear(int x) {
      if (x >= 1900 && x <= 2023)
         year = x;
      else
         System.out.println("No car that year");
   }


}
