public class CylinderComputation {
    public static void main(String[] args) {
        
        double radius, height, surfaceArea, baseArea, volume;
        final double PI = 3.14159265;

        radius = 5;
        height = 3;
        surfaceArea = 2* PI * radius * height + 2 * PI * (radius * radius);
        baseArea = PI * (radius * radius);
        volume = radius* radius * PI * height;

        System.out.print("The surface area is ");
        System.out.println(surfaceArea);
        System.out.print(" The volume is ");
        System.out.println(volume);
        System.out.print("The radius is ");
        System.out.println(radius);
        System.out.print("The height is ");
        System.out.println(height);
        System.out.print("The base area ");
        System.out.println(baseArea);
    }

}