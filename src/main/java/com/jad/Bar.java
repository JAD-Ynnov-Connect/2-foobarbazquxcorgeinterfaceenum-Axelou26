package com.jad;


public interface IBar {
    void doSomethingLikeABar();
}

public class Bar implements IBar {
    @Override
    public void doSomethingLikeABar() {

        System.out.println("Doing something like a bar!");
    }
}
