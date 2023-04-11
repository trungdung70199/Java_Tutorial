// Java Multi-Dimensional Arrays
// Multidimensional Arrays
// A multidimensional array is an array of arrays
// Change Element Values: can change the value of an element
public class MultiArray {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][1]);
        // Change Element Values
        int[][] Numbers = { {8, 9, 10, 11}, {12, 13, 14, 15} };
        Numbers[1][2] = 20;
        System.out.println(Numbers[1][2]);
    }
}
