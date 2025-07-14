import org.minbeom.lib.thread.cThread;
import org.junit.jupiter.api.Test;

public class ThreadTest {
    @Test
    public void test() {
        cThread thread = new cThread();
        thread.start();

        try {

            while (true) {

                Thread.sleep(3000);

                System.out.println("MainThread @@@@@@@@@@");

            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
