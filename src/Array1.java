import java.lang.reflect.Array;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 99;
        numbers[1] = 3;
        numbers[2] = 679;

        System.out.println("Numbers array is: " + Arrays.toString(numbers));

        int[] arr = {11, 45, 23, 67};
        System.out.println("Arr is: " + Arrays.toString(arr));

        String[] myFriend = {"Utkarsh", "Dashrath", "Ayush", "Shivam Mamgain", "Kunal Poojari"};
        System.out.println("First element of myFriend: " + myFriend[0]);

        myFriend[0] = "Rahul Chauhan";
        System.out.println("Updated myFriend list is: " + Arrays.toString(myFriend));

        System.out.println("Length of the Array is: " + myFriend.length);

        System.out.println("Value at index 3: " + Array.get(myFriend, 3));

        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
    }
}
