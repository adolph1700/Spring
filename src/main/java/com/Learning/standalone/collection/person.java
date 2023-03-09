package com.Learning.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {
	private List<String> Name;




	public List<String> getName() {
		return Name;
	}



	public void setNName(List<String> Name) {
		Name = Name;
	}



	private List<String> cConsole;
	public List<String> getcConsole() {
		return cConsole;
	}



	public void setcConsole(List<String> cConsole) {
		this.cConsole = cConsole;
	}



	private Map<String,Integer> feestructure;
	private Properties property;


	public Properties getProperty() {
		return property;
	}



	public void setProperty(Properties property) {
		this.property = property;
	}










	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}



	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}



	@Override
	public String toString() {
		return "person [Name=" + Name + ", feestructure=" + feestructure + ", property=" + property + "]";
	}
	
}
