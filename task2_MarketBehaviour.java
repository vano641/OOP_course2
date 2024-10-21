import java.util.List;
public interface task2_MarketBehaviour { 
    
    void acceptToMarket(task2_Actor actor); // добавление посетителя в магазин

    void releaseFromMarket(List<task2_Actor> actorList); // метод выхода из магазина

    void update(); // обновление магазина
}
