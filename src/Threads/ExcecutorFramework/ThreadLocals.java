package ExcecutorFramework;


public class ThreadLocals {

    static ThreadLocal<Integer> local =
            ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            local.set(100);

            System.out.println(
                Thread.currentThread().getName()
                + " : " + local.get()
            );
        });

        Thread t2 = new Thread(() -> {
            local.set(200);

            System.out.println(
                Thread.currentThread().getName()
                + " : " + local.get()
            );
        });

        t1.start();
        t2.start();
    }
}