public class stutter {

    public static String stutter(String s){
        String output = "";
        for(int i = 0;i < s.length();++i){
            output += s.charAt(i);
            output += s.charAt(i);
        }
        return output;
    }

    public static void main(String[] args){
        String s = "Thank u for watching..";
        System.out.println(stutter(s));
    }
}
