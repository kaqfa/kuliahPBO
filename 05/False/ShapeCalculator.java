public class ShapeCalculator
{
    public static void main(String args []){
        Lingkaran bunder1, bunder2;
        bunder1 = new Lingkaran();
        bunder1.setDiameter(5);
        
        bunder2 = new Lingkaran(5);
        System.out.println("Nilai PI adalah:"+Lingkaran.PI);
        bunder2.setDiameter(10);
        System.out.println("Nilai diameter:"+bunder2.radius);
        System.out.println("Luasnya adalah:"+bunder2.getArea());
    }
}
