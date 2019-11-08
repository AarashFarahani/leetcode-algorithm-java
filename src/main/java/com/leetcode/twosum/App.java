package com.leetcode.twosum;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        int[] result = findTwoNumbers(new int[]{ 3, 6, 10, 2, 2 }, 13);
        print(result);

        result = findTwoNumbers(new int[]{ 3, 6, 10, 2, 2 }, 14);
        print(result);

        result = findTwoNumbers(new int[]{ 3, 6, 10, 2, 2 }, 4);
        print(result);

        result = findTwoNumbers(new int[]{ -82, 84, 85, -68, -18, -83, 2, -24, 52, 74 }, 86);
        print(result);

        result = findTwoNumbers(new int[]{ 2, 7, 11, 15 }, 9);
        print(result);
    }

    private static void print(int[] array) {
        if (array == null) {
            System.out.println("is None");
        } else {
            for (int item : array) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    private static int[] findTwoNumbers(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            Integer first = hashMap.get(target - nums[i]);

            if (first != null)
                return new int[]{first, i};

            hashMap.put(nums[i], i);
        }

        return null;
    }
}
