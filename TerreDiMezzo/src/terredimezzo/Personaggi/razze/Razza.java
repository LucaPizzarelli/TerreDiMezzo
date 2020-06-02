package terredimezzo.Personaggi.razze;

import terredimezzo.Personaggi.Personaggi;

abstract public class Razza extends Personaggi{
    
    protected int esperienza;
    
    public Razza() {
        esperienza = (int) (Math.random() * 10);
    }
    
    abstract public int forza();
}
