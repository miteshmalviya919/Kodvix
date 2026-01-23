package Multithreading;


public class Multidemo extends Thread {

        @Override
         public void  run(){

            for (int i = 0; i < 100; i++) {
                System.out.println("the new one"+ getThreadGroup());
            }

        }

    public static void main(String[] args) {


        Multidemo t = new Multidemo();

       t.start();

 try {


     Thread.sleep(3000);
     for (int i = 0; i < 100; i++) {
         System.out.println("main thread");
     }
 }catch (Exception e){

 }
     //   t.start();
    }




}
