package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    //setBirthDate test - equals
    @Test
    public void setBirthDateTest1() {
        // Given (dog)
        Dog dog = new Dog(null, null, null);
        Date expected = new Date();

        //When (date is set and get)
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
    }

    //speak test - equals
    @Test
    public void speakTest1() {
        // Given (dog)
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";

        //When speak() is invoked
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    //eat test - equals
    @Test
    public void eatTest1() {
        // Given (dog)
        Dog dog = new Dog(null, null, null);
        Food catFood = new Food();
        Integer eatenMeals = 1;

        //When eat() is invoked
        dog.eat(catFood);
        Integer actual = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(eatenMeals, actual);
    }

    //getID test - equals
    @Test
    public void getIDTest1() {
        // Given (dog)
        Dog dog = new Dog(null, null, 12345);
        Integer expected = 12345;

        //When getID() is invoked
        Integer actual = dog.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    //check if Dog is instanceof Animal
    @Test
    public void dogInstanceOfAnimalTest() {
        // Given (dog)
        Animal dog = new Dog(null, null, null);
        Boolean expected = true;

        //When
        Boolean actual = dog instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);
    }

    //check if Dog is instanceof Mammal
    @Test
    public void dogInstanceOfMammalTest() {
        // Given (dog)
        Mammal dog = new Dog(null, null, null);
        Boolean expected = true;

        //When
        Boolean actual = dog instanceof Mammal;

        //Then
        Assert.assertEquals(expected, actual);
    }

}
