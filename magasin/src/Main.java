import classes.Actor;
import classes.Market;
import classes.OrdinaryClient;
import classes.SpecialClient;
import classes.TaxInspector;

public class Main {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Anatoliy");
        Actor client2 = new OrdinaryClient("TOlya");
        Actor client3 = new SpecialClient("President", 13);
        TaxInspector client4 = new TaxInspector();
        
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        
        magnit.update();
    }
    
}

    
