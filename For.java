// Java For Loop
// If known exactly how many times to loop through
// a block of code, use the for loop instead of a while loop
/*Syntax
for (state1; state2; state3) {
    // code block;
}
 */
public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for  (int a = 0; a <= 20; a = a + 2) {
            System.out.println(a);
        }
    }
}
