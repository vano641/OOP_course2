public class task2_Human extends task2_Actor{

    
    public task2_Human(String name, boolean isMakeOrder, boolean isTakeOrder) { // конструктор
        super(name, isTakeOrder, isTakeOrder);
    }

    public task2_Human(String name) {
        super(name);
    }

    public task2_Human(String name, boolean isMakeOrder) {
        super(name, isMakeOrder);
    }

    @Override
    public void setMakeOrder(boolean makeOrder) { // для установки статуса заказа
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() { // возвращает текущее состояние
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String toString() {
        return String.format("name: %s - MakeOrder: %s - TakeOrder: %s", name, isMakeOrder, isTakeOrder);
    }
    
}
