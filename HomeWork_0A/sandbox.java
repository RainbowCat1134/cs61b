public class sandbox {

    public static void HelloWorld(int x){
        for(int i = 0;i < x;++i){
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args){
        HelloWorld(2);

        String s = "hello";
        s += "world";
        s += 5;
        int sLength = s.length();
        String substr = s.substring(1,5);
        System.out.println(substr);
        char c = s.charAt(2);
        System.out.println(c);
        if(s.indexOf("hello") != -1){
            System.out.println("\"hello\" in s");
        }
        for(int i = 0;i < s.length();++i){
            char letter = s.charAt(i);
            System.out.println(letter);
        }
    }
}
