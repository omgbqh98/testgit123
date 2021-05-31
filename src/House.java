import java.util.HashMap;
import java.util.Map;

// class biểu diễn cho cái nhà
public class House {
    static public String getType(){
        return "house";
    }
}

// class biểu diễn cho lâu đài
class Edifice {
    public String getType(){
        return "edifice";
    }
}

class BuildingFactory {
    private static Map<String, Building> instances;

    static {
        instances = new HashMap<>();

        instances.put("house", (Building) new House());
        instances.put("edifice", (Building) new Edifice());
    }



    public static <T> T getBuilding(String type){
        return (T) instances.get(type);
    }

    public static void main(String[] args) {
        // Khởi tạo object
        Building building = BuildingFactory.getBuilding("house");

        System.out.println(building);
    }
}

 