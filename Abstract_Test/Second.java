class Second {
    public static void main(String[] args) {
        Student Obj = new Student();

        System.out.println("Name: " + Obj.fname);
        System.out.println("Age: " + Obj.age);
        System.out.println("Graduation Year: " + Obj.graduationYear);
        Obj.study();
    }
}
