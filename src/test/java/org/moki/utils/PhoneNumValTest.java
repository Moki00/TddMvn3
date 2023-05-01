package org.moki.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static jdk.jshell.CompletenessAnalyzer.TK.TRUE;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class PhoneNumValTest {

    private PhoneNumValidator underTest;

    @BeforeEach
    void setup(){
        underTest = new PhoneNumValidator();
    }

    @ParameterizedTest
    @CsvSource({"14703334444", "TRUE"})
    void itShouldValidatePhoneNumber(String input, String expected){
        //given
        String phoneNum= "+";
        //when
        boolean isValid = underTest.test(phoneNum);
        //then
        assertTrue(isValid);
    }

    @Test
    void itShouldValidatePhoneNumberWhenTooShort(){
        //given
        String phoneNum= "+147026";
        //when
        boolean isValid = underTest.test(phoneNum);
        //then
        assertFalse(isValid);
    }

    @Test
    void itShouldValidatePhoneNumberWhenTooLong(){
        //given
        String phoneNum= "+147026999123456789";
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
