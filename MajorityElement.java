package com.example.demo.javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}
		int res = 0;
		map.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+   +entry.getValue());
		});
		Set<Entry<Integer, Integer>> entries = map.entrySet();
		for (Entry<Integer, Integer> entry : entries) {
			if (entry.getValue() > n / 2) {
				res = entry.getKey();
			}
		}
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 3 };
		int result=majorityElement(nums);
		System.out.println("result=="+result);
	}

}
