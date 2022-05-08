package com.shivaprasad;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJavaToJSONString {

    public static void main(String[] args) {

        Student student = new Student(101, "Shiva", "India");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String jsonStr = objectMapper.writeValueAsString(student);
            System.out.println("Student: "+ jsonStr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
