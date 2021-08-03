package ro.unitbv.arrayoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayPolimorficOperations {

	public static void main(String[] args) {
		problema1();
		problema2();
	}

	// Polimorfisumul ?
	// - Mostenire (abstractizae)
	// - Interfete fie clase abstracte

	private static void problema1() {

		// Data primitive folosind clasa de tip wrapper pentru fiecare primitiva.

//		int, double, float, boolean
//		List<int> - nu merge

		// Wrapper classes
//		Integer, Double, Float, Boolean

		List<Integer> integers = new ArrayList<>();

		// Fie o lista de numere ( intregi sau reale ) -> afisam pe ecran o lista
		// sortata crescator
		// combinand ambele liste.

//		double[] nrs = {1, 0.5, 2};

		// input 1
		List<Integer> itegerNumbers = Arrays.asList(1, 7, -23, 45);
		// input 2
		List<Double> doubleNumbers = Arrays.asList(2.3, 3.3, 25.4, 7.9);

		// CUM ?

		// Creeam o lista de un tip comun al Integer si Double
		List<Number> sorterdNumbers = new ArrayList<>();
		sorterdNumbers.addAll(itegerNumbers);
		sorterdNumbers.addAll(doubleNumbers);

		System.out.println("Numere inainte sortate");
		System.out.println(sorterdNumbers);

		sorterdNumbers.sort((nr1, nr2) -> {
			return nr1.doubleValue() < nr2.doubleValue() ? -1 : 1;
		});

		System.out.println("Numere sortate");
		System.out.println(sorterdNumbers);

		List<Number> filteredNr = sorterdNumbers.stream().filter(nr -> nr.doubleValue() < 2.0)
				.collect(Collectors.toList());
		System.out.println(filteredNr);
	}

	private static void problema2() {
		// Un sistem constine mai multe forme gometrice (Rect, Circle, Square) ce sunt
		// initializate in sistem.

		// 1. sa se creeze un raport care sa ne afiseze aria total ocupata de aceste
		// figui.
		// 2. sa le afisam crescator dpdv a ariei.

		PaintEngine engine = new PaintEngine();
		
		Shape rect1 = engine.build(new Rectangle(23, 14));
		Shape rect2 = engine.build( new Rectangle(3, 14));
		Shape rect3 = engine.build( new Rectangle(45, 3));
		Shape rect4 =engine.build( new Rectangle(20, 12));

		Shape square1 = engine.build( new Square(3));
		Shape square2 = engine.build( new Square(7));
		Shape square3 = engine.build(new Square(9));

		Shape circle1 = engine.build(new Circle(20));
		Shape circle2 = engine.build(new Circle(12));
		Shape circle3 =engine.build( new Circle(34));
		
		
		double toalaArea = 0;
		for(Shape s : engine.getCreatedShapes()) {
			toalaArea += s.getArea();
		}

		System.out.println("Arie totala "+ toalaArea);

	}

}

class PaintEngine {

	private List<Shape> createdShapes = new ArrayList<>();
	
	
	public List<Shape> getCreatedShapes() {
		return createdShapes;
	}


	public Shape build(Shape s) {
		createdShapes.add(s);
		return s;
	}
}

interface Shape {

	double getArea();
}

class Rectangle implements Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}
}

class Square implements Shape {
	private double size;

	public Square(double size) {
		super();
		this.size = size;
	}

	@Override
	public double getArea() {
		return size * size;
	}
}

class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
