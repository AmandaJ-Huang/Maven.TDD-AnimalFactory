package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        //Given
        String name = "Max";
        Date birthDate = new Date();

        //When
        Dog actual = AnimalFactory.createDog(name, birthDate);
        String actualName = actual.getName();
        Date actualBirthDate = actual.getBirthDate();

        //Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);
    }

    @Test
    public void createCatTest() {
        //Given
        String name = "Stella";
        Date birthDate = new Date();

        //When
        Cat actual = AnimalFactory.createCat(name, birthDate);
        String actualName = actual.getName();
        Date actualBirthDate = actual.getBirthDate();

        //Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);

    }
}
