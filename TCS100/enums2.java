public class enums2{

    public enum Planet{
        MERCURY(3.30e+23, 2.4397e6),
        VENUS(3.30e+23, 2.4397e6),
        EARTH(3.30e+23, 2.4397e6);

        private final double mass;
        private final double radius;

        Planet(double mass, double radius){
            this.mass = mass;
            this.radius = radius;
        }

        public double surfaceGravity(){
            double G = 6.67430e-11;
            return G * mass;
        }
    }

    public static void main(String[] args){
        System.out.println("hello");
    }
} 
