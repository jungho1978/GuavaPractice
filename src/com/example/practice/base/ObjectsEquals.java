package com.example.practice.base;

import com.google.common.base.Objects;

public class ObjectsEquals {
	public class Employee {
		private String name;
		private Integer age;
		private Job job;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public Integer getAge() {
			return age;
		}
		
		public void setAge(Integer age) {
			this.age = age;
		}
		
		public Job getJob() {
			return job;
		}
		
		public void setJob(Job job) {
			this.job = job;
		}
		
		/*
		@Override
		public boolean equals(Object object) {
			if (!(object instanceof Employee)) {
				return false;
			}
			
			Employee that = (Employee)object;
			return (name == that.name || (name != null && name.equals(that.name)))
					&& (age == that.age || (age != null && age.equals(that.age)))
					&& job == that.job;
		}
		*/
		
		@Override
		public boolean equals(Object object) {
			if (!(object instanceof Employee)) {
				return false;
			}
			
			Employee that = (Employee)object;
			return Objects.equal(name, that.name)
					&& Objects.equal(age, that.age)
					&& job == that.job;
		}
	}
	
	public enum Job {
		CEO,
		DEVELOPER,
		DESIGNER
	}
}
