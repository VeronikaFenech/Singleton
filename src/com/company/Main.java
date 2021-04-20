package com.company;

public class Main {

    public static void main(String[] args) {
	Worker workers1= new Worker();
	Worker workers2= new Worker();
workers1.work("Book");
        workers1.work("Shoes");
        System.out.println(" Worker 1 items");
         for (String item: workers1.getStorage().getItems()){
             System.out.print(item+ " ");
         }
        System.out.println();
        System.out.println(" Worker 2 items");
        for (String item: workers2.getStorage().getItems()){
            System.out.print(item+ " ");
        }
        System.out.println();
    }
}
