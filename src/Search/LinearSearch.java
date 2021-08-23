package Search;

public class LinearSearch {
    public static int Search(int[] array, int target) {
        for(int i=0; i<array.length;i++)
            if (array[i] == target) {
                return i;
            }
        //Doesn't exist in array
        return -1;
    }
}
