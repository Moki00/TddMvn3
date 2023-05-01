package org.moki.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneNumValTest {

    private PhoneNumValidator underTest;

    @BeforeEach
    void setup(){
        underTest = new PhoneNumValidator();
    }

    @Test
    void itShouldValidatePhoneNumber(){
        //given
        String phoneNum= "4702697899";
        //when
        boolean isValid = underTest.validate(phoneNum);
        //then
    }

    @Test
    void copy(){
        //given
        //when
        //then
    }
}
