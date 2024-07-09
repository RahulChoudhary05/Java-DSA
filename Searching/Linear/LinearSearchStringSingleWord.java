public class LinearSearchStringSingleWord {
    public static void main(String[] args) {
        String name = "Rahul";
        char target ='u';
        String notFound = "Element not found";
        int result = LinearSearchCode(name, target);
        // Pass the notFound string as well
        if (result == -1) {
            System.out.println(notFound); // If result is -1, print the notFound message
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    static int LinearSearchCode(String name, char target){
        if(name.length() == 0){
            return -1;
        }

        //run for loop
        for(int index = 0; index < name.length(); index++){
            if(name.charAt(index) == target){
                return index;
            }
        }

        return -1;
    }
}
