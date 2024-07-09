public abstract class Array {
    public static void main(String[] args) {
        // Q: store a roll no.
        int a = 19;

        // Q: store name
        String name = "Rahul";

        // Q: store 50 roll no.
        int roll1 = 19;
        int roll2 = 19;
        int roll3 = 19;
        int roll4 = 19;
        // this is incorrect

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 10 roll no.
        // int[] rollNumbers = new int[10];
        // ore directly write
        // int [] directlyRollNumber = {10,20,30,40,50,60};

        int[] ros; // declaration of array. ros is getting defined in the stack - (compile time)
        ros = new int[5]; // initialization of array. ros is pointing to the memory(creating object in
                          // heap memory) - (run time Dynamic memory allocation)

        // new is a keyword the is use to create an object
        // System.out.println(ros[3]);

        String[] arr = new String[4];
        System.out.println(arr[3]);
    }
}
