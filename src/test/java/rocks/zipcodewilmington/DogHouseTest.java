package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addDogTest() {
        //Given
        Dog dog = new Dog("Max", new Date(), 99);
        Integer numOfDogs = 1;

        //When
        DogHouse.add(dog);
        Integer actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(numOfDogs, actual);
    }

    @Test
    public void removeDogByIdTest() {
        //Given
        Integer id = 99;
        Dog dog = new Dog("Max", new Date(), 99);
        Integer numOfDogs = 0;

        //When
        DogHouse.add(dog);
        DogHouse.remove(id);
        Integer actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(numOfDogs, actual);
    }

    @Test
    public void removeDogTest() {
        //Given
        Dog dog = new Dog("Max", new Date(), 99);
        Integer numOfDogs = 0;

        //When
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(numOfDogs, actual);
    }

    @Test
    public void getDogByIdTest() {
        //Given
        DogHouse.clear();
        Integer id = 99;
        Dog dog = new Dog("Max", new Date(), id);

        //When
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(id);

        //Then
        Assert.assertEquals(dog, actual);
    }

    @Test
    public void getNumberOfDogsTest() {
        //Given
        Dog dog1 = new Dog("Ellie", new Date(1), 315);
        Dog dog2 = new Dog("Pepper", new Date(2), 7);
        Dog dog3 = new Dog("Moka", new Date(3), 100000);
        Dog dog4 = new Dog("Kuma", new Date(4), 3274);
        Integer expectedNumOfDogs = 4;

        //When
        DogHouse.clear();
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);
        DogHouse.add(dog4);
        Integer actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedNumOfDogs, actual);
    }
}
