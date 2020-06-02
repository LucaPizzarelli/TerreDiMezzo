package terredimezzo.Personaggi.razze.personaggirazza;

import terredimezzo.Personaggi.razze.Razza;

public class Sudroni extends Razza{

    public Sudroni() {
        super();
    }
    
    @Override
    public int forza() {
        return 40 + 5 * super.esperienza;
    }
    
}
