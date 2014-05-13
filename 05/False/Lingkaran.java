public class Lingkaran
{
   public static final double PI = 3.14;
   private double radius;
   private double diameter;
   
   public Lingkaran(double r){
       radius = r;
       setDiameter(r);
   }
   
   private void setDiameter(double radius){
       diameter = radius * 2;
   }
   
   public void getArea(){
       return PI * (radius*radius);
   }
   
   public double getPerimeter(){
       double keliling = 2 * (PI * radius);
   }
}