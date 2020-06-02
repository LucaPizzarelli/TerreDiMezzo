package terredimezzo.Personaggi.razze.personaggirazza;

import terredimezzo.Personaggi.razze.Razza;

public class Hobbit extends Razza{
    
    public Hobbit() {
        super();
    }
    
    @Override
    public int forza() {
        return 10 + 3 * super.esperienza;
    }
    
}
