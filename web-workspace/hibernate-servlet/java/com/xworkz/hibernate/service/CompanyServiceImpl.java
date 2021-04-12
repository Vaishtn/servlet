package com.xworkz.hibernate.service;

import com.xworkz.hibernate.entity.CompanyEntity;

public class CompanyServiceImpl  implements CompanyService<CompanyEntity>{

	@Override
	public boolean validAndSave(CompanyEntity entity) {
		boolean valid=false;
		if (entity!=null) {
			System.out.println("entity is not null,will validate feilds");
		}
		if(valid) {
			String name=entity.getName();
			if(name!=null && name.length()>3 && name.length()<=20) {
				System.out.println("name is valid");
				valid=true;
				
			}
			else {
				System.out.println("name is not valid");
				valid=false;
			}
			
		}
		if(valid) {
			String email=entity.getEmail();
			if(email!=null && email.contains("@") && email.endsWith(".com")) {
				System.out.println("email is valid");
				valid=true;
				
			}
			else {
				System.out.println("email is not valid");
				valid=false;
			}
		
		}
		if(valid) {
			String phone=entity.getPhone();
			if(phone!=null && phone.length()==10) {
				System.out.println("phone is valid");
				valid=true;
				
			}
			else {
				System.out.println("phone is not valid");
				valid=false;
			}
		}
		if(valid) {
			String company=entity.getCompany();
			if(company!=null && company.length()>3) {
				System.out.println("company is valid");
				valid=true;
				
			}
			else {
				System.out.println("company is not valid");
				valid=false;
			}
		
		
		
	}
		return valid;

	

}
}