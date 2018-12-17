import edu.princeton.cs.algs4.StdDraw;

public class Selection {
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			
			draw(a, i, min);
			
			exch(a, i, min);
			//程序休眠
			try {
				Thread.currentThread();
				Thread.sleep(200);
			} catch (Exception e) {
			}
			//清除图像
			clear();
 
		}
		//画出排序完成后的图像
		draw(a, N + 1, N + 1);
	}
 
	/**
	 * 画图，大于当前元素e的元素在内循环过程中全部参与比较，而其中最小的元素以红色标出，其余的元素以黑色标出
	 * @param a 排序元素数组
	 * @param e 当前的元素
	 * @param min 最小的元素
	 */
	public static void draw(Comparable[] a, int e, int min) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			double x = 1.0 * i / N;
			double y = (double) a[i] / 2.0;
			double rw = 0.5 / N;
			double rh = (double) a[i] / 2.0;
			if (i == min) {                             // 红色
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.filledRectangle(x, y, rw, rh);
			} else if (i >= e && i != min) {            // 黑色
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledRectangle(x, y, rw, rh);
			} else {                                    // 灰色
				StdDraw.setPenColor(StdDraw.GRAY);
				StdDraw.filledRectangle(x, y, rw, rh);
			}
		}
	}
 
	public static void clear() {
		StdDraw.clear();
	}
 
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
 
	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
 
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
 
	private static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++)
			if (less(a[i + 1], a[i]))
				return false;
		return true;
	}
 
	public static void main(String[] args) {
		int N = 50;
		Comparable[] a = new Comparable[N];
		for (int i = 0; i < N; i++)
			a[i] = Math.random();
		sort(a);
	}
}
