package com.example.practice.base;

import com.google.common.base.Objects;

public class ObjectsHashCode {
	public class Employee {
		private String name;
		private Integer age;
		private Job job;
		
		/*
		@Override
		public int hashCode() {
			int result = name != null ? name.hashCode() : 0;
			result = 31 * result + (age != null ? age.hashCode() : 0);
			result = 31 * result + (job != null ? job.hashCode() :0);
			return result;
		}
		*/

		@Override
		public int hashCode() {
			return Objects.hashCode(name, age, job);
		}
	}
	
	public enum Job {
		CEO,
		DEVELOPER,
		DESIGNER
	}
}
