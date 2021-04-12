package com.xworkz.hibernate.service;

import com.xworkz.hibernate.entity.CompanyEntity;

public interface CompanyService<CompanyEntity> {
	
	public boolean validAndSave(CompanyEntity entity);

}
