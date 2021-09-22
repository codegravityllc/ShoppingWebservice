package com.tutorial.webservice.soap;

import javax.jws.WebService;

@WebService
public class Math {
	public int calculateSquare(int sides) {
		return sides * sides;
	}
	public int calculateRectangle(int height,int width) {
		return height * width;
	}
}
