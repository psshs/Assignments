package bmiOpgave;

import java.util.ArrayList;

public class Data implements IData {

	private class Person {
		String cpr;
		String navn;
		double hoejde;
		double vaegt;

		public Person(String cpr, String navn, double hoejde, double vaegt) {
			super();
			this.cpr = cpr;
			this.navn = navn;
			this.hoejde = hoejde;
			this.vaegt = vaegt;
		}
	}

	private ArrayList<Person> personer;

	public Data() {
		personer = new ArrayList<Person>();
		// Tilf�j personer
		personer.add(new Person("234567-8901", "Ib Olsen", 1.80, 75.0));
		personer.add(new Person("456789-0123", "Ole Jensen", 1.75, 95.0));
		personer.add(new Person("123456-7890", "Eva Hansen", 1.65, 65.0));

	}

	// Returner personens navn
	public String getNavn(String cpr) {
		try {
			int i = 0;
			while (true)
			{
				
				
				if (personer.get(i).cpr.equals(cpr))
					return personer.get(i).navn;
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			return null;

		}

	}

	// Returner personens v�gt
	public double getVaegt(String cpr) {
		try {
			int i = 0;
			while (true) {
				
				
				if (personer.get(i).cpr.equals(cpr))
					return personer.get(i).vaegt;
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			return -1;
		}

	}

	// Returner personens h�jde
	public double getHoejde(String cpr) {
		try {
			int i = 0;
			while (true) {
				
				
				if (personer.get(i).cpr.equals(cpr))
					return personer.get(i).hoejde;
				i++;
			}
				
		} catch (IndexOutOfBoundsException e) {
			return -1;
		}
	}
}
