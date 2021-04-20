package com.company;

public class Main {

    public static void main(String[] args) {
        Thread worker1 = new Thread(() -> Storage.getInstance().addItem("Book"));
        Thread worker2 = new Thread(() -> Storage.getInstance().addItem("Shoes"));

        worker1.start();
        worker2.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (String item : Storage.getInstance().getItems()) {
            System.out.print(item + " ");

        }
    }
}
