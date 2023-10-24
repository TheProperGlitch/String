public class MyString {
    String str = "";
    public MyString (String str_){
        str = str_;
    }
    int length() {
    return str.length();
        }
    String substring(int from){
        String sub;
        sub = str.substring(from, length());
        return sub;
    }
    String substring(int from, int to){
        String sub = str.substring(from, to);
        return sub;
    }
    
}