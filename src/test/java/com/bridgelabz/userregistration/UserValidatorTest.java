package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserValidatorTest {

    private UserValidator userValidator;

    @Before
    public void initialize() {
        userValidator = new UserValidator();
    }

    // FIRST NAME
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(userValidator.validateName("Jaspreet"));
    }

    @Test
    public void givenFirstName_WhenProperWithMinLength_ShouldReturnTrue() {
        Assert.assertTrue(userValidator.validateName("Jas"));
    }

    @Test
    public void givenFirstName_WhenStartWithLowerCaseLetter_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validateName("jaspreet"));
    }

    @Test
    public void givenFirstName_WhenLessThanMinLength_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validateName("Ja"));
    }

    @Test
    public void givenFirstName_WhenContainsNumber_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validateName("Jas1"));
    }

    @Test
    public void givenFirstName_WhenContainsSpecialCharacter_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validateName("J@s"));
    }

    // LAST NAME
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(userValidator.validateName("Jaspreet"));
    }

    @Test
    public void givenLastName_WhenProperWithMinLength_ShouldReturnTrue() {
        Assert.assertTrue(userValidator.validateName("Jas"));
    }

    @Test
    public void givenLastName_WhenStartWithLowerCaseLetter_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validateName("jaspreet"));
    }

    @Test
    public void givenLastName_WhenLessThanMinLength_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validateName("Ja"));
    }

    @Test
    public void givenLastName_WhenContainsNumber_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validateName("Jas1"));
    }

    @Test
    public void givenLastName_WhenContainsSpecialCharacter_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validateName("J@s"));
    }

    // PHONE NUMBER
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(userValidator.validatePhoneNumber("91 9876543210"));
    }

    @Test
    public void givenPhoneNumber_WhenProperCountryCodeOfTwoDigit_ShouldReturnTrue() {
        Assert.assertTrue(userValidator.validatePhoneNumber("82 9876543210"));
    }

}