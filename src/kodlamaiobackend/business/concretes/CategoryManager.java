package kodlamaiobackend.business.concretes;

import java.util.List;

import kodlamaiobackend.business.abstracts.CategoryService;
import kodlamaiobackend.dataAccess.concretes.CategoryDao;
import kodlamaiobackend.entities.concretes.Category;

public class CategoryManager implements CategoryService{

	private CategoryDao categoryDao;
	
	
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public List<Category> getAll() {
		return this.categoryDao.getAll();
	}

	@Override
	public void add(Category entity) {
		
		if(entity.getCourse()== null) {
			System.out.println("You can't add a category without any course in it.");
		}else {
			System.out.println("New category added to database.");
			this.categoryDao.add(entity);
		}
		
	}

	@Override
	public void update(Category entity) {
		this.categoryDao.update(entity);
		
	}

	@Override
	public void delete(int id) {
		this.categoryDao.delete(id);
		
	}

}
