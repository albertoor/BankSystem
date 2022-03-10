package Utils;

import java.util.Random;

public class GenerateRandom {
    public GenerateRandom(){}
    public int generateId(){
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
}
