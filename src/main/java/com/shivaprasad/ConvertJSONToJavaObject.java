package com.shivaprasad;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJSONToJavaObject {

    public static void main(String[] args) {

        String inputJson = "{ \"studentId\" : \"102\", \"studentName\" : \"Prasad\", \"studentAddress\" : \"USA\"}";
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Student student = objectMapper.readValue(inputJson, Student.class);
            System.out.println("studentId: " + student.getStudentId() +
                    ", studentName: "+student.getStudentName() +
                    ", studentAddress: "+student.getStudentAddress());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
