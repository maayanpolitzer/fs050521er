package com.company;

public class DynamicArray {

    int[] array;
    int counter;

    // default constructor (without params);
    public DynamicArray(){
        array = new int[4];
        counter = 0;
    }

    public void set(int index, int newValue){
        if(index >= counter || index < 0){
            throw new IndexOutOfBoundsException();  // like return it stops the method.
        }
        array[index] = newValue;
    }

    // best: O(1)
    // worst: O(n)
    public void add(int value){
        if(array.length == counter){
            createBiggerArray();
        }
        array[counter++] = value;
    }

    public void add(int index, int value){
        if(index >= counter || index < 0){
            throw new IndexOutOfBoundsException();  // like return it stops the method.
        }
        if(array.length == counter){
            createBiggerArray();
        }
        for(int i = counter - 1; i >= index; i--){
            array[i + 1] = array[i];
        }
        array[index] = value;
        counter++;
    }

    public int size(){
        return counter;
    }

    public void createBiggerArray(){
        // create an array with twice the space;
        int[] temp = new int[counter * 2];
        // copy the values from original array to new array;
        for(int i = 0; i < counter; i++){
            temp[i] = array[i];
        }
        // call the new array "array";
        array = temp;
    }

    public void printArray(){
        //System.out.println("[20,50,-5,7,12]");
        System.out.print("[");
        for(int i = 0; i < counter; i++){
            System.out.print(array[i]);
            if(i < counter - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public void clear(){
        counter = 0;
    }

    public boolean contains(int value){
        return indexOf(value) >= -1;
        /*
        for(int i = 0; i < counter; i++){
            if(array[i] == value){
                return true;
            }
        }
        return false;
         */
    }

    public int get(int index){
        if(index >= counter || index < 0){
            throw new IndexOutOfBoundsException();  // like return it stops the method.
        }
        return array[index];
    }

    public int indexOf(int value){
        for(int i = 0; i < counter; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void remove(int index){
        if(index >= counter || index < 0){
            throw new IndexOutOfBoundsException();  // like return it stops the method.
        }
        for(int i = index; i < counter - 1; i++){
            array[i] = array[i + 1];
        }
        counter--;
    }

    // extra:
    public void addAll(DynamicArray x){
        for(int i = 0; i < x.size(); i++){
            add(x.get(i));
        }
    }

    public boolean isEmpty(){
        return counter == 0;
    }

}
