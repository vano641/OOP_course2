import java.util.List;
public interface task2_QueueBehaviour {

    List<task2_Actor> takeInQueue(); // забрать из очереди

    List<task2_Actor> takeOrders();// забрать заказ

    List<task2_Actor> giveOrders(); // отдать заказ

    List<task2_Actor> releaseFromQueue(); // выйти очереди
}
