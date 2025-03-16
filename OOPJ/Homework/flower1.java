class flower {
    private String name;
    private String color;
    private boolean hasFragrance;

    public flower(String name, String color, boolean hasFragrance) {
        this.name = name;
        this.color = color;
        this.hasFragrance = hasFragrance;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean hasFragrance() {
        return hasFragrance;
    }
}

class rose extends flower {
    private boolean hasThorns;

    public rose(String name, String color, boolean hasFragrance, boolean hasThorns) {
        super(name, color, hasFragrance);
        this.hasThorns = hasThorns;
    }

    public boolean hasThorns() {
        return hasThorns;
    }

    public void displayRoseDetails() {
        System.out.println("---- Rose Details ----");
        System.out.println("Flower Name: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("Has Fragrance: " + (hasFragrance() ? "Yes" : "No"));
        System.out.println("Has Thorns: " + (hasThorns() ? "Yes" : "No"));
    }
}

class lilly extends flower {
    private boolean iswaterplant;

    public lilly(String name, String color, boolean hasFragrance, boolean iswaterplant) {
        super(name, color, hasFragrance);
        this.iswaterplant = iswaterplant;
    }

    public boolean isWaterPlant() {
        return iswaterplant;
    }

    public void displayLillyDetails() {
                System.out.println("---- Lilly Details ----");
                System.out.println("Flower Name: " + getName());
                System.out.println("Color: " + getColor());
                System.out.println("Has Fragrance: " + (hasFragrance() ? "Yes": "No"));
                System.out.println("Is Water Plant: " + (isWaterPlant() ? "Yes" : "No"));
                }
}
public class flower1 {
    public static void main(String[] args) {
        rose r = new rose("Rose", "Red", true, true);
        lilly l = new lilly("Lilly", "White", true, false);
        r.displayRoseDetails();
        l.displayLillyDetails();
        }
}