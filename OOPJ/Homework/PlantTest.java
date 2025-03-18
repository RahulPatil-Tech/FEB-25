// Interface Photosynthesis
interface Photosynthesis {
    void absorbSunlight();
}
interface Respiration {
    void releaseOxygen();
}
class Plant implements Photosynthesis, Respiration {
    private String plantName;

    public Plant(String name) {
        this.plantName = name;
    }

    public String getPlantName() {
        return plantName;
    }
    public void absorbSunlight() {
        System.out.println(plantName + " is absorbing sunlight for photosynthesis.");
    }
    public void releaseOxygen() {
        System.out.println(plantName + " is releasing oxygen through respiration.");
    }
}
public class PlantTest {
    public static void main(String[] args) {
        Plant mangoTree = new Plant("Mango Tree");
        Plant fern = new Plant("Fern");

        System.out.println(mangoTree.getPlantName());
        mangoTree.absorbSunlight();
        mangoTree.releaseOxygen();

        System.out.println("\n" + fern.getPlantName());
        fern.absorbSunlight();
        fern.releaseOxygen();
    }
}
