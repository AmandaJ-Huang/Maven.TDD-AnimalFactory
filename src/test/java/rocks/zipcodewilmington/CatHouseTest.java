package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {
        //Given
        Cat cat = new Cat("Stella", new Date(), 1111);
        Integer numOfCats = 1;

        //When
        CatHouse.add(cat);
        Integer actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(numOfCats, actual);
    }

    @Test
    public void removeCatTest() {
        //Given
        CatHouse.clear();
        Cat cat = new Cat("Stella", new Date(), 1111);
        Integer numOfCats = 0;

        //When
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Integer actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(numOfCats, actual);
    }

    @Test
    public void removeCatByIdTest() {
        //Given
        CatHouse.clear();
        Integer id = 1111;
        Cat cat = new Cat("Stella", new Date(), id);
        Integer numOfCats = 0;

        //When
        CatHouse.add(cat);
        CatHouse.remove(id);
        Integer actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(numOfCats, actual);
    }

    @Test
    public void getCatByIdTest() {
        //Given
        Cat cat = new Cat("Stella", new Date(), 1111);

        //When
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(1111);

        //Then
        Assert.assertEquals(cat, actual);
    }

    @Test
    public void getNumberOfCatsTest() {
        //Given
        Cat cat1 = new Cat("JonSnow", new Date(1), 1234);
        Cat cat2 = new Cat("Khaleesi", new Date(2), 9999);
        Cat cat3 = new Cat ("Duce", new Date(3), 3740237);
        Integer expectedNumOfCats = 3;

        //When
        CatHouse.clear();
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);
        Integer actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedNumOfCats, actual);
    }
}
