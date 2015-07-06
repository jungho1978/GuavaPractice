package com.example.practice.base;

import com.google.common.collect.*;

public class BaseComparisonChain {
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
					.compare(name, other.name)
					.compare(age, other.age)
					.compare(job, other.job)
					.result();
		}
	}
	
	public enum Job {
		CEO,
		DEVELOPER,
		DESIGNER
	}
}
