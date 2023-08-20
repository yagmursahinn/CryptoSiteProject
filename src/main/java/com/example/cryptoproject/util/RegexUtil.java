package com.example.cryptoproject.util;

import java.util.regex.Pattern;

public class RegexUtil {

    public static final String NAME_REGEX = "^[a-zA-Z]+$";
    public static final String IDENTIFIER_REGEX = "^[0-9]{11}$";
    public static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    public static final String PHONE_REGEX = "^(\\d{3}[- .]?){2}\\d{4}$";
    public static final String PASSWORD_REGEX = "[a-zA-Z0-9]{8,}";

    public static boolean matches(String regex, String text) {
        return Pattern.matches(regex, text);
    }
}
