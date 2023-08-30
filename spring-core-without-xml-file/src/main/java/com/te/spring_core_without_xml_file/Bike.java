package com.te.spring_core_without_xml_file;

import org.springframework.beans.factory.annotation.Autowired;

public class Bike implements vehicle {
	@Autowired
        private Tyre tyre;
	Bike(){}
        
	public Tyre getTyre() {
			return tyre;
		}

		public void setTyre(Tyre tyre) {
			this.tyre = tyre;
		}

	@Override
	public void drive() {
		System.out.println("riding Bikes");
		tyre.m1();

	}

}
