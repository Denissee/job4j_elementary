package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }
   public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4};
        int source = nums[0];
        int dest = nums.length - 1;
       int[] rls = swap(nums, source, dest);
        for (int i = 0; i < rls.length; i++) {
            System.out.println(rls[i]);
        }
    }
}

