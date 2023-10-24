public class Main {
    private static int[] reverse(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0 ; i < array.length ; i++){
            newArray[i] = array[array.length - i-1];
        }
        return newArray;
    }
    public static void main(String[] args){
        int[] test = {0,1,2,3};
        for (int i = 0; i < test.length; i++)
        System.out.print(reverse(test)[i]+",");

    }
}
