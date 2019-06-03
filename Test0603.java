/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
*/
package lianxi0603;

public class Test0603 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "jbpnbwwd";
        System.out.println(s.lengthOfLongestSubstring(str));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] nums = new int[128];
        int i = 0; //检查元素下标开始位置
        for (int j = 0; j < n; j++) {
            i = Math.max(nums[s.charAt(j)], i);  //如果出现重复元素，i变为第一个重复元素下标
            ans = Math.max(ans, j - i + 1);//现在所处下标-开始检查下标+1
            nums[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}

