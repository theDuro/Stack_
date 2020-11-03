package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

interface StackOperations {


    List<String> get();


    Optional<String> pop();

    void push (final String item);
}
class Stac implements  StackOperations {
    List<String> stack = new LinkedList<>();

    @Override
    public List<String> get() {
        return stack;
    }

    @Override
    public Optional<String> pop() {

        if(stack.isEmpty()) {
            return Optional.empty();
        }
        else{

            final Optional<String> RETURNED_ITEM = Optional.of(stack.get(0));
            stack.remove(0);
            return RETURNED_ITEM;
        }


       /// return stack.isEmpty() ? Optional.empty() : Optional.of(stack.get(0));
    }


    @Override
    public void push(String item) {
        stack.add(0,item);
    }
}



public class Main {

    public static void main(String[] args) {
        Stac stack = new Stac();
        Stac stackEmpty = new Stac();
        stack.push("dzialam");
        stack.push("dzialam chyba");
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("i nadal");
        System.out.println(stack.pop());
        System.out.println(stack.get());
        System.out.println(stackEmpty.pop());


    }
}
