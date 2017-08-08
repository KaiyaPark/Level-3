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
	
		return null;
	}

}
