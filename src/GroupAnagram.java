import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GroupAnagram {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for(String word: strs){
      char[] words = word.toCharArray();
      Arrays.sort(words);
      String key = new String(words);
      if(!map.containsKey(key)){
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(word);
    }
    return new ArrayList<>(map.values());
  }
}


