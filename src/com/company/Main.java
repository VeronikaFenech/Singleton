package com.company;

public class Main {

    public static void main(String[] args) {
	Worker worker= new Worker();
	Worker worker1= new Worker();
worker.work("Book");
        worker1.work("Shoes");
        System.out.println(" Worker 1 items");
         for (String item: worker.getStorage().getItems()){
             System.out.print(item+ " ");
         }
        System.out.println();
        System.out.println(" Worker 2 items");
        for (String item: worker1.getStorage().getItems()){
            System.out.print(item+ " ");
        }
        System.out.println();
    }
}
