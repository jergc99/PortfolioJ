import java.util.Arrays;

public class Numero {
    public static void main(String[] args) {
        int[] array = {2,9,3,8,4,7,5};
        System.out.println(selec(array));
        
    }

    public static int selec(int[] array){
        Arrays.sort(array);
        int num=0;

        for (int i = 0; i < array.length; i++) {
            if (i==array.length) {
                break;
            }
            if(array[i]+1!=array[i+1]){
                num=array[i+1];
            }
        }
        return num;
    }
}
