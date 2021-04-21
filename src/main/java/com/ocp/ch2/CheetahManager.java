package main.java.com.ocp.ch2;

public class CheetahManager {
    public static CheetahManager cheetahManager;

    private CheetahManager() {}

    public static CheetahManager getCheetahManager() {
        if(cheetahManager == null) {
            cheetahManager = new CheetahManager();
        }

    return cheetahManager;
    }
}