
public class Data {
	
	Node head;
	int[] storedValues;
	int numValues;
	int numRemoved;
	
	private class Node{
		int val;
		Node next;
		
		Node(){
			
		}
	}
	
	Data(){
		head = new Node();
		storedValues = new int[10];
		numValues = 0;
		numRemoved = 0;
	}
	
	public void add(int a){
		if(numValues + numRemoved == storedValues.length){
			int[] newStoredValues = new int[storedValues.length*2];
			for(int i = 0; i < numValues; i++){
				newStoredValues[i] = storedValues[i];
			}
		}
		
		if (numValues == 0){
			head.val = a;
		}
		else{
			Node x = head;
			while(x.next != null){
				x = x.next;
			}
			Node newNode = new Node();
			newNode.val = a;
			x.next = newNode;
		}
		storedValues[numValues+numRemoved] = a;
		numValues++;
	}
	
	public int remove(){
		int temp = head.val;
		System.out.println("removing " + temp);
		head = head.next;
		numRemoved++;
		return temp;
	}
	
	public int getValue(int i){
		if (i > numValues + numRemoved -1){
			return -1;
		}
		return storedValues[numRemoved + i];
	}
	
	
	public static void main(String[] Args){
		Data testData = new Data();
		//System.out.println("hi");
		testData.add(1);
		testData.add(9);
		testData.add(4);
		testData.add(5);
		testData.add(10);
		testData.add(0);
		System.out.println(testData.getValue(0));
		System.out.println(testData.getValue(3));
	}
}




