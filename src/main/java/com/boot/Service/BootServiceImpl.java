package com.boot.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.Exceptions.ResourceNotFoundException;
import com.boot.Model.Boot;
import com.boot.Repository.BootRepository;

@Service
public class BootServiceImpl implements BootService {

	@Autowired
	private BootRepository bootRepo;

	@Override
	public Boot createBoot(Boot boot) {
		return this.bootRepo.save(boot);
	}

	@Override
	public List<Boot> getAllBoot() {
		return this.bootRepo.findAll();
	}

	@Override
	public Boot getBootById(int id) {
		Boot boot = this.bootRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Boot", "Id", id));
		return boot;
	}

	@Override
	public void deleteById(int id) {
		Boot deleteBoot = this.bootRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Boot", "Id", id));
		this.bootRepo.delete(deleteBoot);
	}

	@Override
	public Boot updateBoot(int id) {
		Boot bootUpdate = this.bootRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Boot", "Id", id));
		return  bootUpdate ;
	}

}
