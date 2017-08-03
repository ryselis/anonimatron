package com.rolfje.anonimatron.anonymizer;
import com.rolfje.anonimatron.synonyms.StringSynonym;
import com.rolfje.anonimatron.synonyms.Synonym;

import java.sql.ResultSet;
import java.sql.SQLException;


class SubjectContactPhoneNumberAnonymizer extends PhoneNumberAnonymizer{
    public SubjectContactPhoneNumberAnonymizer(){

    }

    @Override
    public Synonym anonymize(Object from, int size, ResultSet resultSet) {
        String contactType;
        try {
            contactType = (String) resultSet.getObject("contact_type");
        } catch (SQLException e) {
            return super.anonymize(from, size, resultSet);
        }
        StringSynonym synonym = (StringSynonym) super.anonymize(from, size, resultSet);
        String res = (String) (contactType.equals("mp") || synonym.getTo().equals("p") ? synonym.getTo() : synonym.getFrom());
        synonym.setTo(res);
        return synonym;
    }

    @Override
    public String getType() {
        return "SUBJECT_CONTACT_PHONE_NUMBER";
    }
}
