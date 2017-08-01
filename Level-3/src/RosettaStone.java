import java.util.HashMap;
import java.util.Random;

import javax.swing.JOptionPane;

public class RosettaStone {
	public static void main(String[] args) {
		HashMap<String, String> spanish = new HashMap<String, String>();
		spanish.put("Yo", "I");
		spanish.put("amor", "love");
		spanish.put("Tu", "you");
		for (int i = 0; i < 1000; i++) {
			String word = getRandomKey(spanish);
			JOptionPane.showMessageDialog(null, word);
			JOptionPane.showMessageDialog(null, spanish.get(word));
		}
	}

	static String getRandomKey(HashMap<String, String> map) {
		String[] keysAsArray = map.keySet().toArray(new String[0]);
		int randomness = new Random().nextInt(map.size());
		return keysAsArray[randomness];
	}

}
