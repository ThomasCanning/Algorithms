package Search;

public class JumpSearch {

    public static int Search(int[] array, int target) {

        int jump = (int) Math.floor(Math.sqrt(array.length));
        int previous = 0;

        while (array[Math.min(jump, array.length)-1]<target) {
            previous = jump;
            jump+=jump;
            if(previous>target)return -1;
        }

        for(int i=previous; i<jump;i++) {
            if(target==array[i]) return i;
        }
        //Doesn't exist in array
        return -1;
    }

}
