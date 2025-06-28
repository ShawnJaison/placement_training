package placement_training.wed_19_03;

class MyClass {
    public String var1 = "Hello";
    public int var2 = 42;

    public MyClass() {
        // No-argument constructor
    }

    public String toString() {
        return "var1: " + var1 + ", var2: " + var2;
    }
}

public class constr_no_para_toString {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj);
    }
}
