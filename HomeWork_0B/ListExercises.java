import java.util.*;

public class ListExercises {
    /*
    ListExercises.java has 4 different methods for you to complete:

    sum: This method takes a list List<Integer> L and returns the total sum of the elements in that list.
    If the list is empty, the method should return 0.

    evens: This method takes a list List<Integer> L and returns a new list containing the even numbers of the given list.
    If there are no even elements, it should return an empty list.

    common: This method takes two lists List<Integer> L1, List<Integer> L2 and returns a new list containing the items
    present in both of the two given lists. If there are no common items, it should return an empty list.

    countOccurrencesOfC: This method takes a list and a character List<String> words, char c and returns the number of
    occurrences of the given character in a list of strings. If the character does not occur in any of the words,
    it should return 0.

    For this part, you can import ArrayList.
    */

    public static int sum(List<Integer> L){
        int sum = 0;
        for(int num : L){
            sum += num;
        }
        return sum;
    }

    public static List<Integer> evens(List<Integer> L){
        List<Integer> lst = new ArrayList<>();

        if(L.isEmpty()){
            return lst;
        }
        else{
            for(int num : L){
                if(num % 2 == 0){
                    lst.add(num);
                }
            }
            return lst;
        }
    }

    public static List<Integer> common(List<Integer> L1, List<Integer> L2){
        List<Integer> L = new ArrayList<>();

        if(L1.isEmpty() || L2.isEmpty()){
            return L;
        }

        else{
            for(int i = 0;i < L1.size();++i){
                for(int j = 0;j < L2.size();++j){
                    if(L1.get(i).equals(L2.get(j))){
                        L.add(L1.get(i));
                        break;
                    }
                }
            }
            return L;
        }

        //1 3 5 7 9,7 3 2 11 4
    }

    public static int countOccurrencesOfC(char c, List<String> s){
        if(s.isEmpty()){
            return 0;
        }

        int count  = 0;

        for (String string : s) {
            for(int i = 0;i < string.length();++i){
                if(string.charAt(i) == c){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args){

        List<Integer> lst1 = new ArrayList<>(5);
        lst1.add(1);lst1.add(3);lst1.add(5);lst1.add(7);lst1.add(9);
        System.out.println(sum(lst1));

        List<Integer> lst2 = new ArrayList<>(5);
        lst2.add(7);lst2.add(3);lst2.add(2);lst2.add(11);lst2.add(4);
        System.out.println(evens(lst2));

        System.out.println(common(lst1, lst2));

        List<String> lst3 = new ArrayList<>();
        lst3.add("Apple");lst3.add("Juice");lst3.add("Pineapple");lst3.add("Dog");lst3.add("Bingbong");
        System.out.println(countOccurrencesOfC('e', lst3));

    }
}
