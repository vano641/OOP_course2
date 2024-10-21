public abstract class task2_Actor implements task2_ActorBehaviour{ 
    
    protected boolean isTakeOrder; // факт получения заказа

    protected boolean isMakeOrder; // состояние готовности сделать заказ

    protected final String name; // поле класса

    public task2_Actor(String name){ // конструктор
        this.name = name;
    }

    public abstract String getName(); // геттер

    @Override
    public String toString() {
        return String.format("name: %s", name);
    }

}
