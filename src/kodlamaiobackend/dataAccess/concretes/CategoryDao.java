package kodlamaiobackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;


import kodlamaiobackend.dataAccess.abstracts.CategoryDaoRepository;
import kodlamaiobackend.entities.concretes.Category;



public class CategoryDao implements CategoryDaoRepository {

	List<Category> categories;
	boolean check;
	
	public CategoryDao() {
		this.categories = new ArrayList<Category>();
		this.categories.add(new Category(1, "Programlama", null));
	}
	
	@Override
	public List<Category> getAll() {
		return categories;
	}

	@Override
	public void add(Category entity) {
		this.categories.add(entity);
		
	}

	@Override
	public void update(Category entity) {
		System.out.println(entity.getName() + " updated.");
		
	}

	@Override
	public void delete(int id) {
		for(Category course : this.categories) {
			if(course.getId() == id) {
				this.categories.remove(id);
				this.check=true;
			}
		}
		if(!check) {
			System.out.println("Category not found.");
		}
		
	}
}