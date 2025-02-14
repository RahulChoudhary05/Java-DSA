package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Question1352 {
    public List<Integer> nums;
    int n;

    public Question1352() {
        n = 0;
        nums = new ArrayList<>();
    }
    
    public void add(int num) {
        if(num == 0 ){
            nums.clear();
            n = 0;
        } else{
            if(nums.isEmpty()){
                nums.add(num);
            } else{
                nums.add(nums.get(n-1) * num);
            }
            n++;
        }
    }
    
    public int getProduct(int k) {
        if(n < k){
            return 0;
        } else if(n == k){
            return nums.get(n-1);
        }
        return nums.get(n-1) / nums.get(n-k-1);
    }
}