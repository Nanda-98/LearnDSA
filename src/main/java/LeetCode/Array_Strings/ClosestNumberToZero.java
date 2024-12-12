package LeetCode.Array_Strings;

public class ClosestNumberToZero {
    public static void main(String[] args) {

        int nums[] = {-4, 5, 3, -2};
        ClosestNumberToZero closest = new ClosestNumberToZero();
        System.out.println(closest.findClosestNumber(nums));
    }
        public int findClosestNumber(int[] nums) {

            int closestNumber = nums[0];
            for(int x : nums){
                if(Math.abs(x)<=Math.abs(closestNumber)){
                    closestNumber = x;
                }
            }

            if(closestNumber<0 && contains(nums,Math.abs(closestNumber))){
                return Math.abs(closestNumber);
            }
            else{
                return closestNumber;
            }
        }
        public boolean contains(int[]nums, int value){
            for(int y: nums){
                if(y == value){
                    return true;
                }
            }
            return false;
        }


}

