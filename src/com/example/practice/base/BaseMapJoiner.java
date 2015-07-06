package com.example.practice.base;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Joiner;

public class BaseMapJoiner {
	public void baseMapJoiner() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Chuck Norris");
		map.put(2, "Iron Man");
		map.put(3, "Kick-Ass");
		
		String ranks = Joiner.on('\n').withKeyValueSeparator("->").join(map);
		
		/*
		 * Prints:
		 * 1 -> Chuck Norris
		 * 2 -> Iron Man
		 * 3 -> Kick-Ass
		 */
	}
}
