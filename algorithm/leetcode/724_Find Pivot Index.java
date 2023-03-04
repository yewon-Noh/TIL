class Solution {
    public int pivotIndex(int[] nums) {
        int sum_left=0, sum_right=0;

        // 배열의 모든 값을 인덱스 1~끝까지 sum_right에 저장한다.        
        for (int i=1; i<nums.length; i++) {
            sum_right += nums[i];
        }

        // 피벗 인덱스를 계산한다.
        for (int i=0; i<nums.length; i++) {
            if(i != 0) {
                sum_right -= nums[i];
                sum_left += nums[i-1];
            }
            if(sum_right == sum_left) return i;
            System.out.println(sum_right + ", " + sum_left);
        }

        return -1;
    }
}