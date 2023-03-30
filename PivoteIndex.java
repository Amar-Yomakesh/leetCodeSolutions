import java.util.Arrays;

public class PivoteIndex {

//    public static void main(String[] args) {
//        int[] in = new int[]{2,1,-1};
//        int result = findPivoteIndx(in);
//        System.out.println(result);
//    }

    public static int findPivoteIndx(int[] nums){
        int sum = 0;
        int lsum =0;
        int out = -1;
        for (int x: nums) {
            sum +=x;
        }
        for (int i = 0; i < nums.length; i++) {
            if (lsum == sum - nums[i] - lsum){
                out = i;
                break;
            }
            else {
                lsum +=nums[i];
            }
        }
        return out;
    }
}
