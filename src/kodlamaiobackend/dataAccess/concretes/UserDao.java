package kodlamaiobackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaiobackend.dataAccess.abstracts.UserDaoRepository;
import kodlamaiobackend.entities.concretes.User;



public class UserDao implements UserDaoRepository {

	List<User> users;
	boolean check;
	
	public UserDao() {
		this.users = new ArrayList<User>();
		this.users.add(new User(0, "Yagmur", "Teke", "yct@gmail.co", "img.jpg"));
	}
	
	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public void add(User entity) {
		this.users.add(entity);
		
	}

	@Override
	public void update(User entity) {
		System.out.println(entity.getFirstName() + " updated.");
		
	}

	@Override
	public void delete(int id) {
		for(User user : this.users) {
			if(user.getId() == id) {
				this.users.remove(id);
				this.check=true;
			}
		}
		if(!check) {
			System.out.println("User not found.");
		}
		
	}

}
