// The Do/While Loop: is a variant of the while loop
// This loop will execute the code block once.
/*Syntax:
do {
    // code block;
}
while (condition);
 */
public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }
}
