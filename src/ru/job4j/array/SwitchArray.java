package ru.job4j.array;

public class SwitchArray {
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[5];
        array[5] = temp;
        return array;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rls = SwitchArray.swapBorder(nums);
        for (int i = 0; i < rls.length; i++) {
        System.out.println(rls[i]);
    }
   }
}