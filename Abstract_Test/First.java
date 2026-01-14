abstract class First {
    public String fname = "John";
    public int age = 20;
    public abstract void study();

}

class Student extends First {
    public int graduationYear = 2020;
    public void study() {
        System.out.println("Studying All Day");
    }
}
