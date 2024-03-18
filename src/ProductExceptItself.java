public class ProductExceptItself {

  public int[] productExceptSelf(int[] nums) {
    int zeros = 0;
    int product = 1;
    int product_wo_zero = 1;

    for (int i : nums) {
      product = product * i;
      if (i != 0) {
        product_wo_zero = product_wo_zero * i;
      } else {
        zeros += 1;
      }
      if (zeros > 1) {
        return new int[nums.length];
      }
    }

    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        result[i] = product / nums[i];
      } else {
        result[i] = product_wo_zero;
      }

    }
    return result;
  }

}
