import java.lang.Runnable;
import java.lang.String;
import java.lang.System;
import java.lang.Thread;

class Dong extends Thread {  //�߳�����Ҫ�̳е���
       public void run() {      //run�������Ը��Ǹ���
        for (int i=0;i<100;i++) {
            System.out.println("**");
        }
    }
}
public class First{
     public static void main(String[] args){
         Dong dong=new Dong();
         dong.start();  //start���Ե�����һ���̣߳�������ֱ�ӵ���
         for (int i=0;i<100;i++){
             System.out.println("$$");
         }

     }

}


class Bong implements Runnable{  //ʵ�ֽӿڣ����̳���
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


