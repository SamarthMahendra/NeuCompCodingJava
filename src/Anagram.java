import java.util.HashMap;
import java.util.Map;

public class Anagram {

  public Boolean checkAnagram(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    }
    Map<Character, Integer> d1 = new HashMap<>();
    Map<Character, Integer> d2 = new HashMap<>();

    for (char c : a.toCharArray()) {
      d1.put(c, d1.getOrDefault(c, 0) + 1);
      for (char x : b.toCharArray()) {
        d2.put(x, d2.getOrDefault(x, 0) + 1);
        if (d1.equals(d2)) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] d = new int[26];
    for (char c : s.toCharArray()) {
      d[c - 'a']++;
    }
    for (char x : t.toCharArray()) {
      d[x - 'a']--;
    }
    for (int i : d) {
      if (i != 0) {
        return false;
      }
    }
    return true;


  }

}