package test;

import logic.ArrayNumbers;
import logic.MyMatriz;
import logic.Dish;
import logic.MyArray;
import logic.ServiceDish;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();


        myArray.add("Hola");
        myArray.add("3463");
        myArray.add("true");
        myArray.add("535");
        myArray.add("23525q.5");
        myArray.add("Juanm");
        myArray.add("Lola");
        myArray.add("Maria");
        myArray.add("Sogamoso");
        myArray.add("Duitama");
        myArray.add("Tunja");

        //System.out.println(myArray.getArray().length);
        //System.out.println(myArray.toString());

       // arrayNumbers();
  matriz();

    }

    private static void dishes() {
        ServiceDish service = new ServiceDish();
        service.add( new Dish("34","Pollo", false,400,20000));
        service.add( new Dish("10","Carne", false,400,30000));
        service.add( new Dish("20","Pasta", true,100,10000));
        service.add( new Dish("54","Pescado", false,400,32000));
        service.add( new Dish("19","Tomahawk", false,400,17000));
        service.add( new Dish("15"," Mojarra", false,400,35000));

        Dish[] sorted = service.sort();
        for( int i = 0 ; i < service.getSize() ; i++ ){
            System.out.println( sorted[i]);
        }
    }

    private static void arrayNumbers() {

        ArrayNumbers numbers = new ArrayNumbers(500,10,50);
        

        System.out.println( numbers.toString());
        System.out.println( Arrays.toString( numbers.sortBurbble()));
        System.out.println(Arrays.toString(numbers.countArray()));
        int min=numbers.getMin();
        int []count =numbers.countArray();
        for (var i=0;i<count.length;i++) {
        	StringBuffer symbol=new StringBuffer();
        for (var j =0;j<count[i];j++) {
        	symbol.append("+");
        	
        }
        System.out.println(numbers.getMin()+i+"-->"+symbol);
        }
        	
        }
    private static void matriz() {
    	MyMatriz myMatriz=new MyMatriz (5,5);
    	int [][] matriz=myMatriz.getMatriz();
    	for(var i=0;i<matriz.length;i++) {
    		for(var j=0;j<matriz[0].length;i++) {
    			System.out.print(matriz[i][j]+"\t");
    		}
    	}
    }

}
