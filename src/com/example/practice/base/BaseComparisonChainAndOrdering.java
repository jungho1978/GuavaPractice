package com.example.practice.base;

import com.example.practice.base.BaseComparisonChain.Employee;
import com.example.practice.base.BaseComparisonChain.Job;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

public class BaseComparisonChainAndOrdering {
	public class Employee {
		private String name;
		private Integer age;
		private Job job;
		
		/*
		public int compareTo(Employee other) {
			int result = name.compareTo(other.name);
			if (result != 0) {
				return result;
			}
			
			result = age.compareTo(other.age);
			if (result != 0) {
				return result;
			}
			
			return job.compareTo(other.job);
		}
		*/
		
		public int compareTo(Employee other) {
			return ComparisonChain.start()
					.compare(name, other.name, Ordering.natural().nullsLast())
					.compare(age, other.age, Ordering.natural().reverse().nullsLast())
					.compare(job, other.job, Ordering.natural().nullsLast())
					.result();
		}
	}
	
	public enum Job {
		CEO,
		DEVELOPER,
		DESIGNER
	}
}
