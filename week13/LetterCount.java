// Adam Poliak
// 12/01
// Recursive solution for counting how many letters appear in a string

// Write a program, LetterCount.java, 
// that counts the number of times each character 
// appears in a given string, using a hashmap
import java.util.HashMap;

public class LetterCount {

    public static HashMap<Character,Integer> buildLookUp(String problem, HashMap<Character,Integer> map) {

        //base case
        if (problem.length() == 0) {
            return map;
        }
        char firstChar = problem.charAt(0);
        if (!map.containsKey(firstChar)) {
            map.put(firstChar, 0);
        }
        map.put(firstChar, map.get(firstChar) +1);
        return buildLookUp(problem.substring(1), map);
    }

    public static void main(String[] args) {

        String name = "jhgrejkiujgfeghjyktubgrvfebntmyjkumjynhtbgvfbnmu,kikyumjyntbgrvfbnymtu,mjynhtbgrvfm,imubgtnkbgrvbtnymukiubtgrvfbnmu,umntbvfcd vrbnmuybgvfecvnmntbgrvfecvbntbrvcdwevbnmny";
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        String s3 = "assdddffffggggghhhhhhjjjjjjjkkkkkkkklllllllll";

        String s1 = "aaaaa";
        map = buildLookUp(s3, map);


        for (Character c:  map.keySet()) {
            System.out.println(c + " " + map.get(c));
        }


        //iterate through each character in the string
        //increase our counter for the charater:

 
    }
    
}
