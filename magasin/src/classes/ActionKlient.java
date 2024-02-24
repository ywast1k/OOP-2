package classes;



public class ActionKlient extends Actor{
    private int id;
    private static int superPriceClient; //статичное кол-во участников
    private String nameAction; // Название акции

    public ActionKlient(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean isCreated) {
        
    }

    @Override
    public void setMakeOrder(boolean isCreated) {
        isMakeOrder = isCreated;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    String getName() {
       return super.name;
    }

    @Override
    void setName(String name) {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getSuperPriceClient() {
        return superPriceClient;
    }

    public static void setSuperPriceClient(int superPriceClient) {
        ActionKlient.superPriceClient = superPriceClient;
    }

    public String getNameAction() {
        return nameAction;
    }

    public void setNameAction(String nameAction) {
        this.nameAction = nameAction;
    }
        
    public void showCurrentAction() {
        if (id<=superPriceClient){
            System.out.println("Клиент" + super.name + "с id: " + this.id + "Учавствует в акции " + this.nameAction );
        } else 
            System.out.println("Клиент" + super.name + "с id: " + this.id + "Не учавствует в акции " + this.nameAction );
        
        }
    }

