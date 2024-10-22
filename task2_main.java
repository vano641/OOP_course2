/**
 * task1_main Необходимо реализовать:
 * 1) Интерфейс ActorBehavior, который будет содержать описание возможных
 * действий "актора" в очереди/магазине
 * 2) Абстрактный класс Actor, который хранит в себе параметры актора, включая:
 *      - состояние готовности сделать заказ
 *      - факт получения заказа
 * Допосленине: сделать методы- геттеры для Имени и пр. персональных данных abstract
 * 3) Класс Human, который должен наследоваться от Actor и реализовать ActorBehavoir 
 *      
 *      Необходимо реализовать: строение классов, без конкретной реализации
 * 1) Интерфейс QueueBehaviour, который описывает логику очереди:
 *          - Помещение/Освобождение заказа из очереди
 *          - Принятие/отдача заказа
 * 2) Интерфейс MarketBehaviour, который описывает логику магазина:
 *          - Приход/Уход покупателей
 *          - Обновление состояния магазина
 * 3) Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке
 * список людей в очереди в различных статусах
 */
public class task2_main {

    public static void main(String[] args) {
        task2_Human ivan = new task2_Human("Ivan", false, false);
        ivan.getName();
        //System.out.println(ivan.isMakeOrder());
        //System.out.println(ivan); // name: Ivan
        ivan.setMakeOrder(true);
        //System.out.println(ivan.isMakeOrder());
    


        task2_Market humanList = new task2_Market();
        humanList.acceptToMarket(); // [name: Ivan, name: Kristina, name: Artem]

        task2_Market QueueList = new task2_Market();
        QueueList.takeInQueueinfo(); //name: Ivan - makeOrder: false
                                     //name: Kristina - makeOrder: false
                                     //name: Artem - makeOrder: false
        task2_Market QueueListMakeOrder = new task2_Market();
        QueueListMakeOrder.takeOrdersinfo(); //name: Ivan - makeOrder: true
                                             //name: Kristina - makeOrder: true
                                             //name: Artem - makeOrder: true
        task2_Market QueueGiveOrders = new task2_Market();
        QueueGiveOrders.GiveOrders_info(); // name: Ivan - makeOrder: true - takeOrders: true
                                           //name: Kristina - makeOrder: true - takeOrders: true
                                           //name: Artem - makeOrder: true - takeOrders: true
        
        task2_Market resultList = new task2_Market();
        resultList.resultList(); // Клиент name: Ivan сделал покупку и покинул магазин
                                 //Клиент name: Kristina сделал покупку и покинул магазин
                                 //Клиент name: Artem сделал покупку и покинул магазин
        task2_Market update = new task2_Market();
        update.update();
        
/**Список клиентов вошедших в магазин:
[name: Ivan - MakeOrder: false - TakeOrder: false, name: Kristina - MakeOrder: false - TakeOrder: false, name: Artem - MakeOrder: false - TakeOrder: false]

Список клиентов Сделавших заказ:
[name: Ivan - MakeOrder: true - TakeOrder: false, name: Kristina - MakeOrder: true - TakeOrder: false, name: Artem - MakeOrder: true - TakeOrder: false]   

Список клиентов Забравших заказ:

[name: Ivan - MakeOrder: true - TakeOrder: true, name: Kristina - MakeOrder: true - TakeOrder: true, name: Artem - MakeOrder: true - TakeOrder: true]     

Клиент name: Ivan сделал покупку и покинул магазин
Клиент name: Kristina сделал покупку и покинул магазин
Клиент name: Artem сделал покупку и покинул магазин
*/
    }
}