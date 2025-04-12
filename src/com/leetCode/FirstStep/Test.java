package com.leetCode.FirstStep;

/**
 * @author 张英琪
 */
public class Test {
    public static int test1(int nums[]){
        //找数组中连续1的最大长度
        int count = 0;
        int maxTimes = 0;
        for(int i = 0;i< nums.length;i++){
            if(nums[i] == 1){
                count++;
                maxTimes = Math.max(count,maxTimes);
            }else {
                count= 0;
            }
        }
        return maxTimes;
    }
    public static int test2(int nums[],int val){
        //移除元素，返回数组中和某个数不相等的元素的个数
        int left = 0;
        int right = 0;
        for(;right < nums.length; right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
    public static int test3(int nums[]){
    int n = nums.length;
        if(n == 0){
        return 0;
    }
    int fast = 1;
    int slow = 1;
        while(fast < n){
        if(nums[fast] != nums[fast-1]){
            nums[slow] = nums[fast];
            slow++;
        }
        fast++;
    }
        return slow;
}
