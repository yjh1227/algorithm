public class Selection {
	public static void main(String[] args) {
		// String [] arr = {"s","o","r","t","e","x","a","m","p","l","e"};
		Comparable[] arr = { 2, 1, 3, 5, 8, 4, 10, 2 };

		// Selection s = new Selection();
		sort(arr);
		assert isSort(arr);
		show(arr);

	}

	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	private static boolean isSort(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i - 1]))
				return false;
		}
		return true;

	}

	private static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
				exch(a, i, min);
			}
		}
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable t;
		t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static boolean less(Comparable v, Comparable w) {

		return v.compareTo(w) < 0;
	}

}
