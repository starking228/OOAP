package Lab11;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

class ForkJoinBookScraper {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        // Паралельно запускаємо обробку двох сторінок
        pool.invoke(new BookScrapeTask(1, 2));
    }

    static class BookScrapeTask extends RecursiveAction {
        private final int startPage;
        private final int endPage;
        private final String baseUrl = "http://books.toscrape.com/catalogue/page-";

        public BookScrapeTask(int startPage, int endPage) {
            this.startPage = startPage;
            this.endPage = endPage;
        }

        @Override
        protected void compute() {
            if (endPage - startPage >= 1) {
                // Розділяємо завдання на менші
                int mid = (startPage + endPage) / 2;
                BookScrapeTask task1 = new BookScrapeTask(startPage, mid);
                BookScrapeTask task2 = new BookScrapeTask(mid + 1, endPage);
                invokeAll(task1, task2);
            } else {
                // Якщо лише одна сторінка — обробляємо
                String url = baseUrl + startPage + ".html";
                try {
                    Document doc = Jsoup.connect(url).get();
                    Elements books = doc.select(".product_pod");

                    for (Element book : books) {
                        String title = book.select("h3 > a").attr("title");
                        String price = book.select(".price_color").text();
                        String ratingClass = book.select(".star-rating").attr("class");
                        int starsRating = getStarInt(ratingClass.replace("star-rating", "").trim());

                        System.out.printf("Сторінка %d | Назва: %s | Ціна: %s | Рейтинг: %d зірок%n",
                                startPage, title, price, starsRating//.replaceAll("£", ""), starsRating);
                        );
                    }

                } catch (IOException e) {
                    System.err.println("Помилка при обробці сторінки " + startPage + ": " + e.getMessage());
                }
            }
        }

        private int getStarInt(String rating) {
            return switch (rating) {
                case "One" -> 1;
                case "Two" -> 2;
                case "Three" -> 3;
                case "Four" -> 4;
                default -> 5;
            };
        }
    }
}
