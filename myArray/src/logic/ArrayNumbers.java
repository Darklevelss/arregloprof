package logic;

import java.util.Random;

public class ArrayNumbers {

    private int[] myArray;
    private int size;
private int min,max;
    public ArrayNumbers(int[] myArray) {
        this.myArray = myArray;
    }

    public ArrayNumbers(int elements,int min,int max ) {
        this.size = elements;
        this.max=max;
        this.min=min;
        myArray = new int[elements];
        myArray = fillArray(elements, min, max);
    }

    public int[] fillArray(int elements,int min,int max){
        int[] aux = new int[size];
        for( var i = 0 ; i < aux.length ; i++ ){
            aux[i] = new Random().nextInt(max-min+1) + min;
        }

        return aux;
    }

    public String toString(){
        StringBuffer out = new StringBuffer("[");
        for( var i = 0 ; i < myArray.length ; i++ ){
            out.append(myArray[i] );
            if( i < myArray.length - 1 ){
                out.append(", ");
            }
        }
        out.append("]");

        return out.toString();
    }

    public int[] sortBurbble(){
        int[] aux = myArray.clone();
        for( var pivot = aux.length ; pivot > 0 ; pivot-- ){
            for( var i = 0 ; i < pivot - 1 ; i++ ){
                if( aux[i] > aux[i + 1] ){
                    int temp = aux[i];
                    aux[i] = aux[i+1];
                    aux[i + 1] = temp;
                }
            }
        }

        return aux;
    }

    public int[] getMyArray() {
        return myArray.clone();
    }

    /***
     * Métododo que busca un número en el arreglo
     * @param number especifica el valor a buscar
     * @return un valor que indica la posición del elemento, -1 si el elemento no existe
     */
    public int findNumber( int number ){

        return -1;
    }

    /***
     * Método que busca un número en el arreglo
     * @param number especifica el valor a buscar
     * @return verdadero o falso, si exisrte o no, el elemento a buscar
     */
    public boolean existsNumber( int number ){

        return false;
    }

    /***
     * Método que retorna el número de veces que se repite el valor del parámetro formal
     * @param number el valor a buscar
     * @return entero con el número de veces que se repite
     */
    public int getFrecuence( int number){

        return 0;
    }

    /***
     * Método que retorna un arreglo con las posiciones en las cuales existe un elemento
     * pasado como parámetro formal
     * @param number elemento a buscar
     * @return arreglo de n elementos con las posiciones en donde se encuentra el valor,
     * si el valor no existe, retorna null
     */
    public int[] getPosFrecuence( int number ){

        return null;
    }

    public int findBinary( int number ){
        int[] sorted = sortBurbble();
        int begin = 0;
        int end = sorted.length - 1;
        while( begin <= end ){
            int medium = ( begin + end ) / 2;
            if( sorted[medium] == number ){
                return medium;
            }else{
                if( sorted[medium] > number ){
                    end = medium - 1;
                }else{
                    begin = medium + 1;
                }
            }
        }

        return -1;
    }
    public int []countArray() {
    	int []count=new int [max-min+1];
    		for (var i=0;i<myArray.length;i++) {
    			count[myArray[i]-min]++;
    		}
		return count;}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}


}
