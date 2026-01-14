public class Encapsulation {
    private String name; 

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        // Error
        //obj.name = "John"
        // System.out.println(obj.name)

        // No Error
        obj.setName("John");
        System.out.println(obj.getName());
    }
}
