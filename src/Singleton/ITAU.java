package Singleton;

public class ITAU {
    private static ITAU instance;
    
    private ITAU() {
    }
    
    public static ITAU getInstance() {
        if (instance == null) {
            instance = new ITAU();
        }
        return instance;
    }    
}
