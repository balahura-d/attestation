package main.dao;

public interface GlobalDao<T> {
	public void create (T obj);
	public T read (int id);
	public void update (T obj);
	public void delete (int id);
}
