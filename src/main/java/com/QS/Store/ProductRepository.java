/**
 * 
 */
package com.QS.Store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.QS.Store.Models.Product;

/**
 * @author Moham
 *
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	

}
