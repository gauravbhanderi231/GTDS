/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		ExternalChainingHashMap<Integer, Integer> map = new ExternalChainingHashMap<>();
		map.put(1,1);
		map.put(19,19);
		map.put(6,6);
		map.put(8,8);
		map.put(11,11);
		map.put(25,25);
		map.put(32,32);
		for(ExternalChainingMapEntry entry: map.getTable()) {
		    if (entry == null) System.out.println("null");
		    else {
		        System.out.println("Key: "+entry.getKey() + " Value: " + entry.getValue());
		        int index = 1;
		        while(entry.getNext() != null) {
		            entry = entry.getNext();
    		        System.out.println("Key"+index+": " + entry.getKey() + " Value: " + entry.getValue());
    		        index++;
		        }
		    }
		}
	}
}
