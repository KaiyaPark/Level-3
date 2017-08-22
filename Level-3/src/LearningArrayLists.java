import java.util.ArrayList;

public class LearningArrayLists {

	public static ArrayList createArrayList() {
		ArrayList<String> test = new ArrayList<String>();
		return test;
	}

	public static void addToArrayList(ArrayList testList, String string) {
		testList.add(string);
	}

	public static ArrayList getNumberOfItems(ArrayList testList) {
		ArrayList<Integer> number = new ArrayList<Integer>();
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
		// TODO Auto-generated method stub
		return null;
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

}
