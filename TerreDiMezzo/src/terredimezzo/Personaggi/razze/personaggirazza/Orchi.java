package terredimezzo.Personaggi.razze.personaggirazza;

import terredimezzo.Personaggi.razze.Razza;

public class Orchi extends Razza{
    
    public Orchi() {
        super();
    }
    
    @Override
    public int forza() {
        if (super.esperienza < 5)
            return 30 + 2 * super.esperienza;
        return 70 + 3 * super.esperienza;
    }
    
}
