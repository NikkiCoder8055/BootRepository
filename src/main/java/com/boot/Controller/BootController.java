package com.boot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.Exceptions.ResourceNotFoundException;
import com.boot.Model.Boot;
import com.boot.Service.BootService;
import com.boot.Util.apiResponse;

@RestController
@RequestMapping("/api")
public class BootController {

	@Autowired
	private BootService bootService;
	
	@PostMapping("/")
	public ResponseEntity<Boot> CreateNewBoot(@RequestBody Boot boot){
		Boot createBoot = this.bootService.createBoot(boot);
		return new ResponseEntity<>(createBoot,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Boot>> getAllBoot(){
		List<Boot> allBoot = this.bootService.getAllBoot();
		return new ResponseEntity<List<Boot>>(allBoot,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Boot> getBootByID(@PathVariable int id){
		Boot bootById = this.bootService.getBootById(id);
		return new ResponseEntity<>(bootById,HttpStatus.OK);	
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<apiResponse> deleteBoot(@PathVariable int id){
		this.bootService.deleteById(id);
		return new ResponseEntity<apiResponse>(new apiResponse("Deleted Succesfully", true),HttpStatus.OK);	
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Boot> UpdateBoot(@RequestBody Boot boot,@PathVariable int id){
    	Boot bootById = this.bootService.getBootById(id);
    	if(bootById == null) {
    		return new ResponseEntity<Boot>(HttpStatus.NOT_FOUND);
    	}
    	boot.setId(id);
    	Boot updateBoot = this.bootService.createBoot(bootById);
    	return new ResponseEntity<Boot>(updateBoot,HttpStatus.OK);
    }
}
