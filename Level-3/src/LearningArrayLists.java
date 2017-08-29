import java.util.ArrayList;

public class LearningArrayLists {

	public static ArrayList createArrayList() {
		ArrayList<String> test = new ArrayList<String>();
		return test;
	}

	public static void addToArrayList(ArrayList testList, String string) {
		testList.add(string);
	}

	public static int getNumberOfItems(ArrayList testList) {
		int number = testList.size();
		return number;
	}

	public static String getItem(ArrayList<String> testList, int i) {
		String is = testList.get(i);
		return is;
	}

	public static String iterateOver(ArrayList testList) {
		String t = "";
		for (int i = 0; i < testList.size(); i++) {
			String r = (String) testList.get(i);
			t = t.concat(r);
		}
		return t;
	}

	public static Object findItemOnList(ArrayList testList, String string) {
		int t = testList.indexOf(string);
		return t;
	}

	public static ArrayList<String> createStringTypedArrayList() {
		ArrayList<String> testList = new ArrayList<String>();
		return testList;
	}

	public static String addAllString(ArrayList<String> testList) {
		String w = "";
		for (int i = 0; i < testList.size(); i++) {
			String t = testList.get(i);
			w = w.concat(t);
		}
		return w;
	}

	public static void replaceItem(ArrayList testList, int i, String string) {
		testList.set(i, string);

	}

	public static ArrayList<Integer> createTypedArrayList() {
		ArrayList<Integer> t = new ArrayList<Integer>();
		return t;
	}

	public static void insertItem(ArrayList testList, int i, String string) {
		testList.add(i, string);

	}

	public static Object addAllInteger(ArrayList<Integer> testList) {
		int w = 0;
		for (int i = 0; i < testList.size(); i++) {
			Integer t = testList.get(i);
			w = w + t;
		}
		return w;
	}

}
