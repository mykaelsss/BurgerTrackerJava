package com.javastack.spring.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javastack.spring.burgertracker.models.Burger;
import com.javastack.spring.burgertracker.repositories.BurgerRepository;


@Service
public class BurgerService {
	private final BurgerRepository burgerRepo;
	
	public BurgerService(BurgerRepository burgerRepo) {
		this.burgerRepo = burgerRepo;
	}
	//returns all burgers
	public List<Burger> allBurgers(){
		return burgerRepo.findAll();
	}
	//creates a burger
	public Burger createBurger(Burger burger) {
		return burgerRepo.save(burger);
	}
	//gets one burger
	public Burger findBurger(Long id) {
		Optional<Burger> optionalBurger = burgerRepo.findById(id);
		if(optionalBurger.isPresent()) {
			return optionalBurger.get();
		}
		else {
			return optionalBurger.orElse(null);
		}
	}
    //updates a burger
    public Burger updateBurger(Burger burger) {
    	return burgerRepo.save(burger);
    }
    //deletes a burger
    public void deleteBurger(Long id) {
    	burgerRepo.deleteById(id);
    }
}	
