package geometry;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
	
		Point point1 = new Point();
		
		//point1.x = 2; Ne moze ovako zbog specifikatora pristupa PRIVATE
		//point1.y = 2;
		
		point1.setX(2);
		point1.setY(3);
		point1.setSelected(false);
		
		System.out.println("X koooridanata: " + point1.getX());
		System.out.println("Y koooridanata: " + point1.getY());
		System.out.println("Selektovana: " + point1.isSelected());
		
		System.out.println(point1);   
		
		double result = point1.distance(6,7);
		System.out.println(result);
		

		// Vezbe 3 (13. 3. 2023.)
		System.out.println("Vezbe 3");
		Point p2 = new Point();
		Line l1 = new Line();
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		p2.setX(10);
		p2.setY(15);
				
		// 1. Inicijalizovati x koordinatu tačke point1 na vrednost y koordinate tačke p2
		point1.setX(p2.getY());
		System.out.println("X koordinata tačke point1  : " + point1.getX());

		
		// 2. Postaviti za početnu tačku linije l1 tačku point1,
		// a za krajnju tačku linije l1 tačku p2
		l1.setStartPoint(point1);
		l1.setEndPoint(p2);
		System.out.println("Start point X: " + l1.getStartPoint().getX());
		System.out.println("Start point Y: " + l1.getStartPoint().getY());
		System.out.println("End point X: " + l1.getEndPoint().getX());
		System.out.println("End point Y: " + l1.getEndPoint().getY());
				
		// 3. Postaviti y koordinatu krajnje tačke linije l1 na 23
		l1.getEndPoint().setY(23);
		System.out.println("End point Y: " + l1.getEndPoint().getY());
		
		// 4. Inicijalizovati x kordinatu početne tačke linije l1 
		// na vrednost y koordinate krajnje tačke linije l1
		l1.getStartPoint().setX(l1.getEndPoint().getY());
		System.out.println("Start point X: " + l1.getStartPoint().getX());
						
		// 5. Postaviti x koordinatu krajnje tačke linije l1 na vrednost
		// dužine linije l1 umanjene za vrednost zbira x i y koordinate 
		// početne tačke linije l1
		l1.getEndPoint().setX( (int) l1.length() - (l1.getStartPoint().getX() 
				+ l1.getStartPoint().getY()));
		System.out.println("End point X: " + l1.getEndPoint().getX());
		
		// 6. Postaviti x koordinatu tačke gore levo pravougaonika r1 na vrednost 10
		// i y koordinatu na vrednost 15
		r1.setUpperLeftPoint(new Point());
		r1.getUpperLeftPoint().setX(10);
		r1.getUpperLeftPoint().setY(15);
		System.out.println("X koordinata r1: " + r1.getUpperLeftPoint().getX());
		System.out.println("X koordinata r1: " + r1.getUpperLeftPoint().getY());
				
		// Povrsina i obim pravougaonika r1
		r1.setWidth(20);
		r1.setHeight(10);
		System.out.println("Povrsina r1: " + r1.area());
		System.out.println("Obim r1: " + r1.circumference());
		
		// 7. Postaviti centar kruga c1 na  koordinate tačke gore levo pravougaonika r1
		c1.setCenter(r1.getUpperLeftPoint());
		System.out.println("Centar kruga c1: " + "(" + c1.getCenter().getX() 
				+ "," + c1.getCenter().getY() + ")");
		
		// 8. Postaviti x koordinatu centra kruga c1 na vrednost razlike 
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1
		c1.getCenter().setX(r1.area() - l1.getStartPoint().getY());
		System.out.println("Centar kruga c1: " + "(" + c1.getCenter().getX() 
				+ "," + c1.getCenter().getY() + ")");
		
		//Vezbe 4
		System.out.println(point1);
		System.out.println(l1);
		System.out.println(c1);
		System.out.println(r1);
		
		int a  = 5; // primitivni tip podataka
		int b = 5;
		System.out.println(a == b); //poredjenje po vrednosti
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2);  //poredjenje po refenci
		System.out.println(s1.equals(s2)); //poredjenje po vrednosti
		
		Point p3 = new Point(23, 3);
		System.out.println(point1 == p3);
		System.out.println(point1.equals(p3));
		

		//vežbe 7
		System.out.println(point1);
		point1.moveTo(5,5);
		System.out.println("Nakon poziva metode moveTo: " + point1);
		point1.moveBy(2,4);
		System.out.println("Nakon poziva metode moveBy: " + point1);

		int [] ints = {5, 2, 4, 3, 1};
		System.out.println("Nesortiran niz");
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}

		Arrays.sort(ints);

		System.out.println("Sortiran niz");
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}

		Point [] points = { point1, p2, p3};
		System.out.println("Nesortiran niz");
		for(int i = 0; i< points.length; i++) {
			System.out.println(points[i]);
		}

		Arrays.sort(points); 

		System.out.println("Sortiran niz");
		for(int i = 0; i< points.length; i++) {
			System.out.println(points[i]);
		}


		Circle [] circles = new Circle[3];
		Circle c10 = new Circle(new Point(10,10), 40);
		Circle c20 = new Circle(new Point(20,20), 25);
		Circle c30 = new Circle(new Point(30,30), 50);
		circles[0] = c10;
		circles[1] = c20;
		circles[2] = c30;

		System.out.println("Nesortiran niz");
		for(int i = 0; i< circles.length; i++) {
			System.out.println(circles[i]);
		}
		Arrays.sort(circles);
		System.out.println("Sortiran niz");
		for(int i = 0; i< circles.length; i++) {
			System.out.println(circles[i]);
		}
		
	}

}
