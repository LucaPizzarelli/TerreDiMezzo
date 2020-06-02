package terredimezzo.Personaggi.razze.personaggirazza;

import terredimezzo.Personaggi.razze.Razza;

public class Elfi extends Razza{
    
    public Elfi() {
        super();
    }
    
    @Override
    public int forza() {
        if (super.esperienza < 5) 
            return 20 + 3 * super.esperienza;
        return 80 + 2 * super.esperienza;
    }
    
}
