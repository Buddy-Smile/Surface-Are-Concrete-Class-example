public class ShapeArray { //This is is the driver class with instances and loop
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
        
        // Instances
        shapeArray[0] = new Sphere(4.9); //input the correct values
        shapeArray[1] = new Cylinder(6.6, 9.8);
        shapeArray[2] = new Cone(8.6, 10.1); 

        // Looping the Array
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}