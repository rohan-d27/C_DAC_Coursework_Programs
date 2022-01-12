package study.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.MyRepository;
import study.entity.ProductEntity;

@Service
public class MyProductDAO {
	@Autowired
	MyRepository repo;
	
	public void addProduct(int id, int cost, String name, String information) {
		ProductEntity p = new ProductEntity(id,cost,name,information);
		repo.save(p);
		
	}
	
	
	public List<ProductEntity> getProducts() {
		
		return repo.findAll();
	}
	
	
	
	public Optional<ProductEntity> findProduct(int id)
	{
		Optional<ProductEntity> p= repo.findById(id);
		
		return p;
	}

	public void delProduct(int id) {
		
		repo.deleteById(id);
	}
	
	public void update(int id,int cost)
	{
		ProductEntity p=repo.getById(id);
		p.setCost(cost);
		repo.save(p);
		
	}

}
