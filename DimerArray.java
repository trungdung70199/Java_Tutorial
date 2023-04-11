// Loop Through a Multi-Dimensional Array
// Can also a for loop inside another for loop to get
// the elements of a two-dimensional array
public class DimerArray {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; i++) {
            for(int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
