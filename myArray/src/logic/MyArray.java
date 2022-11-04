package logic;

import java.util.Arrays;

public class MyArray {
    private String[] array;

    private int size;

    public MyArray( int dimension ) {
        array = new String[dimension];
        size = 0;
    }

    public MyArray() {
       this(10);
    }

    public void add(String element){
        ensureCapacity( size + 1 );
        array[ size++ ] = element;
    }

    private void ensureCapacity( int capacityMin ){
        if ( capacityMin > array.length ){
            int newCapacity = array.length + (array.length / 2);
            array = Arrays.copyOf( array, newCapacity);
        }
    }

    /**
     * Retorna el elemento de la posición del parámetro de entrada
     * @param index Indica el valor del parámetro
     * @return String almacenado en la posición del parámetro
     */
    public String get( int index ) throws Exception {

        if( index >= 0 && index < size ){

            return array[index];
        }

        throw new Exception("Indice Fuera de Rango");
    }

    /**
     * Elimina todos los elementos del arreglo
     */
    public void clear(){

    }

    /**
     * Retorna la posición del primer elemento que coincide con el parámetro
     * @param element Indica el elemento
     * @return entero con la posición del elemento, o -1 si el elemento no existe
     */
    public int indexOf( String element){

        return 0;
    }

    /**
     * Retorna la posición del primer elemento (derecha a izquierda) que coincide con el parámetro
     * @param element Indica el elemento
     * @return entero con la posición del elemento, o -1 si el elemento no existe
     */
    public int lastIndexOf(String element){

        return 0;
    }

    /**
     * Elimina el elemento ubicado en la posición del parámetro, desplaza los elementos ubicados
     * a la derecha del elemento eliminado, hacia a la izquierda
     * @param index indica la posición del elememto a eliminar
     * @return Elemento eliminado, si existe, si index no es válido, retorna null
     */
    public String remove( int index ){

        return null;
    }

    /**
     * Reemplaza el elemento ubicado en la posición del indice del parámetro, por
     * el elemento del segundo parámetro
     * @param index indica la posición del elemento a reemplazar
     * @param element indica el nuevo elemento
     * @return elemento que se reemplazó.
     */
    public String set( int index, String element){

        return null;
    }

    public String[] sortBurble(){
        String[] clone = array.clone();


        return clone;
    }

    public String[] getArray() {
        return array.clone();
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("array=[");
        for ( int index = 0 ; index < size ; index++ ){
            out.append(array[index]);
            if ( index < size - 1 ){
                out.append(',');
            }
        }
        out.append(']');

        return out.toString();
    }
}
