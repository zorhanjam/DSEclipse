import java.util.*;
public class MyHeap<T extends Comparable<T>> {
		private ArrayList<T> heap;
		public static final int MAX_C = 10;
	public  MyHeap() {
		heap= new ArrayList<T>(MAX_C);
	}
	public  MyHeap(int s) {
		heap= new ArrayList<T>(s);
	}	
	public boolean insert(T e) {		
		if (heap.size() == 0)
			heap.add(0, e);
		else {
			heap.add(e);
			heapifyUp();
		}
		return true;
	}
	public T remove() {
		T mx;
		if (heap.size() == 0)
			return null;
		else {
			mx = heap.get(0);
			Collections.swap(heap, 0, heap.size()-1 );
			heap.remove(heap.size() - 1);		
			heapifyDown();
		}
		return mx;
	}
	public void heapifyUp() {
		int childI = heap.size() - 1;
		boolean notHeap = true;
		while (notHeap) {			
			int parentI = (childI - 1) / 2;
			T pr = heap.get(parentI); 
			T ch = heap.get(childI);
			if (pr.compareTo(ch) < 0){
				heap.remove(parentI);
				heap.add(parentI, ch);
				heap.remove(childI);
				heap.add(childI, pr);
				childI = parentI;
			}
			else
				notHeap = false;				
		}		
	}
	public void heapifyDown() {
		int sz = heap.size();
		int parentI = 0;
		int chLI, chRI, in;
		T chL = null, chR = null, mx = null;		
		while (parentI < sz ) {				
			T pr = heap.get(parentI);
			chLI = parentI * 2 + 1;
			chRI = parentI * 2 + 2;
			if (chLI < sz)
				chL = heap.get(chLI);
			else return;
			mx = chL;
			in = chLI;
			if (chRI < sz) {
				chR = heap.get(chRI);
				if(mx.compareTo(chR) < 0) {
					mx = chR;
					in = chRI;
				}
			}
			if (pr.compareTo(mx) < 0) {
				if(in < sz) {
					Collections.swap(heap, parentI, in);
					parentI = in;
				}
				else return;
			}
			else return;
		}
	}
	public void displaySpaces(int h) {
		int hm = h / 3;		
		if (h > 0) {
			for (int i = 1; i < hm; i++)
				System.out.print("| ");
			System.out.print("|_");
		}
	}
	public void display(int root, int h) {
		if (root < heap.size()) {
			displaySpaces(h);
			System.out.println(heap.get(root));
			display(2 * root + 1, h + 3);
			display(2 * root + 2, h + 3);
		}
	}
	public boolean isEmpty() {
		return heap.size() < 1;
	}
	public static void main(String args[]) {
		MyHeap<Integer> t2 = new MyHeap<>();
		int arr[] = { 6, 0, 1, 5, 7, 9 };
		for(int i = 0; i < arr.length; i++)
			t2.insert(arr[i]);
		t2.display(0, 0);
		while (!t2.isEmpty()) 
			System.out.println("removed: " + t2.remove());
	}
}
