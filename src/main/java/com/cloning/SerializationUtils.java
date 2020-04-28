package com.cloning;

import com.google.gson.Gson;

public class SerializationUtils {

    public static void main(String[] args) {

        SerializationUtils serializationUtils = new SerializationUtils();
        serializationUtils.whenModifyingOriginalObject_thenGsonCloneShouldNotChange();


    }


    public void whenModifyingOriginalObject_thenGsonCloneShouldNotChange() {
        Address address = new Address("Downing St 10", "London", "England");
        User pm = new User("Prime", "Minister", address);
        Gson gson = new Gson();
        User deepCopy = gson.fromJson(gson.toJson(pm), User.class);

        address.setCountry("Great Britain");

        String deepCopyCountryName = deepCopy.getAddress().getCountry();
        String countryName = pm.getAddress().getCountry();

        System.out.println("deepCopyCountryName "+deepCopyCountryName);
        System.out.println("countryName "+countryName);
    }


}
