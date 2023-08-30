package com.te.spring_core_without_xml_file;

public class Car implements vehicle {

	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void drive() {
		System.out.println("drivinf car");

	}

}
