package date;

import java.util.Arrays;

public class Ordinatore<T> {

	public void ordina(Comparable<T>[] array) {
		while (swap(array));
	}

	/**
	 * @param array
	 * @return true se e solo se ha fatto
	 *         almeno uno scambio
	 */
	private boolean swap(Comparable<T>[] array) {
		boolean scambio = false;

		for (int pos = 0; pos < array.length - 1; pos++)
			if (array[pos + 1].compareTo((T) array[pos]) < 0) {
				Comparable<T> temp = array[pos + 1];
				array[pos + 1] = array[pos];
				array[pos] = temp;
				scambio = true;
			}

		return scambio;
	}

	public static void main(String[] args) throws DataIllegaleException {
		Data[] array = { new Data(2014, 11, 10), new Data(2014, 11, 9),
				new Data(2014, 12, 25), new Data(2014, 1, 1) };

		new Ordinatore<Data>().ordina(array);

		System.out.println(Arrays.toString(array));

		Studente[] array2 = { new Studente("Giorgio", 151545),
				new Studente("Roberto", 345234),
				new Studente("Camillo", 98768),
				new Studente("Giulia", 231567) };

		new Ordinatore<Studente>().ordina(array2);

		System.out.println(Arrays.toString(array2));

		String[] array3 = { "buongiorno", "a", "tutti" };

		new Ordinatore<String>().ordina(array3);

		System.out.println(Arrays.toString(array3));
	}
	
}
