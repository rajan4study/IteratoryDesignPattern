/**
 * 
 */
package com.study.pattern.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author 
 *
 */
public class Film2020 implements FilmIterator{
	private FilmInfo[] films;
	private int arrayIndex=0;
	
	public Film2020() {
		films=new FilmInfo[2];
		addFilm("2.0");
		addFilm("Petta");
	}

	private void addFilm(String movie) {
		FilmInfo film= new FilmInfo(movie);
		films[arrayIndex]=film;	
		arrayIndex++;
	}
	
	public Iterator<FilmInfo> getIterator() {
		return Arrays.asList(films).iterator();
	}
}
