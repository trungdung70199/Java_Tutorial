// Java Arrays
// Arrays are used to store multiple values in a single variable,
// instead of declaring separate variable for each value
// Access the element of an Array
// Change an Array Element
// To change the value of a specific element
// Array length use the length property
public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        //Array length
        System.out.println(cars.length);
    }
}
