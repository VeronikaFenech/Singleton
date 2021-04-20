package com.company;

public class Worker {
    private Storage storage;

    public Worker() {
        storage = Storage.getInstance();
    }

    public void work(String item) {
        storage.addItem(item);
    }

    public Storage getStorage() {
        return storage;
    }
}
