
public class fibbs {
	public static void main(String[] args) {
		int l = 0;
		int j = 1;
		int fibb[] = new int[50];
		fibb[0] = 0;
		fibb[1] = 1;
		System.out.println(fibb[0]);
		System.out.println(fibb[1]);
		for (int i = 2; i < fibb.length; i++) {
			fibb[i] = fibb[i - 2] + fibb[i - 1];
			System.out.println(i);
		}
	}
}
