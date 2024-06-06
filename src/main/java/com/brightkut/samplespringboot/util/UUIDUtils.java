package com.brightkut.samplespringboot.util;

import java.util.UUID;

public class UUIDUtils {

    private UUIDUtils() {
    }

    public static String genUUID() {
        return UUID.randomUUID().toString();
    }
}
