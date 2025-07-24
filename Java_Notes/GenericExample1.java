class GenericExample1{

	 static <T extends Comparable<T>> void genSort(T arr[]){
		int size=arr.length;

		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-i-1;j++){
				if(arr[j].compareTo(arr[j+1])>0){
					swap(j,j+1,arr);
				}
			}
		}
	 }

	 static <T> void swap(int i, int j, T arr[]){
		T temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	 }

	static <T> void print(T arr[]){
		for(T i: arr){
			System.out.print(i+" ");
		}
	 }

    public static void main(String ...a){
         Integer[] iArr={10,3,2,32,79,95,12,323};
	 Character[] cArr={'e','j','h','d','g','u','x','z','a','w'};
	 String sArr[]={"Watermelon","Lime","Guava","Apple","JackFruit","Bannana","Cherry","Berry","Grapes","Lichy"};

	 System.out.println("Generics with methods:");
	 System.out.println("\nGenerics with methods Paramter: Integer:");
	 genSort(iArr); 
	 print(iArr);

	 System.out.println("\nGenerics with methods Paramter: : String:");
	 genSort(sArr);
	 print(sArr);

	 System.out.println("\nGenerics with methods Paramter: Character:");
	 genSort(cArr);
	 print(cArr);
    }
}