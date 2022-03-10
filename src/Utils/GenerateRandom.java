package Utils;

import java.util.Random;

public class GenerateRandom {
    public GenerateRandom(){}


    public String generateId(){
        Random r = new Random( System.currentTimeMillis() );
        int rint = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
        return Integer.toString(rint);
    }




}
