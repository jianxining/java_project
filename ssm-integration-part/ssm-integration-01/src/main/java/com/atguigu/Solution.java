package com.atguigu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public long[] distance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(nums[i])) {
                List<Integer> integers = new ArrayList<>();
                map.put(nums[i], integers);
            }
            List<Integer> integers = map.get(nums[i]);
            integers.add(i);
            map.put(nums[i], integers);
        }

        long[] ans = new long[len];
        for (int i = 0; i < len; i++) {
            List<Integer> integers = map.get(nums[i]);
            int a = integers.size();
            long[] prefixSum = new long[a + 1];
            for (int j = 1; j <= a; j++) {
                prefixSum[j] = prefixSum[j - 1] + integers.get(j-1);
            }
            int target = integers.get(i);
            long left = (long) target * i - (prefixSum[i]);
            long right = (prefixSum[a] - prefixSum[i]) - (long) (a - i) * target;
            ans[i] = left + right;
        }
        return ans;
    }
}

