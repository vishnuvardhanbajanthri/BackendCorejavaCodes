package com.cg.doselect;

import java.util.ArrayList;
import java.util.HashMap;

class Mobile{
	
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	
	public String  addMobile(String company, String model) {
		ArrayList<String> lst=new ArrayList<String>();

		if(!mobiles.containsKey(company)){
			lst.add(model);
			mobiles.put(company,lst);
		}
		else{
			lst = mobiles.get(company);
			lst.add(model);
			mobiles.put(company,lst);
		}
		return("model successfully added");
		
	}
	
	public ArrayList<String> getModels(String company) {
		
		return null;
		
	}
	
	public String buyMobile(String company, String model) {
		
		return model;
		
	}
}

	public class Source2 {
	public static void main(String args[] ) throws Exception {
		
		   
		  
		
	}
}
