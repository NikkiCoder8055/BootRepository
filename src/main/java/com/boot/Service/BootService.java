package com.boot.Service;

import java.util.List;

import com.boot.Model.Boot;

public interface BootService {
	
	Boot createBoot(Boot boot);
	
	List<Boot> getAllBoot();
	
	Boot getBootById(int id);
	
	void deleteById(int id);
	
	Boot updateBoot(int id);
	
	

}
