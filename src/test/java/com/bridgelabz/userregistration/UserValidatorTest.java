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

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        Assert.assertTrue(userValidator.validateFirstName("Jaspreet"));
    }

    @Test
    public void givenFirstName_WhenProperWithMinLength_ShouldReturnTrue() {
        Assert.assertTrue(userValidator.validateFirstName("Jas"));
    }

    @Test
    public void givenFirstName_WhenStartWithLowerCaseLetter_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validateFirstName("jaspreet"));
    }

    @Test
    public void givenFirstName_WhenLessThanMinLength_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validateFirstName("Ja"));
    }

    @Test
    public void givenFirstName_WhenContainsNumber_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validateFirstName("Jas1"));
    }
}