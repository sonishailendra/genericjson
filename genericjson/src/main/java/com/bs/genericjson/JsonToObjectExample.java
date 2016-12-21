package com.bs.genericjson;

import java.io.IOException;

import com.bs.genericjson.convertor.JsonToObject;
import com.bs.genericjson.module.Employee;
import com.bs.genericjson.module.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObjectExample {
    public static void main(String[] args) throws JsonProcessingException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        String jsonString = mapper.readTree(JsonToObjectExample.class.getClassLoader().getResourceAsStream("user.json")).toString();
        System.out.println("JSON Input String :-" + jsonString);

        JsonToObject<User> jsonToObject = new JsonToObject<User>();
        User user = jsonToObject.readJSONResponse(jsonString, "user", User.class);
        System.out.println("POJO Object Result :- " +user);
        
        // Employee json reading

        jsonString = mapper.readTree(JsonToObjectExample.class.getClassLoader().getResourceAsStream("employee.json")).toString();
        System.out.println("JSON Input String :-" + jsonString);

        JsonToObject<Employee> jsonObject = new JsonToObject<Employee>();
        Employee employee = jsonObject.readJSONResponse(jsonString, "employee", Employee.class);
        System.out.println("POJO Object Result :- " +employee);
        
    }
}
