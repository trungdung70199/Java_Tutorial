// Halting Condition
// Use recursion to add all of the numbers between a to b
// OOP: Object Oriented Programming
// OOP is faster and easier to execute
// OOP provides a clear structure for the programs
// OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
// OOP makes it possible to create full reusable applications with less code and shorter development time
public class Sum {
    public static void main(String[] args) {
        int result = sum(5, 20);
        System.out.println(result);
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }    
}

