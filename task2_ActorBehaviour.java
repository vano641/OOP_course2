public interface task2_ActorBehaviour {

    void setMakeOrder(boolean makeOrder); // метод для установки заказа (создан ли заказ или нет boolean makeOrder)
    void setTakeOrder(boolean takeOrder); // забрал ли посетитель заказ или нет
    
// методы для проверки    
    boolean isMakeOrder(); // создани ли заказ
    boolean isTakeOrder(); // забрал ли посетитель заказ или нет
}
