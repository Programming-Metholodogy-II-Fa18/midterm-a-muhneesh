
public class Problem1 {

	public static void ExamSort(int[] a, int size){
		//want to implement mergesort
		//break it into pairs
		
		
	}
	
	public int[] Merge(int[] b, int[] c){
		int[] temp = new int[b.length + c.length];
		
		int counter = 0;
		int bIndex = 0;
		int cIndex = 0;
		while(counter < b.length+c.length){
			if (cIndex == c.length || c[cIndex] >= b[bIndex]){
				temp[counter] = b[bIndex];
				bIndex++;
				counter++;
			}
			else{
				temp[counter]=c[cIndex];
				cIndex++;
				counter++;
			}
		}
		
		return temp;
	}
	
}
