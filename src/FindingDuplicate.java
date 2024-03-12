import java.util.HashMap;
import java.util.Map;
class FindingDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Map<Integer, Integer> lookup = new HashMap<Integer, Integer>();
    for(int i :nums){
      if (lookup.containsKey(i)){
        return true;
      }
      else{
        lookup.put(i, 1);
      }
    }
    return false;
  }
}

