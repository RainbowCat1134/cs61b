public class printIndexed {

    public static void printIndexed(String s){
        String output = "";
        for(int i = 0;i < s.length();++i){
            output += s.charAt(i);
            output += (s.length() - 1 - i);
        }
        System.out.println(output);
    }

    public static void main(String[] args){
        String s = "I love apples";
        printIndexed(s);
    }

}
