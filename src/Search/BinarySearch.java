package Search;

public class BinarySearch {

    public static int Search(int[] array, int target) {

        //Searching algorithm that works by dividing the list by half and ignoring the list without the target, then repeating on the
        //remaining list until the target is found

        int start = 0;
        int end = array.length-1;

        while(start<=end) {

            int mid = start + end /2;

            if (target==array[array.length/2]) return mid;
            else if (target<array[mid]) end = mid -1;
            else if (target>array[mid]) end = mid +1;

        }

        //Doesn't exist in array
        return -1;
    }
}
