
import classes.Actor;
import classes.Market;
import classes.OrdinaryClient;
import classes.SpecialClient;
import classes.TaxInspector;
import classes.ActionKlient;
public class Main {
    
    public static void main(String[] args) throws Exception {  // Основная сборка всей программы
            // подключение клиентов
        Market magnit = new Market();                          
        Actor client1 = new OrdinaryClient("Anatoliy");
        Actor client2 = new OrdinaryClient("TOlya");
        Actor client3 = new SpecialClient("President", 13);
        TaxInspector client4 = new TaxInspector();
        // Подкл. акционного клиента
        ActionKlient client5 = new ActionKlient("Maxim", 8);
        ActionKlient.setSuperPriceClient(10);
        client5.setNameAction("Скидка на просрочку 50%");
        client5.showCurrentAction();
               
        // Статичный формат прихода клиентов
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.update();
        client3.returnOrder();
    }
    
}

    
