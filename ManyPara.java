// Many Parameters 
public class ManyPara {
    int modelYear;
    String modelName;

    public ManyPara(int year, String name) {
        modelName = name;
        modelYear = year;
    }
    public static void main(String[] args) {
        ManyPara mycar = new ManyPara(1990, "GTR");
        System.out.println(mycar.modelYear + " " + mycar.modelName);
    }
}
