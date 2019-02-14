package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Dog dog;
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Before
    public void setup(){
        this.dog = new Dog("Lenny", new Date(25), 45);

    }

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

    @Test
    public void speakTest(){
        //given
        String expected = "bark!";
        //when
        dog.speak();
        //then
        Assert.assertEquals(expected, dog.speak());
    }

    @Test
    public void setBirthdateTest(){
        Date bday = new Date();
        Date bday1 = new Date ();
        //dogs created already
        //given
        Date expected = bday;
        //when
        dog.setBirthDate(bday);
        //then
        Assert.assertEquals(expected,dog.getBirthDate());
    }

    @Test
    public void eatTest(){
        //given
        Food food = new Food();
        Integer numberOfMeals =1;
        //when
        dog.eat(food);
        //then
        Assert.assertEquals(numberOfMeals,dog.getNumberOfMealsEaten());

    }
    @Test
    public void getIdTest(){
        //given
        Integer expected =45;
        //when
        dog.getId();
        //then
        Assert.assertEquals(expected,dog.getId());
    }
    @Test
    public void instanceOfAnimalTest(){
        //given
        Boolean expected = true;
        //when
        Boolean actual = dog instanceof Animal;
        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void instanceOfMammalTest(){
        //given
        Boolean expected = true;
        //when
        Boolean actual = dog instanceof Mammal;
        //then
        Assert.assertEquals(expected,actual);
    }

}
