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
        System.out.println("");
        MyString that = new MyString("Hello!");
        System.out.println(that.substring(1,3));
        System.out.println("Break");
        MyString full = new MyString("abcdefg");
        MyString chunk = new MyString("def");
        System.out.println(full.indexOf(chunk));
    }
    
}
