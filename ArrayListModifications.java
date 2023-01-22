import java.util.ArrayList;
//import java.util.Collections;

class Main {

  public static void main(String[] args) {
    ArrayList <Integer> array = new ArrayList<Integer>(5);
    array.add(13);
    array.add(7);
    array.add(12);
    array.add(1200);
    array.add(17); 

    //prints arraylist
    System.out.println("Array List: " + array);
    
    //prints element at index
    int index1 = array.get(2);
    System.out.println("The element in index 2 is: " + index1);

    //index of 18
    int index = array.indexOf(18);
    System.out.println("The index of 18 is: " + index);

    //add 10 between 18 and 5
    array.add(3,10);
    System.out.println("New array after adding the element 10 between 18 and 5 " + array);

    //removes 2 from list
    array.remove(4);
    System.out.println("The element 2 is removed from the arraylist so the new list is " + array);

    //Algorithm for getting the minimum value
    int minimum = array.get(0);
    for (int i = 1; i < array.size(); i++) {
      if (minimum > array.get(i))
         minimum = array.get(i);
    }
    System.out.println("Minimum element in ArrayList = " + minimum);

    //Algorithm for getting max value
    int max = array.get(0);
    for (int i = 1; i < array.size(); i++){
      if (max < array.get(i)){
        max = array.get(i);
      }
    }
    System.out.println("Maximum element in ArrayList = " + max);

    //Average of arraylist vals
    int total = 0;
    for (int i : array){
      total += i;
    }
    int avg = total / array.size();
    System.out.println("Average of ArrayList: " + avg);

    // swapping 13 and 7 
    int num1 = 13;
    int num2 = 7;
    int i1 = array.indexOf(num1);
    int i2 = array.indexOf(num2);
    array.set(i2, num1);
    array.set(i1, num2);
    System.out.println(array);

    // sort largest to smallest
    for (int i = 0; i < array.size(); i++){
      for (int j = i; j < array.size(); j++){
            
        if (array.get(i) < array.get(j)){
            array.add(i, array.get(j));
            array.remove(j+1);
        }
        System.out.println("this is J" + j + ", " + array.get(j));
        System.out.println("this is i" + i + ", " + array.get(i));
        System.out.println();
      }
      System.out.println(array);
    }
    System.out.println(array);
    
  }
}