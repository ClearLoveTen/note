package _17_电话号码字母的组合;

import java.util.*;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/4 15:11
 */
public class Solution {
    List<String> list = new ArrayList<>();
    Map<Character, List<Character>> map = new HashMap<>();
    int size = 0;

    public List<String> letterCombinations(String digits) {

        if (digits.length()==0||digits==""){
            return list;
        }
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));


        char[] chars = digits.toCharArray();

        AA(chars, new StringBuilder());


        return list;
    }

    public void AA(char[] chars, StringBuilder stringBuilder) {

        if (size == chars.length) {

            list.add(stringBuilder.toString());

        }

        List<Character> characters = map.get(chars[size]);

        for (int i = 0; i < characters.size(); i++) {

            stringBuilder.append(characters.get(i));
            size++;
            if (size == chars.length) {
                list.add(stringBuilder.toString());
            } else {
                AA(chars, stringBuilder);
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            size--;
        }


    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.letterCombinations("23");
    }
}
