public class SynchronizeCode {
    public static void main(String[] args) {
        /** 创建锁对象 **/
        final Object lock = new Object();
        /**线程一**/
        new Thread() {
            public void run() {
                while (true) {
                    synchronized (lock) {
                        System.out.print("go");
                        System.out.println("come");
                    }
                }
            };
        }.start();
        /**线程二**/
        new Thread() {
            public void run() {
                while (true) {
                    synchronized (lock) {
                        System.out.print("bang");
                        System.out.println("world");
                    }
                }
            };
        }.start();
    }
}