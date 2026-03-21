import java.util.*;

public class MapExercises {
    /*
    MapExercises.java has 3 different methods for you to complete:

    letterToNum: This method returns a map from every lower case letter to the number corresponding to its ordering
    in the alphabet, where ‘a’ corresponds to 1 and ‘z’ corresponds to 26.
    */
    public static Map<Character, Integer> letterToNum(){
        Map<Character, Integer> map = new HashMap<>(26);
        char c = 'a';
        for(int i = 1;i <= 26;++i){
            map.put(c, i);
            c++;
        }
        return map;
    }

    /*
    squares: This method takes a list List<Integer> nums and returns a map from the integers in the list to their squares.
    If the given list is empty, it should return an empty map.
    */

    public static Map<Integer, Integer> squares(List<Integer> nums){
        Map<Integer, Integer> map = new HashMap<>();
        if(nums.isEmpty()){
            return map;
        }
        else{
            for(int number : nums){
                map.put(number, (int)Math.pow(number, 2));
            }
            return map;
        }
    }

    /*
    countWords: This method takes a list List<String> words and returns a map from words in the list to the number
    of times they appear. If the given list is empty, it should return an empty map.
    For this part, you can import TreeMap.
    */

    public static Map<String, Integer> countWords(List<String> words){
        Map<String, Integer> map = new TreeMap<>();
        if(words.isEmpty()){
            return map;
        }

        for(String s1 : words){
            if(map.containsKey(s1)){
                map.put(s1, map.get(s1) + 1);
            }
            else{
                map.put(s1, 1);
            }
        }

        return map;
    }


    public static void main(String[] args){
        // letterToNum
        System.out.println("letterToNum:");
        System.out.println(letterToNum());
        System.out.println();

        // squares
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println("squares:");
        System.out.println(squares(nums));
        System.out.println();

        // countWords
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("dog");
        words.add("banana");
        words.add("apple");

        System.out.println("countWords:");
        System.out.println(countWords(words));
    }
}
