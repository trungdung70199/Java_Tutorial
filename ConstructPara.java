// Constructor Parameters

public class ConstructPara {
    int a;
    public ConstructPara(int b) {
        a = b;
    }
    public static void main(String[] args) {
        ConstructPara myObj = new ConstructPara(20);
        System.out.println(myObj.a);
    }
}
