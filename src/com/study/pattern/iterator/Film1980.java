/**
 * 
 */
package com.study.pattern.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author 
 *
 */
public class Film1980 implements FilmIterator{
	private Hashtable<Integer,FilmInfo> films;
	private int arrayIndex=0;
	
	public Film1980() {
		films=new Hashtable<>();
		addFilm("Mannan");
		addFilm("Thiilu-Mullu");
	}

	private void addFilm(String movie) {
		FilmInfo film= new FilmInfo(movie);
		films.put(arrayIndex++, film);
	}
	
	public Iterator<FilmInfo> getIterator() {
		return films.values().iterator();
	}
}
