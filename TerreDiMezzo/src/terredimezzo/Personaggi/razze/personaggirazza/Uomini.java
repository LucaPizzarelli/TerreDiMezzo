package terredimezzo.Personaggi.razze.personaggirazza;

import terredimezzo.Personaggi.razze.Razza;

public class Uomini extends Razza{
    
    public Uomini() {
        super();
    }
    
    @Override
    public int forza() {
        return 30 + 6 * super.esperienza;
    }
    
}
