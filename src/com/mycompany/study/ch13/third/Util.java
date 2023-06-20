package com.mycompany.study.ch13.third;

public class Util {

	public <T> Box <T> boxing(T t) {
		Box<T> box = new Box<>();
		return box;

	}

}
