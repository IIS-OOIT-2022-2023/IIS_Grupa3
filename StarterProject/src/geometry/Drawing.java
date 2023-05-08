package geometry;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	/**
	 * Create the panel.
	 */
	public Drawing() {

	}
	public static void main(String []args) {
		JFrame frame = new JFrame("Drawing");
		frame.setSize(800,600);
		Drawing drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
	}
	public void paint(Graphics g) {
		Point p1 = new Point(40,50);
		//p1.draw(g);
		
		Line l1 = new Line(p1, new Point(70,80));
		//l1.draw(g);
		
		g.setColor(Color.RED);
		Circle c1 = new Circle(new Point(100,100), 45);
		//c1.draw(g);
		
		g.setColor(Color.GREEN);
		Rectangle r1 = new Rectangle(new Point(200,200), 60, 60);
		//r1.draw(g);
		
		Donut d1 = new Donut(new Point(250,250), 50,25);
		// Zadatak 1 
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p1);
		shapes.add(l1);
		shapes.add(c1);
		shapes.add(d1);
		shapes.add(r1);
		
		Iterator<Shape> it = shapes.iterator();
		while(it.hasNext()) {
			it.next().moveBy(10,0);
		}
		
		//Zadatak 2.
		/*
		 * iscrtati četvrti element iz liste shapes,
			iscrtati poslednji element liste (podrazumeva se da se ne zna
	 					koliko elemenata ima u listi)
			izbaciti drugi element liste,
			iscrtati drugi element liste, 
			iscrtati element sa indeksom tri i
			dodati liniju u listu tako da ona bude četvrti element liste.
		 * 
		 */
		g.setColor(Color.BLACK);
		shapes.get(3).draw(g);
		shapes.get(shapes.size() - 1).draw(g);
		shapes.remove(1);
		shapes.get(1).draw(g);
		shapes.get(3).draw(g);
		shapes.add(3,l1);
		
		try {
			shapes.get(55);
		}
		catch(Exception e) {
			System.out.println("Greska!");
		}
		finally {
			System.out.println("ja se uvek izvrsavam!");
		}
		
		try {
			c1.setRadius(-45);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		 
		//zadatak 4.
		p1.setSelected(true);
		l1.setSelected(true);
		c1.setSelected(true);
		d1.setSelected(true);
		r1.setSelected(true);
		
		it = shapes.iterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}
		
		//zadatak 5.
		HashMap<String, Shape> hmShapes = new HashMap<String,Shape>();
		hmShapes.put("point", p1);
		hmShapes.put("line", l1);
		System.out.println(hmShapes.get("point"));
		
	}

}
