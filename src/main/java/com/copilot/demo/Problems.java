package com.copilot.demo;

public class Problems {



    //return sum of two numbers from the array which is equal to the target
public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }

    //How do you find the missing number in a given integer array of 1 to 100?
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return (nums.length*(nums.length+1)/2)-sum;
    }

    //How do you find the duplicate number on a given integer array?
    public int findDuplicate(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum-(nums.length*(nums.length-1)/2);
    }

    //How do you find the largest and smallest number in an unsorted integer array?
    public int[] largestAndSmallest(int[] nums) {
        int[] result = new int[2];
        int max = nums[0];
        int min = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        result[0]=max;
        result[1]=min;
        return result;
    }

    //How do you find all pairs of an integer array whose sum is equal to a given number?
    public int[][] findPairs(int[] nums, int target) {
        int[][] result = new int[nums.length][2];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[count][0]=nums[i];
                    result[count][1]=nums[j];
                    count++;
                }
            }
        }
        return result;
    }
        //https://dev.to/javinpaul/50-data-structure-and-algorithms-problems-from-coding-interviews-4lh2

    //How do you find duplicate numbers in an array if it contains multiple duplicates?
    public int[] findDuplicates(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    result[count]=nums[i];
                    count++;
                }
            }
        }
        return result;
    }

    //How do you remove duplicates from an array in place?
    public int[] removeDuplicates(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    result[count]=nums[i];
                    count++;
                }
            }
        }
        return result;
    }

    //How do you reverse an array in place in Java?
    public int[] reverseArray(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for(int i=nums.length-1;i>=0;i--){
            result[count]=nums[i];
            count++;
        }
        return result;
    }











}
