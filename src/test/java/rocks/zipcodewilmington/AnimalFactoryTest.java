package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import java.util.Date;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog() {
        //Given
        String expectedName = "Buddy";
        Date expectedBirthDate = new Date("4/1/18");

        //When
        Animal thisDog = new Dog(expectedName,expectedBirthDate,null);
        Dog dogChecker = (Dog)thisDog;

        //Then
        String actualName = dogChecker.getName();
        Date actualBirthDate = dogChecker.getBirthDate();
        Assert.assertEquals(expectedName, actualName);


    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat() {
        //Given
        String expectedName = "Simba";
        Date expectedBirthDate = new Date("12/25/16");

        //When
        Animal thisCat = new Cat(expectedName,expectedBirthDate,null);
        Cat catChecker = (Cat)thisCat;

        //Then
        String actualName = catChecker.getName();
        Date actualBirthDate = catChecker.getBirthDate();
        Assert.assertEquals(expectedName, actualName);


    }
}
