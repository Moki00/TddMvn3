package org.moki.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.*;

public class PhoneNumValTest {

    private PhoneNumValidator underTest;

    @BeforeEach
    void setup(){
        underTest = new PhoneNumValidator();
    }

    @ParameterizedTest
    @CsvSource({
            "14703334444, TRUE",
            "147026, FALSE",
            "147026999123456789, FALSE"
    })
    void validatePhoneNumber(String phoneNum, boolean expected){

        //when
        boolean isValid = underTest.test(phoneNum);
        //then
        assertEquals(isValid, expected);
    }

    @Test
    void itShouldValidatePhoneNumberWhenTooShort(){
        //given
        String phoneNum= "+";
        //when
        boolean isValid = underTest.test(phoneNum);
        //then
        assertFalse(isValid);
    }

    @Test
    void itShouldValidatePhoneNumberWhenTooLong(){
        //given
        String phoneNum= "+";
        //when
        boolean isValid = underTest.test(phoneNum);
        //then
        assertFalse(isValid);
    }

    @Test
    void copy(){
        //given
        //when
        //then
    }
}
