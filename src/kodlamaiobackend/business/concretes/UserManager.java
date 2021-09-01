package kodlamaiobackend.business.concretes;

import java.util.List;

import kodlamaiobackend.business.abstracts.UserService;
import kodlamaiobackend.dataAccess.concretes.UserDao;
import kodlamaiobackend.entities.concretes.User;

public class UserManager implements UserService{

	UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

	@Override
	public void add(User entity) {
		this.userDao.add(entity);
		
	}

	@Override
	public void update(User entity) {
		this.userDao.update(entity);
		
	}

	@Override
	public void delete(int id) {
		this.userDao.delete(id);
		
	}
}
