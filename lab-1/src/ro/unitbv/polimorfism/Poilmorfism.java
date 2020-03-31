package ro.unitbv.polimorfism;

import java.util.Random;

public class Poilmorfism {

	public static void main(String args[]) {
		// Doua moduri - mod explicit

		VectorList vectorList = new VectorList();
		vectorList.add(34);
		vectorList.add(27);

		System.out.println(vectorList.get(1));

		ListaInlantuita listaInlantuita = new ListaInlantuita();
		listaInlantuita.add(354);
		listaInlantuita.add(23);

		System.out.println(listaInlantuita.get(1));
		System.out.println(listaInlantuita.get(0));

		// Mod polimorfic

//		Lista lista1 = new Lista();

		// partrea din stanga este d eun tip generic (Interfata)
		// partea din dreapta este o implementare specifica
		Lista lista1 = new VectorList();
		Lista lista2 = new ListaInlantuita();

		lista1.add(12);
		lista1.add(23);

		/// Mod polimorfic 2

		for (int i = 0; i < 10; i++) {
			Lista myList = listFactory();
			myList.add(24);
			myList.add(32);
			System.out.println("Elem 1: " + myList.get(0) + " Elem 2:" + myList.get(1));
			System.out.println();
		}

	}

	static Lista listFactory() {
		if (new Random().nextInt(2) % 2 == 0) {
			System.out.println("VectorList is build");
			return new VectorList();
		} else {
			System.out.println("ListaInlantuita is build");
			return new ListaInlantuita();
		}
	}

}

// Prin interfete Definim contracte 
interface Lista {
	/**
	 * Return element at {@link Index}
	 * 
	 * @param index
	 * @return
	 */
	Object get(int index);

	/**
	 * Adds a new element to the list
	 * 
	 * @param obj
	 */
	void add(Object obj);

	/**
	 * Removes elem at index and returns true/false if successfully
	 * 
	 * @param index
	 * @return
	 */
	boolean remove(int index);
}

class VectorList implements Lista {

	private Object[] objects = new Object[10];
	private int count = 0;

	@Override
	public Object get(int index) {
		return objects[index];
	}

	@Override
	public void add(Object obj) {
		objects[count] = obj;
		count++;

	}

	@Override
	public boolean remove(int index) {
		if (index < objects.length) {
			objects[index] = null;
			return true;
		}

		return false;
	}
}

class ListaInlantuita implements Lista {

	private class Nod {
		Object valoare;
		Nod nextVal;

		public Nod(Object valoare, Nod nextVal) {
			super();
			this.valoare = valoare;
			this.nextVal = nextVal;
		}

	}

	private Nod startNode = null;

	@Override
	public Object get(int index) {
		Nod internal = startNode;
		for (int i = 0; i < index; i++) {
			internal = startNode.nextVal;
		}
		return internal.valoare;
	}

	@Override
	public void add(Object obj) {
		if (startNode == null) {
			startNode = new Nod(obj, null);
			return;
		}

		Nod internal = startNode;
		while (internal.nextVal != null) {
			internal = internal.nextVal;
		}
		internal.nextVal = new Nod(obj, null);

	}

	@Override
	public boolean remove(int index) {
		throw new RuntimeException("Method not supotted");
	}

}
