package terredimezzo.Personaggi.razze.personaggirazza;

import terredimezzo.Personaggi.razze.Razza;

public class Nani extends Razza{
    
    public Nani() {
        super();
    }
    
    public int forza() {
        return 20 + 4 * super.esperienza;
    }
    
}
