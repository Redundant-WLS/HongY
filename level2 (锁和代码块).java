public class SynchronizeCode {
    public static void main(String[] args) {
        /** ���������� **/
        final Object lock = new Object();
        /**�߳�һ**/
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
        /**�̶߳�**/
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