public interface task2_QueueBehaviour {

    void takeInQueue(task2_Actor actor); // забрать из очереди

    void takeOrders();// забрать заказ

    void giveOrders(); // отдать заказ

    void releaseFromQueue(); // выйти из очереди
}
