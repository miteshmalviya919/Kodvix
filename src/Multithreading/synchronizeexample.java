package Multithreading;


class syncdemo {


    int []arr = {2,45,45,6,7,56,6,7,8,99,9};

    int sum = 0;


    public synchronized void  m1(){

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(Thread.currentThread().getName());
            sum+= arr[i];
            //  System.out.println("the rsum is "+ i+ " "+ sum);
        }
        System.out.println("the rsum is  "   + sum);


    }



}






public class synchronizeexample extends Thread{

 syncdemo h = new syncdemo();
       public  void run(){
           h.m1();
       }





    public static void main(String[] args) {




        synchronizeexample hel = new synchronizeexample();
        synchronizeexample hell = new synchronizeexample();

        hel.start();
        hell.start();


    }






}
