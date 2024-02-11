import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaTest {
    @Test
    public void testFindAll() {
        Afisha manager = new Afisha();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);


        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Вперед", "Отель Белград"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessThanSize() {
        Afisha manager = new Afisha();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);


        String[] actual = manager.findLast();
        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessThanSize2() {
        Afisha manager = new Afisha(3);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);


        String[] actual = manager.findLast();
        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентельмены"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitMoreThanSize() {
        Afisha manager = new Afisha();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);


        String[] actual = manager.findLast();
        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitMoreThanSize2() {
        Afisha manager = new Afisha(4);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findLast();
        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }

}