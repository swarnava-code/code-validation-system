package com.swarna.code.expectedImpl;

import java.util.*;

public class _15ThreeSumSolved {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        final int N = nums.length;
        final int T = 0; //target

        // handle edge case:: nums=[0,0,0,0], expected=[[0,0,0]], o/p: [[0,0,0],[0,0,0]]
        // remove duplicates list
        Set<List<Integer>> resSet = new HashSet<>();

        for (int i=0; i<N; i++) {
            int l=i+1, r=N-1;

            // handle edge case: sorting is good idea but what if multiple duplicates element is there
            if(i>0 && nums[i]==nums[i-1]) continue;

            while ( l < r ) {
                int sum = nums[i]+nums[l]+nums[r];
                if ( sum == T ) {
                    List<Integer> list = List.of(nums[i], nums[l], nums[r]);
                    resSet.add(list);
                    // move both pointer to find more possible comb.
                    l++;
                    r--;
                } else if(sum > T) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        // convert set to list
        return new ArrayList<>(resSet);
    }
}
