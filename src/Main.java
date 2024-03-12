// import FindingDuplicate


public class Main {

  public static void main(String[] args) {
    // test finding Duplicate
    FindingDuplicate findingDuplicate = new FindingDuplicate();
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(findingDuplicate.containsDuplicate(nums));
    int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
    System.out.println(findingDuplicate.containsDuplicate(nums2));


  }
}