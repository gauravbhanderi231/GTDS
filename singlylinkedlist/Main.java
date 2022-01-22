
public class Main
{
	public static void main(String[] args) {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.addToBack("Mary");
		list.addToBack("And");
		list.addToBack("Ste");
		list.addToBack("Ivan");
		list.addToBack("M");
		list.addToBack("Adr");
		printSLL(list);
	}
	
	public static void printSLL(SinglyLinkedList<String> list) {
	    SinglyLinkedListNode<String> node = list.getHead();
		mystery(node);
	}
	public static void mystery(SinglyLinkedListNode<String> cur){

    if(cur == null) {System.out.println("hello"); return;}
    if(cur.getNext() != null && cur.getData().length() > 5){
        mystery(cur.getNext().getNext());
        System.out.println(cur.getData().length());
    } else if(cur.getData().length() % 2 == 0) {
        System.out.println(cur.getData());
        mystery(cur.getNext());
    }
}
}