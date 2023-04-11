// Loop through an Array
// Can through the array elements with the for loop,
// and use the length property to specify how many time
// the loop should run
// Loop through an Array with For-each
public class ArrayLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // Using a for-each loop
        String[] color = {"red", "black", "white", "blue"};
        for (String i : color) {
            System.out.println(i);
        }
    }
}
