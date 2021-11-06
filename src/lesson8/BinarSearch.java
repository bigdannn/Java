package lesson8;

import java.util.Arrays;

public class BinarSearch {
    public static void main(String[] args) {

        int[] numbers = {4, 66, 33, 73, 52, 70, 90, 101};

        int key = 33;

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high){

            int mid = (low + high)/2;

            if (numbers[mid]==key){
                System.out.println(mid);
                break;
            } else if (numbers[mid] < key){
                low = mid + 1;
            }else if (numbers[mid] > key){
                high = mid - 1;
            } else {
                System.out.println(mid);
                break;
            }

        }


    }
}