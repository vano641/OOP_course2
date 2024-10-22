import java.util.ArrayList;
import java.util.List;

public class task2_Market implements task2_MarketBehaviour, task2_QueueBehaviour{

    private List<task2_Actor> humansList; // список Акторов (name)

    private List<task2_Actor> queueList; // список очереди (name, isMakeOrder)

    private List<task2_Actor> queueListMakeOrder; // список сделавших заказ

    private List<task2_Actor> queueGiveOrders; // список получивших заказ

    private List<task2_Actor> result; // список Акторов готовых выходить из магазина

    public task2_Market() {
        this.humansList = initHumans();
        this.queueList = takeInQueue();
        this.queueListMakeOrder = takeOrders();
        this.queueGiveOrders = giveOrders();
        this.result = releaseFromQueue();
    }

    public List<task2_Actor> initHumans(){
        List<task2_Actor> HL = new ArrayList<>();
        HL.add(new task2_Human("Ivan"));
        HL.add(new task2_Human("Kristina"));
        HL.add(new task2_Human("Artem"));
        return HL;
    }

    @Override
    public List<task2_Actor> takeInQueue() {
        List<task2_Actor> QL = new ArrayList<>();
        for (task2_Actor i : humansList) {
            QL.add(new task2_Human(i.getName(), i.isMakeOrder()));
        }
        return QL;
    }

    public void takeInQueueinfo() {
        for (task2_Actor i : queueList) {
            System.out.println(String.format("name: %s - makeOrder: %s",i.getName(),i.isMakeOrder()));
        }
        System.out.println();
    }

    @Override
    public List<task2_Actor> takeOrders() {
        List<task2_Actor> TO = new ArrayList<>();
        for (task2_Actor i : queueList) {
            if (i.isMakeOrder() == false) {

//ЕСЛИ СДЕЛАТЬ ТАК, ТО true поменяется везде(queueList и queueListMakeOrder) (почему не смог понять)
// и когда я вызываю из main (takeInQueueinfo() и takeOrdersinfo()) методы для печати результата, то и там и там true

                        //ПОЯСНИТЕ ПОЖАЛУЙСТА ПОЧЕМУ ТАК И КАК СДЕЛАТЬ ПРАВИЛЬНО

                //i.setMakeOrder(true);
                //TO.add(new task2_Human(i.getName(), i.isMakeOrder()));

                TO.add(new task2_Human(i.getName(), true)); // Вынужден сделать так, чтобы вывод был корректный
                // для takeInQueueinfo() - false; для takeOrdersinfo() - true
            }
        }
        return TO;
    }

    public void takeOrdersinfo() {
        for (task2_Actor i : queueListMakeOrder) {
            System.out.println(String.format("name: %s - makeOrder: %s",i.getName(),i.isMakeOrder()));
        }
        System.out.println();
    }

    @Override
    public List<task2_Actor> giveOrders() {
        List<task2_Actor> GO = new ArrayList<>();
        for (task2_Actor i : queueListMakeOrder) {
            if (i.isMakeOrder == true) {
                GO.add(new task2_Human(i.getName(), i.isMakeOrder, true));
            }
        }
        return GO;
    }

    public void GiveOrders_info() {
        for (task2_Actor i : queueGiveOrders) {
            System.out.println(String.format("name: %s - makeOrder: %s - takeOrders: %s",i.getName(),i.isMakeOrder(), i.isTakeOrder()));
        }
        System.out.println();
    }

    @Override
    public List<task2_Actor> releaseFromQueue() {
       List<task2_Actor> RFQ = new ArrayList<>();
       for (task2_Actor i : queueGiveOrders) {
            if (i.isTakeOrder == true) {
                RFQ.add(new task2_Human(i.getName()));
            }
       }
       return RFQ;
    }

    public void resultList(){
        for (task2_Actor i : result) {
            System.out.println(String.format("Клиент name: %s сделал покупку и покинул магазин", i.getName()));
        }
        System.out.println();
    }

    @Override
    public void acceptToMarket() {
        for (task2_Actor i : humansList) {
            System.out.println(String.format("name: %s", i.getName()));
        }
        System.out.println();

    }

    @Override
    public void releaseFromMarket(List<task2_Actor> actorList) {
        
    }

    @Override
    public void update() {
        System.out.println("Список клиентов вошедших в магазин: \n" + humansList);
        System.out.println("Список клиентов Сделавших заказ: \n" + queueListMakeOrder);
        System.out.println("Список клиентов Забравших заказ: \n " + queueGiveOrders);
        for (task2_Actor i : result) {
            System.out.println(String.format("Клиент name: %s сделал покупку и покинул магазин", i.getName()));
        }

    }
    
}
