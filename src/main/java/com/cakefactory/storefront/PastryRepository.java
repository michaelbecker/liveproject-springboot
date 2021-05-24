package com.cakefactory.storefront;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface PastryRepository extends CrudRepository<Pastry, String> {
	
}