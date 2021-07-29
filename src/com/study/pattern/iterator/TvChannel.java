/**
 * 
 */
package com.study.pattern.iterator;

import java.util.Iterator;

/**
 * @author 
 *
 */
public class TvChannel {
	private FilmIterator film1980;
	private FilmIterator film1990;
	private FilmIterator film2020;
	public TvChannel(FilmIterator film1980, FilmIterator film1990, FilmIterator film2020) {
		super();
		this.film1980 = film1980;
		this.film1990 = film1990;
		this.film2020 = film2020;
	}

	public void play() {
		playMovie(film1980.getIterator());
		playMovie(film1990.getIterator());
		playMovie(film2020.getIterator());
	}

	private void playMovie(Iterator<FilmInfo> iterator) {
		while(iterator.hasNext()) {
			FilmInfo film=iterator.next();
			System.out.println(film.getName());
			
		}
		
	}
}
