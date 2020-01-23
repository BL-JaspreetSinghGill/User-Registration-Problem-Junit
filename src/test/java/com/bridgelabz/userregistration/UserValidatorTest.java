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
}