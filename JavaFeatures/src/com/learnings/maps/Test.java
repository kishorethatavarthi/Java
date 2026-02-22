package com.learnings.maps;

import java.util.Arrays;

public class Test {
	public static int getSecondLargest(int[] arr) {
		// code here
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		if (secondLargest == Integer.MIN_VALUE)
			return -1;

		return secondLargest;

	}
	
	public static int[] moveZeroes(int[] nums) {
        int zeroIndex = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroIndex = i;
                break;
            }
        }

        if(zeroIndex != -1){
            for(int i=zeroIndex+1;i<nums.length;i++){
                if(nums[i] != 0){
                    nums[zeroIndex++] = nums[i];
                    nums[i] = 0;
                }
            }
        }
        return nums;
    }
	
	public static int[] moveZerosNew(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		int counter = 0;
		for(int i=0;i<n;i++) {
			if(nums[i] != 0) {
				ans[counter++] = nums[i];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		//System.out.println(getSecondLargest(new int[] { 10, 5, 10, 2, 1, -1, -10 }));
		int[] arr = moveZerosNew(new int[] { 0, 10, 5, 10,0, 2, 1, -1, -10 });
		System.out.println(Arrays.toString(arr));
	}
}
