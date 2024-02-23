package classes;

import interfaces.iActorBehaviour;

public class ActionKlient implements iActorBehaviour{
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    @Override
    public boolean isTakeOrder() {
        
        throw new UnsupportedOperationException("Unimplemented method 'isTakeOrder'");
    }
    @Override
    public boolean isMakeOrder() {
        
        throw new UnsupportedOperationException("Unimplemented method 'isMakeOrder'");
    }
    @Override
    public void setTakeOrder(boolean isCreated) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setTakeOrder'");
    }
    @Override
    public void setMakeOrder(boolean isCreated) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setMakeOrder'");
    }
    @Override
    public Actor getActor() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getActor'");
    }
}
