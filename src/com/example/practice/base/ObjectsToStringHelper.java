package com.example.practice.base;

import com.google.common.base.Objects;

public class ObjectsToStringHelper {
	public class Employee {
		private String name;
		private Integer age;
		private Job job;
		
		/*
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(Employee.class.getSimpleName());
			sb.append("{name=").append(name);
			sb.append(",age=").append(age);
			sb.append(",job=").append(job);
			sb.append('}');
			return sb.toString();
		}
		*/
		
		@Override
		public String toString() {
			return Objects.toStringHelper(this)
					.add("name", name)
					.add("age", age)
					.add("job", job)
					.toString();
		}
	}
	
	public enum Job {
		CEO,
		DEVELOPER,
		DESIGNER
	}
}
