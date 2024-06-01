package com.nt.test;

import com.nt.comp.Person;
import com.nt.factory.PersonFactory;
public class SoftwareCompany {

	public static void main(String[] args) {
		//software company need employee
				Person st= PersonFactory.getPerson("emp");
				st.work();

	}

}
