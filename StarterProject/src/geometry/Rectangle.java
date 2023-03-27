package geometry;

public class Rectangle {


	private Point upperLeftPoint;
	private int width;
	private int height;
	private boolean selected;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
		this.selected = selected;
	}

	// Površina pravougaonika P=w*h
	public int area() {
		return width*height;
	}
	
	// Obim pravougaonika O = 2*(w+h)
	public int circumference() {
		return 2*(width+height);
	}
	
	public String toString() {
		return "Upper left point: " + upperLeftPoint +
				", width = " + width 
				+ ", height = " + height;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle pomocna = (Rectangle)obj; 
			if(this.upperLeftPoint.equals(pomocna.upperLeftPoint) &&
					width == pomocna.width && height == pomocna.height)
				return true; 
			else 
				return false; 
		}
		else 
			return false;
	}
	
	public boolean contains(int x, int y) {
		return (x >= upperLeftPoint.getX() 
				&& x <= upperLeftPoint.getX() + width
				&& y >= upperLeftPoint.getY()
				&& y <= upperLeftPoint.getY() + height);
	}
	
	// Metode pristupa
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height; 
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
