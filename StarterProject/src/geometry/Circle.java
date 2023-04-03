package geometry;

import java.awt.Graphics;

public class Circle extends Shape{

	private Point center;
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius; 
	}
	
	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		this.selected = selected;
	}
	
	
	// Povrsina kruga P = r*r*PI
	// Math.PI
	public double area() {
		return radius * radius * Math.PI;
	}
	
	// Obim kruga O = 2*r*PI
	public double circumference() {
		return 2 * radius * Math.PI;
	}
	
	public String toString() {
		return "Center: " + center + " , radius = " + radius;
		// Center: (x,y), raidus = a
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle pomocna = (Circle) obj;
			if(this.center.equals(pomocna.center) 
					&& this.radius == pomocna.radius)
				return true;
			else 
				return false;
		} else 
			return false;
	}
	
	public boolean contains(int x, int y) {
		return center.distance(x,y) <= radius;
	}
	
	public boolean contains(Point p) {
		return center.distance(p.getX(),p.getY()) <= radius;
	}
	
	// Metode pristupa
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getX() - radius, 
				center.getY() - radius,
				2*radius, 2*radius);
		
	}
}
