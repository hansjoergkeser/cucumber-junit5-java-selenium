package ui.utils;

public class TestUtils {

    // only for demonstration purpose, to show spectators the ui test flow
    public static void sleepSomeSecs() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
