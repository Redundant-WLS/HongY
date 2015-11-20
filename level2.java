import java.lang.Runnable;
import java.lang.String;
import java.lang.System;
import java.lang.Thread;

class Dong extends Thread {  //线程所需要继承的类
       public void run() {      //run方法可以覆盖父类
        for (int i=0;i<100;i++) {
            System.out.println("**");
        }
    }
}
public class First{
     public static void main(String[] args){
         Dong dong=new Dong();
         dong.start();  //start可以单开启一个线程，而不是直接调用
         for (int i=0;i<100;i++){
             System.out.println("$$");
         }

     }

}


class Bong implements Runnable{  //实现接口，不继承类
      public void run{
        for (int i=0;i<100;i++){
            System.out.println("888");
        }

    }
}

public class First{
    public static void main(String[] args){
        Bong bong=new Bong();
        Thread c=new Thread(bong);
        a.start();
        for (int i=0;i<100;i++){
            System.out.println("999");
        }
    }
}


