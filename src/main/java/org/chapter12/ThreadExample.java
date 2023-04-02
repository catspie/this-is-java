package org.chapter12;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        //데몬스레드의 특징 : 메인스레드가 종료되면 자동으로 같이 종료된다.
        thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }
}