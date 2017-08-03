package com.rolfje.anonimatron.anonymizer;

import java.sql.ResultSet;
import java.util.Random;

import com.rolfje.anonimatron.synonyms.*;


class PhoneNumberAnonymizer implements Anonymizer {
    @Override
    public Synonym anonymize(Object from, int size) {
        return null;
    }

    @Override
    public Synonym anonymize(Object from, int size, ResultSet resultSet) {
        StringSynonym synonym = new StringSynonym();
        synonym.setFrom(from);
        String currentValue = (String) from;
        String newValue = currentValue.equals("") ? "": generateRandomPhoneNumber();
        synonym.setTo(newValue);
        return synonym;
    }

    @Override
    public String getType() {
        return "PHONE_NUMBER";
    }


    private String generateRandomPhoneNumber(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+3706");
        Random random = new Random();
        for (int i = 0; i < 2; i++){
            stringBuilder.append(Integer.toString(random.nextInt(10)));
        }
        for (int i = 0; i < 5; i++){
            stringBuilder.append(Integer.toString(random.nextInt(10)));
        }
        return stringBuilder.toString();
    }

}
