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

    @Test
    public void setNameTest() {
        //given

        Cat cat = new Cat("chuck", new Date(25), 45);
        String expected = "chuck";

        //when
        cat.setName(expected);
        String actual = cat.getName();
        //then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void speakTest() {
        //given
        Cat cat = new Cat("Dave", new Date(25), 45);
        String expected = "meow!";
        //when
        String actual = cat.speak();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        Date bday = new Date();
        Date bday1 = new Date(1);

        //given
        Cat cat = new Cat("Sean", new Date(25), 45);
        Date expected = bday;
        //when
        //setting bdate with no return value b/c of void
        cat.setBirthDate(bday);
        //cat.getBirthDate();
        //then
        Assert.assertEquals(expected, cat.getBirthDate());
    }

    @Test
    public void eatTest() {
        //given
        Cat mike = new Cat("Mike", new Date(25), 45);
        Food food = new Food();
        Integer numberOfMeals = 1;
        //when
        mike.eat(food);
        //then
        Assert.assertEquals(numberOfMeals, mike.getNumberOfMealsEaten());

    }

    @Test
    public void getIdTest() {
        //given
        Cat cat = new Cat("jim", new Date(25), 45);
        Integer expected = 45;
        //when
        cat.getId();
        //then
        Assert.assertEquals(expected, cat.getId());
    }


    @Test
    public void testInstanceOfAnimal(){
        //instanceOf keyword to check if something is a subtype of a given type. returns true or false aka a boolean

        //given
        //made a cat named davis and expected that cat davis is a subclass of Animal
        Cat cat = new Cat("Davis", new Date(25), 45);
        Boolean expected = true;
        //when
        //actual equals cat is an instance of animal
        Boolean actual = cat instanceof Animal;
        //then
        Assert.assertEquals(actual,expected);
    }


    @Test
    public void testInstanceOfMammal(){
        //given
        Cat cat = new Cat("leah", new Date(25), 45);
        Boolean expected = true;
        //when
        Boolean actual = cat instanceof Mammal;
        //then
        Assert.assertEquals(actual,expected);
    }
}
