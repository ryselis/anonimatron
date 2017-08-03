//package com.esperonus.anonimatrons;
//
//import java.sql.ResultSet;
//
//import com.rolfje.anonimatron.anonymizer.Anonymizer;
//import com.rolfje.anonimatron.synonyms.*;
//
//class SubjectTitleAnonymizer extends Anonymizer{
//    @Override
//    public Synonym anonymize(Object from, int size) {
//        return null;
//    }
//
//    @Override
//    public Synonym anonymize(Object from, int size, ResultSet resultSet) {
//        val synonym = new StringSynonym
//        val value = o match {
//            case x: String => x
//            case _ => throw new ClassCastException
//        }
//        synonym.setFrom(value)
//        val firstName = resultSet.getObject("first_name") match {
//            case x: String => x
//            case _ => throw new ClassCastException
//        }
//        val lastName = resultSet.getObject("last_name") match {
//            case x: String => x
//            case _ => throw new ClassCastException
//        }
//        val transformedValue = firstName + " " + lastName
//        synonym.setTo(transformedValue)
//        synonym
//    }
//
//    override def anonymize(o: scala.Any, i: Int): Synonym = null
//
//    override def anonymize(o: scala.Any, i: Int, resultSet: ResultSet): Synonym = {
//        val synonym = new StringSynonym
//        val value = o match {
//            case x: String => x
//            case _ => throw new ClassCastException
//        }
//        synonym.setFrom(value)
//        val firstName = resultSet.getObject("first_name") match {
//            case x: String => x
//            case _ => throw new ClassCastException
//        }
//        val lastName = resultSet.getObject("last_name") match {
//            case x: String => x
//            case _ => throw new ClassCastException
//        }
//        val transformedValue = firstName + " " + lastName
//        synonym.setTo(transformedValue)
//        synonym
//    }
//
//    override def getType: String = "SUBJECT_TITLE"
//}
