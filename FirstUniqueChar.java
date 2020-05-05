package com.example.demo.javaprogram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FirstUniqueChar {
	public int firstUniqChar(String s) {

		Map<Character,Integer> map=new LinkedHashMap<>(); 
		char[] ch=s.toCharArray();
		int index=-1;
		for(char c:ch) {
			if(!map.containsKey(c)) {
				map.put(c,1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		char firstchar = 0;
		Set<Entry<Character,Integer>> entryset=map.entrySet();
		for(Entry<Character,Integer> entrty:entryset) {
			if(entrty.getValue()==1) {
				firstchar=entrty.getKey();
				break;
			}
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==firstchar) {
				index=i;
			}
		}
		return index;
	}
}
