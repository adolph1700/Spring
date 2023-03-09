package com.Learning.constructorInjection;

public class Employee {
		private int id;
		private String name;
		private Certi cert;
		
		@Override
		public String toString() {
			return name+":"+id+":"+cert;
		}

		public Employee(int id, String name, Certi cert) {

			this.id = id;
			this.name = name;
			this.cert=cert;
		}

		
}
