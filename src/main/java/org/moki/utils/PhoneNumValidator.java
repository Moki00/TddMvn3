package org.moki.utils;

import java.util.function.Predicate;

public class PhoneNumValidator implements Predicate<String> {


    @Override
    public boolean test(String phoneNum) {

        return phoneNum.startsWith("1") &&
                phoneNum.length()>9 &&
                phoneNum.length()<15;
    }


}
