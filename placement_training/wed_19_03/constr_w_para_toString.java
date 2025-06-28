package placement_training.wed_19_03;

class M_Class {
    private int var1;
    private String var2;

    // Constructor
    public M_Class(int var1, String var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "var1: " + var1 + ", var2: " + var2;
    }
}

public class constr_w_para_toString {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        M_Class obj = new M_Class(10, "Hello World");
        
        // Printing the object, which invokes toString automatically
        System.out.println(obj);
    }
}

