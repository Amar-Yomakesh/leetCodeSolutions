import java.util.Arrays;

public class PivoteIndex {

    public static void main(String[] args) {
        int[] in = new int[]{1,7,3,6,5,6};
        int result = findPivoteIndx(in);
        System.out.println(result);
    }
    public static int[] sliceArray(int[] input, int strtIndx, int endIndx){
        int[] slice = new int[(endIndx - strtIndx)+1];
        for (int i = 0; i < slice.length ; i++) {
            slice[i] = input[i+strtIndx];
            }
        return slice;
        }
    public static int findPivoteIndx(int[] nums){
        int out = -1;
        int lsum = 0;
        int rsum = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(i+1 == nums.length){
                rsum = 0;
            } else {
                rsum = Arrays.stream(sliceArray(nums,i+1,nums.length -1)).sum();
            }
            if(i==0){
                lsum =0;
            } else {
                lsum = Arrays.stream(sliceArray(nums,0,i -1)).sum();
            }
            if (rsum == lsum ) {
                out = i;
                break;
            }
        }
        return out;
    }

}
