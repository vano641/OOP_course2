import java.util.List;
public interface task2_MarketBehaviour { 
    
    void acceptToMarket(); // добавление посетителя в магазин

    void releaseFromMarket(List<task2_Actor> actorList); // метод выхода из магазина

    void update(); // обновление магазина
}
