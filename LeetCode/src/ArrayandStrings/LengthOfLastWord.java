package ArrayandStrings;
//LeetCode problem 58
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.
import java.util.*;
public class LengthOfLastWord{
    public static int lengthOfLastWord(String s){
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i-=1;
        }
        final int lastIndex=i;
        while(i>=0 && s.charAt(i)!=' '){
            i-=1;
        }
        return lastIndex-i;
    }
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        int result=lengthOfLastWord(s);
        System.out.println(result);
    }
}