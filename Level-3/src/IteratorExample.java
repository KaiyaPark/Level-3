import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample{
	public static void main(String[] args) {
ArrayList<Integer> number = new ArrayList<Integer>();
for (int i = 0; i < 50; i++) {
	number.add(i);
}
int num = 0;
	Iterator<Integer> it = number.iterator();
	while(it.hasNext()){
		
		int s = it.next();
		num = num + s;
	}
	System.out.println(num);
}
}