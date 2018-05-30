package service;

import java.util.ArrayList;
import java.util.List;


public abstract class ServiceGeneriqueImpl<T> implements IGenericService<T>{
	
	private List<T> listT = new ArrayList<T>();

	@Override
	public void ajouter(T t) {
		listT.add(t);
		
	}

	@Override
	public void supprimer(T t) {
		listT.remove(t);
		
	}

	@Override
	public List<T> listerTout() {
		return listT;
	}

	@Override
	public void modifier(T t) {
		listT.set(listT.indexOf(t), t);
		
	}

	@Override
	public T rechercher(int id) {
		return listT.get(id);
	}

	@Override
	public void affiche(List<T> liste) {
		for (T t : liste) {
			System.out.println(t);
		}
		
	}

}
