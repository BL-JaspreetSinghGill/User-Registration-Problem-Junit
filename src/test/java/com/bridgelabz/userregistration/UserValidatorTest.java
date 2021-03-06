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

    @Test
    public void givenPhoneNumber_WhenCountryCodeFirstDigitIsWithinRange_ShouldReturnTrue() {
        Assert.assertTrue(userValidator.validatePhoneNumber("64 9876543210"));
    }

    @Test
    public void givenPhoneNumber_WhenCountryCodeIsLessThanSpecifiedLength_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validatePhoneNumber("9 9876543210"));
    }

    @Test
    public void givenPhoneNumber_WhenCountryCodeIsGreaterThanSpecifiedLength_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validatePhoneNumber("912 9876543210"));
    }

    @Test
    public void givenPhoneNumber_WhenLessThanSpecifiedLength_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validatePhoneNumber("91 987654321"));
    }

    @Test
    public void givenPhoneNumber_WhenGreaterThanSpecifiedLength_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validatePhoneNumber("91 98765432101"));
    }

    @Test
    public void givenPhoneNumber_WhenContainsMoreThanOneSpace_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validatePhoneNumber("91  9876543210"));
    }

    @Test
    public void givenPhoneNumber_WhenContainsSpChInsteadOfSpace_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validatePhoneNumber("91-9876543210"));
    }

    @Test
    public void givenPhoneNumber_WhenContainsSpecialCharacter_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validatePhoneNumber("91 987654321@"));
    }

    @Test
    public void givenPhoneNumber_WhenContainsAlphabet_ShouldReturnFalse() {
        Assert.assertFalse(userValidator.validatePhoneNumber("91 987654321a"));
    }

}