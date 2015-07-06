package com.example.practice.base;

import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

public class BaseJoiner {
	List<String> heroes = Lists.newArrayList("Kick-Ass", "Iron Man", "Chuck Norris");
	String names = Joiner.on(",").join(heroes);
	// "Kick-Ass, Iron Man, Chuck Norris"
	
	List<String> heroes2 = Lists.newArrayList("Kick-Ass", "Iron Man", null, "Chuck Norris");
	String names2 = Joiner.on(",").join(heroes2);
	// throw NullPointerException
	
	// Case Study 1
	List<String> heroes3 = Lists.newArrayList("Kick-Ass", "Iron Man", null, "Chuck Norris");
	String names3 = Joiner.on(",").skipNulls().join(heroes3);
	// "Kick-Ass, Iron Man, Chuck Norris"
	
	// Case Study 2
	List<String> heroes4 = Lists.newArrayList("Kick-Ass", "Iron Man", null, "Chuck Norris");
	String names4 = Joiner.on(",").useForNull("Invisible Man").join(heroes4);
	// prints "Kick-Ass, Iron Man, Invisible Man, Chuck Norris"
}
