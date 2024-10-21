/**
 * task1_main Необходимо реализовать:
 * 1) Интерфейс ActorBehavior, который будет содержать описание возможных
 * действий "актора" в очереди/магазине
 * 2) Абстрактный класс Actor, который хранит в себе параметры актора, включая:
 *      - состояние готовности сделать заказ
 *      - факт получения заказа
 * Допосленине: сделать методы- геттеры для Имени и пр. персональных данных abstract
 * 3) Класс Human, который должен наследоваться от Actor и реализовать ActorBehavoir 
 */
public class task2_main {

    public static void main(String[] args) {
        task2_Human ivan = new task2_Human("Ivan");
        ivan.getName();
        System.out.println(ivan); // name: Ivan

        System.out.println(ivan.isMakeOrder()); // false
        ivan.setMakeOrder(true);
        System.out.println(ivan.isMakeOrder); // true

        System.out.println(ivan.isTakeOrder()); // false
        ivan.setTakeOrder(true);
        System.out.println(ivan.isTakeOrder); // true
    }
}