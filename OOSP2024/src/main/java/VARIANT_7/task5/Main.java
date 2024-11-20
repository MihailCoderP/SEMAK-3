public class NewsManager {
    public static void main(String[] args) {
        NewsSubject newsSubject = new NewsSubject();

        User user1 = new User("Иван");
        User user2 = new User("Мария");

        newsSubject.subscribe(user1);
        newsSubject.subscribe(user2);

        newsSubject.notifyObservers("Добавлена новая статья: 'Новости технологий'.");

        newsSubject.unsubscribe(user1);

        newsSubject.notifyObservers("Добавлена новая статья: 'Новости спорта'.");
    }
}
