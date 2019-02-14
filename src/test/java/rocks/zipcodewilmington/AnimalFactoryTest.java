package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void creatDogTest(){
        String givenName = "Chalie";
        Date giveDate = new Date();
        Integer givenId =45;
        //when
        Dog dog = new Dog(givenName,giveDate, givenId);
        String retreivedName = dog.getName();
        Date retreivedDate = dog.getBirthDate();
        Integer retreivedId= dog.getId();
        //then
        Assert.assertEquals(givenName,retreivedName);
        Assert.assertEquals(giveDate,retreivedDate);
        Assert.assertEquals(givenId,retreivedId);


    }


    @Test
    public void createCatTest(){
        String givenName = "Chalie";
        Date giveDate = new Date();
        Integer givenId =45;
        //when
        Cat cat = new Cat(givenName,giveDate, givenId);
        String retreivedName = cat.getName();
        Date retreivedDate = cat.getBirthDate();
        Integer retreivedId= cat.getId();
        //then
        Assert.assertEquals(givenName,retreivedName);
        Assert.assertEquals(giveDate,retreivedDate);
        Assert.assertEquals(givenId,retreivedId);


    }




    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
