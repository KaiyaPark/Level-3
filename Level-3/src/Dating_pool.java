import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class Dating_pool {
public static void main(String[] args) {
	HashMap<String, String> elgibleBachelors = new HashMap<String, String>();
	elgibleBachelors.put("Max", "Conservative");  
	elgibleBachelors.put("Bob", "conservative"); 
	elgibleBachelors.put("Diego ", "libertarian");
	elgibleBachelors.put("Felix", "Independant");
	elgibleBachelors.put("William", " Republican");  
	elgibleBachelors.put("Chuck", " Republican");  
	elgibleBachelors.put("Matthew ", "liberal");  
	elgibleBachelors.put("Jose ", "Democrat");  
	elgibleBachelors.put("Elizabeth ", "liberal");  
	ArrayList <String> lib = new ArrayList <String> ();
	lib.add("liberal");
	lib.add("libertarian");
	for(Entry bachelor: elgibleBachelors.entrySet()){
		if (lib.contains(bachelor.getValue())){
			System.out.println(bachelor.getKey());
		}
	}
}
}
