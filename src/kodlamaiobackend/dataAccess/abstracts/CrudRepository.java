package kodlamaiobackend.dataAccess.abstracts;

import java.util.List;

public interface CrudRepository<T> {

	List<T> getAll();

	void add(T entity);

	void update(T entity);

	void delete(int id);

}
