
/*Given an array of integers numbers and an 
 * integer target, return indices of the 
 * two numbers such that they add up to target.
*/

class Solution {
	public int[] twoSum(int[] nums, int target) {
		// int i;
		// int j;
		int[] answer = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					answer = new int[] { i, j };
				}
			}
		}
		return answer;
	}
}