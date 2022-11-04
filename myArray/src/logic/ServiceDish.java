package logic;

public class ServiceDish {
    private Dish[] dishes;
    private int size;

    public ServiceDish() {
        dishes = new Dish[20];
        size = 0;
    }

    public boolean add( Dish dish ){
        if( findDish(dish.getId()) == null ){
            dishes[size++] = dish;

            return true;
        }

        return false;
    }

    public Dish findDish(String id) {
        for( int index = 0 ; index < size ; index++ ){
            if( dishes[index].getId().equals(id) ){
                return dishes[index];
            }
        }

        return null;
    }

    public Dish[] sort(){
        Dish[] sorted = dishes.clone();
        for( int i = 1 ; i < size ; i++ ){
            int pos = i - 1;
            Dish aux = sorted[i];
            while( pos >= 0 && aux.getId().compareTo(sorted[pos].getId()) < 0 ){
                sorted[pos + 1 ] = sorted[pos--];
            }
            sorted[pos + 1] = aux;
        }

        return sorted;
    }

    public int getSize() {
        return size;
    }
}
