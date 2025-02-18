public class Question2375 {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        Stack<Character> st = new Stack<>();
        StringBuilder num = new StringBuilder();
        int count = 1;

        for(int i = 0; i <= n; i++){
            st.push((char)(count + '0')); //covert int to char
            count++;

            if(i == n || pattern.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    num.append(st.pop());
                }
            }
        } 
        return num.toString();
    }
}