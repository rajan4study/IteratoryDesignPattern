/**
 * 
 */
package com.study.pattern.iterator;


/**
 * @author
 *
 */
public class RajiniFest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FilmIterator film1980= new Film1980();
		FilmIterator film1990= new Film1990();
		FilmIterator film2020= new Film2020();
		TvChannel tvChannel= new TvChannel(film1980,film1990,film2020);
		tvChannel.play();
	}

}
