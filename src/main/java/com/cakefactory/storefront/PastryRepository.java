package com.cakefactory.storefront;

import org.springframework.data.repository.CrudRepository;


public interface PastryRepository extends CrudRepository<Pastry, String> {
	
}