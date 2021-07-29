/**
 * 
 */
package com.study.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 
 *
 */
public class Film1990 implements FilmIterator{
	private ArrayList<FilmInfo> films;
	
	public Film1990() {
		films=new ArrayList<>();
		addFilm("Padayappa");
		addFilm("Muthu");
	}

	private void addFilm(String movie) {
		FilmInfo film= new FilmInfo(movie);
		films.add(film);	
	}
	
	public Iterator<FilmInfo> getIterator() {
		return films.iterator();
	}
}
