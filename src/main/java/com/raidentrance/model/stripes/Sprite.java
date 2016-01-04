/**
 * 
 */
package com.raidentrance.model.stripes;

import java.awt.Graphics;

/**
 * @author alejandrobautista
 *
 */
public abstract class Sprite {

	protected int x;
	protected int y;
	protected int width;
	protected int heigth;

	public abstract void draw(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

}
