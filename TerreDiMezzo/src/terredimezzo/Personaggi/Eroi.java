package terredimezzo.Personaggi;

import terredimezzo.Personaggi.Personaggi;

public class Eroi extends Personaggi{
    
    private int energia;
    private int esperienza;
    
    public Eroi() {
        energia = (int) (Math.random() * 10);
        esperienza = (int) (Math.random() * 10);
    }
    
    public int forza() {
        return 50 * esperienza + 50 * energia;
    }
    
}
