
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();
		//for (int i=0;i<9 ;i++ ) {
		//    test.addToFront("test"+i);
		//}
		//test.printAll();
		for (int i=0;i<=36 ;i++ ) {
		    test.addToBack(i+"a");
		}
		
		test.printAll();
		
		//System.out.println(test.removeFromFront());
		//System.out.println(test.removeFromBack());
		//test.printAll();
		System.out.println(test.size());
	}
}