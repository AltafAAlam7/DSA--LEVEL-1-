import java.io.*;
import java.util.*;

public class Main {

  public static ArrayList<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
    //write your code here
    HashMap<Character,ArrayList<Integer>> map = new HashMap<>();

    for(int i=0;i<26;i++){
        map.put((char)('a'+i),new ArrayList<>());
    }

    for(String word:words){
        int mask = 0;
        for(Character ch: word.toCharArray()){
            mask = mask|(1<<(ch-'a'));
        }

        HashSet<Character> unique = new HashSet<>();

        for(Character ch : word.toCharArray()){
            if(unique.contains(ch))
                continue;
            unique.add(ch);
            map.get(ch).add(mask);
        }
    }

    ArrayList<Integer> ans = new ArrayList<>();

    for(String puzzle:puzzles){
        ArrayList<Integer> wordsToCheck = map.get(puzzle.charAt(0));
        int pmask =0;
        for(Character ch: puzzle.toCharArray()){
            pmask = pmask|(1<<(ch-'a'));
        }
        int count=0;
        for(int m:wordsToCheck){
            if((pmask & m) == m)
                count++;
        }

        ans.add(count);
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] words = new String[n];
    for (int i = 0 ; i < words.length; i++) {
      words[i] = scn.next();
    }
    int m = scn.nextInt();
    String[] puzzles = new String[m];
    for (int i = 0 ; i < m ; i++) {
      puzzles[i] = scn.next();
    }
    ArrayList<Integer> ans = findNumOfValidWords(words, puzzles);
    for (int i = 0 ; i < m ; i++) {
      System.out.println(puzzles[i] + " -> " + ans.get(i));
    }
  }

}