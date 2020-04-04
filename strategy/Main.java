package strategy;

import java.util.Random;

public class Main {
	final static int MAX=100000;
	public static void main(String[] args) {
		   int[] taul1 = new int[MAX]; //taul tallettaa lajiteltavat tiedot
		    int[] taul2 = new int[MAX];
		    int[] taul3 = new int[MAX];
		    Random r = new Random(); //luodaan satunnaislukugeneraattori
		    System.out.println("Generoidaan syöttöaineisto: ");
		    for (int i=0;i<MAX;i++) {
		        taul1[i] = r.nextInt(100000);//generoidaan luvut
		        taul2[i]= taul1[i];
		        taul3[i]= taul1[i];
		       // System.out.print(taul1[i]+" ");
	           // if (i>0 && i%40==0) // rivinvaihto
	               // System.out.println();
		    }
		    
		    Sort sort = new Sort(new BubbleSortStrategy(),taul1);
		    Sort sort2 = new Sort(new MergeSortStrategy(),taul2);
		    Sort sort3 = new Sort(new InsertionSortStrategy(),taul3);
		    
		    System.out.println("\n bubblesort");
		    long startTime = System.currentTimeMillis();
		    sort.sort();
		    long totalTime = System.currentTimeMillis()-startTime;
		    System.out.println("time used "+ totalTime);
		   // printNumbers(taul1);
		    
		    System.out.println("\n mergesort");
		    startTime = System.currentTimeMillis();
		    sort2.sort();
		    totalTime = System.currentTimeMillis()-startTime;
		    System.out.println("time used "+ totalTime);
		    //printNumbers(taul2);
		   
		    System.out.println("\n insertionsort");
		    startTime = System.currentTimeMillis();
		    sort3.sort();
		    totalTime = System.currentTimeMillis()-startTime;
		    System.out.println("time used "+ totalTime);
		    //printNumbers(taul3);
		    
		    System.out.println("\n bubblesort for already sorted");
		    sort3.setStrategy(new BubbleSortStrategy());
		    startTime = System.currentTimeMillis();
		    sort3.sort();
		    totalTime = System.currentTimeMillis()-startTime;
		    System.out.println("time used "+ totalTime);
		    
		    System.out.println("\n mergesort for already sorted");
		    sort3.setStrategy(new MergeSortStrategy());
		    startTime = System.currentTimeMillis();
		    sort3.sort();
		    totalTime = System.currentTimeMillis()-startTime;
		    System.out.println("time used "+ totalTime);
		    
		    System.out.println("\n insertionsort for already sorted");
		    sort3.setStrategy(new InsertionSortStrategy());
		    startTime = System.currentTimeMillis();
		    sort3.sort();
		    totalTime = System.currentTimeMillis()-startTime;
		    System.out.println("time used "+ totalTime);
	}

    private static void printNumbers(int[] input) {
        
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
            if (i>0 && i%40==0) // rivinvaihto
                System.out.println();
        }
        System.out.println("\n");
    }
    
 
}
