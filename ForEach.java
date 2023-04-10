// Java For Each Loop
// For each loop
/*Syntax:
for (type variableName : arrayName) {
    // code block
}
 */
// The following example outputs all element in the 
// carry array, using a for-each loop
public class ForEach {
    public static void main(String[] args) {
        String[] cars = {"Nissan", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
