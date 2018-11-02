
public class Problem3 {

	public static int ProblemThree(Data data, int value){
		int numCompares = 1;
		int lookHere = 0;
		while(data.getValue(lookHere) != value){
			if (data.getValue(lookHere) == -1){
				lookHere *= .75;
			}
			else if(data.getValue(lookHere) < value){
				lookHere = lookHere*2;
			}
			else{
				lookHere -= 1;
			}
			numCompares += 1;
		}
		
		System.out.println("number of compares is " + numCompares);
		
		return lookHere;
	}
	
	
	public static void main(String Args[]){
		Data test = new Data();
		test.add(1);
		test.add(5);
		test.add(8);
		test.add(10);
		test.add(12);
		test.add(14);
		test.add(18);
		test.add(20);
		test.add(33);
		test.add(41);
		ProblemThree(test,8);
		ProblemThree(test,33);
	}
}
