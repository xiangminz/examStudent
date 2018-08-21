package com.jtthink.util;

import java.util.EmptyStackException;
import java.util.concurrent.atomic.AtomicReference;

public class LockFreeStack {

    private AtomicReference<Node> top = new AtomicReference<Node>();

    public LockFreeStack() {

    }

    /*
     * CAS有3个操作数，内存值V(value)，旧的预期值A(expect)，要修改的新值B(update)。
     * 当且仅当预期值A和内存值V相同时，将内存值V修改为B，否则什么都不做。
     */

    public String push(String item) {
        for (; ; ) {
            Node current = top.get();
            Node newTop;

            if (current == null) {
                newTop = new Node(null, item, 1);
            } else {
                newTop = new Node(current, item, current.getIndex() + 1);
            }

            if( top.compareAndSet(current, newTop) ){
                break;
            }
        }

        return item;
    }

    public String pop(){

        String str = "";

        for(;;){
            Node current = top.get();

            if(current == null){
                throw new EmptyStackException();
            }

            str = current.getStr();

            if( top.compareAndSet(current, current.getNext()) ){
                break;
            }

        }

        return str;
    }


    public String peek(){
        String str = "";

        for(;;){
            Node current = top.get();

            if(current == null){
                throw new EmptyStackException();
            }

            str = current.getStr();

            if( top.compareAndSet(current, current) ){
                break;
            }

        }

        return str;
    }


    public boolean empty(){
        return top.get() == null;
    }

    private int getIndex(Node node, String str){ //传引用的值不会改变原引用的值

        int i = -1;

        while( node != null){
            if( str.equals(node.getStr()) ){
                i = node.getIndex();
                break;
            } else{
                node = node.getNext();
            }

        }

        return i;
    }

    public int search(String str){
        int i;

        for(;;){
            Node current = top.get();
            i = getIndex(current, str);

            if( top.compareAndSet(current, current) ){
                break;
            }
        }

        return i;

    }


    public int Size(){
        int i=0;

        for(;;){
            Node current = top.get();

            if(current != null){
                i = current.getIndex();
            }

            if(top.compareAndSet(current, current)) {
                break;
            }
        }

        return i;

    }


    public static void main(String[] args){

        LockFreeStack lfs = new LockFreeStack();




    }


}

class Node{
    private Node next;
    private String str;
    private int index;

    public Node(Node next, String str, int index){
        this.next = next;
        this.str = str;
        this.index = index;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}