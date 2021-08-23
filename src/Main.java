import Search.JumpSearch;
import Search.LinearSearch;

public class Main {

    static long startTime = System.nanoTime();
    static long endTime = System.nanoTime();
    static void Start() {startTime = System.nanoTime();}
    static void End() {endTime = System.nanoTime(); System.out.println(endTime - startTime);}

    public static void main(String[] args) {

        long endTime = System.nanoTime();
        int[] array = {2,3,5,6,8,13,27,84,124,2004};

        //runs linear search
        Start();
        System.out.println(LinearSearch.Search(array, 84));
        End();

        //runs jump search
        Start();
        System.out.println(JumpSearch.Search(array, 84));
        End();

        //runs binary search
        Start();
        System.out.println(LinearSearch.Search(array, 84));
        End();
    }
}
