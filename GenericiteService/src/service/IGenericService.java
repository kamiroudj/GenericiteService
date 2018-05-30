package service;

import java.util.List;

public interface IGenericService<T> {
	
	public void ajouter (T t);
	public void supprimer(T t);
	public List<T> listerTout();
	public void modifier (T t);
	public T rechercher(int id);
	public void affiche(List<T> liste);

}
