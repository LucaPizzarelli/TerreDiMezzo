package terredimezzo.Personaggi.razze.personaggirazza;

import terredimezzo.Personaggi.razze.Razza;

public class Urukhai extends Razza{
    
    public Urukhai() {
        super();
    }
    
    @Override
    public int forza() {
        return 50 + 5 * super.esperienza;
    }
    
}
