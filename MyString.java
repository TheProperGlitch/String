public class MyString {
    String st = "";
    private char[] ar;
    public MyString (String str){
        ar = new char[str.length()];
        for (int i = 0; i < str.length() ; i++){
        ar[i] = str.charAt(i);
        }
    }
    int length(){
        return ar.length;
    }
    MyString substring(int start, int end){
        MyString subs = new MyString("");
        subs.ar = new char[end-start];
        int k = 0;
        for(int i = start; i < end; i++){ 
            subs.ar[k] = ar[i];
            k++;
        }
        return subs;
    }
    int compareTo(MyString other){
        int answer = 0;
        for(int i = 0; i < ar.length; i++){
            answer += (int)(other.ar[i] - this.ar[i]);
        }
        return answer;
    }
    int indexOf(MyString str){
        boolean found = true;
        for(int i = 0; i < ar.length - str.ar.length; i++){
            found = true;
                for (int j = 0 ; j < str.ar.length && found; j++){
                    if( !(ar[i+j] == str.ar[j]) ) {
                        found = false;
                    }
                        
                }
            if (found) {
                return i;
            }
            }
            return -1;

    }
    }   
    
    
