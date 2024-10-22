public abstract class task2_Actor implements task2_ActorBehaviour{ 
    
    protected boolean isTakeOrder; // факт получения заказа

    protected boolean isMakeOrder; // состояние готовности сделать заказ

    protected final String name; // поле класса

    public task2_Actor(String name, boolean isMakeOrder, boolean isTakeOrder){ // конструктор
        this.name = name;
        this.isMakeOrder = isMakeOrder;
        this.isTakeOrder = isTakeOrder;
    }

    public task2_Actor(String name) {
        this.name = name;
    }

    public task2_Actor(String name, boolean isMakeOrder) {
        this.name = name;
        this.isMakeOrder = isMakeOrder;
    }


    public abstract String getName(); // геттер

    @Override
    public String toString() {
        return String.format("name: %s - MakeOrder: %s - TakeOrder: %s", name, isMakeOrder, isTakeOrder);
    }

}
