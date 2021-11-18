package com.uuid;

import java.util.UUID;

public class UUIDTest {

    public static void main(String[] args) {

        String uniqueID = UUID.randomUUID().toString();

        System.out.println(uniqueID);

    }
}
