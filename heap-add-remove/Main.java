/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    // 0 14 7 || 7, 14
	    // 0, 7, 14, 21, 28, 35, 42, 56, 49
	    // 0, 7, 14, 21, 28, 35, 42, 49, 56 || 7, 21, 14, 49, 28, 35, 42, 56
	    // 0, 7, 14, 21, 28, 35, 42, 56, 49, 63 || 7, 21, 14, 49, 28, 35, 42, 56, 63
	    // 0, 7, 14, 28, 21, 35, 49, 42, 56, 63, 70 || 7, 21, 14, 28, 63, 35, 49, 42, 56, 70
	    
		MinHeap minHeap2 = new MinHeap();
	    minHeap2.add(0);
	    minHeap2.add(14);
	    minHeap2.add(7);
	    minHeap2.remove();
	    
		MinHeap minHeap5 = new MinHeap();
	    minHeap5.add(0);
	    minHeap5.add(7);
	    minHeap5.add(14);
	    minHeap5.add(21);
	    minHeap5.add(28);
	    minHeap5.add(35);
	    minHeap5.add(42);
	    minHeap5.add(56);
	    minHeap5.add(49);
	    minHeap5.remove();
	    
		MinHeap minHeap1 = new MinHeap();
	    minHeap1.add(0);
	    minHeap1.add(7);
	    minHeap1.add(14);
	    minHeap1.add(21);
	    minHeap1.add(28);
	    minHeap1.add(35);
	    minHeap1.add(42);
	    minHeap1.add(49);
	    minHeap1.add(56);
	    minHeap1.remove();
	    
		MinHeap minHeap3 = new MinHeap();
	    minHeap3.add(0);
	    minHeap3.add(7);
	    minHeap3.add(14);
	    minHeap3.add(21);
	    minHeap3.add(28);
	    minHeap3.add(35);
	    minHeap3.add(42);
	    minHeap3.add(56);
	    minHeap3.add(49);
	    minHeap3.add(63);
	    minHeap3.remove();
	    
		MinHeap minHeap4 = new MinHeap();
	    minHeap4.add(0);
	    minHeap4.add(7);
	    minHeap4.add(14);
	    minHeap4.add(28);
	    minHeap4.add(21);
	    minHeap4.add(35);
	    minHeap4.add(49);
	    minHeap4.add(42);
	    minHeap4.add(56);
	    minHeap4.add(63);
	    minHeap4.add(70);
	    minHeap4.remove();
	}
}
