package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    //setName test - equals
    @Test
    public void setNameTest1() {
        // Given (cat data)
        String givenName = "Zula";

        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), 0);

        //When (name is set and get)
        cat.setName(givenName);
        String actual = cat.getName();

        //Then expect the given name, to match the set data
        Assert.assertEquals(givenName, actual);
    }

    //setName test - not equals
    @Test
    public void setNameTest2() {
        // Given (cat data)
        String givenName = "Zula";
        String fakeName = "Mack";

        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), 0);

        //When (name is set and get)
        cat.setName(fakeName);
        String actual = cat.getName();

        //Then
        Assert.assertNotEquals(givenName, actual);
    }

    //setBirthDate test - equals
    @Test
    public void setBirthDateTest1() {
        // Given (cat data)
        Date givenBirthDate = new Date();

        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), 0);

        //When (date is set and get)
        cat.setBirthDate(givenBirthDate);
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertEquals(givenBirthDate, actual);
    }

    //setBirthDate test - not equals
    @Test
    public void setBirthDateTest2() {
        // Given (cat data)
        Date givenBirthDate = new Date();
        Date fakeBirthDate = new Date(0);
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat("", givenBirthDate, 0);

        //When (date is set and get)
        cat.setBirthDate(fakeBirthDate);
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertNotEquals(givenBirthDate, actual);
    }

    //speak test - equals
    @Test
    public void speakTest1() {
        // Given (cat data)
        String expected = "meow!";

        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), 0);

        //When speak() is invoked
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    //eat test - equals
    @Test
    public void eatTest1() {
        // Given (cat data)

        // When (a cat is constructed) and food is constructed
        Cat cat = new Cat("", new Date(), 0);
        Food catFood = new Food();

        //When eat() is invoked
        cat.eat(catFood);
        Integer eatenMeals = 1;
        Integer actual = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(eatenMeals, actual);
    }

    //getID test - equals
    @Test
    public void getIDTest1() {
        // Given (cat data)
        Integer givenId = 12345;

        // When (a cat is constructed)
        Cat cat = new Cat("", new Date(), givenId);

        //When getID() is invoked
        Integer actual = cat.getId();

        //Then
        Assert.assertEquals(givenId, actual);
    }

    //check if Cat is instanceof Animal
    @Test
    public void catInstanceOfAnimalTest() {
        // Given (cat data)
        Boolean expected = true;

        // When (a cat is constructed) via Animal
        Animal cat = new Cat(" ", new Date(), 0);

        //When
        Boolean actual = cat instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);
    }

    //check if Cat is instanceof Mammal
    @Test
    public void catInstanceOfMammalTest() {
        // Given (cat data)
        Boolean expected = true;

        // When (a cat is constructed)
        Mammal cat = new Cat(" ", new Date(), 0);

        //When
        Boolean actual = cat instanceof Mammal;

        //Then
        Assert.assertEquals(expected, actual);
    }
}
