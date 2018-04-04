/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexey.lumoa.jsontocsv.boundary;

import com.alexey.lumoa.jsontocsv.entity.UserInput;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author user
 */
@Stateless
public class Service {
    
    public Object test(UserInput userInput) {
        String jsonString = userInput.getJson();
        String path = userInput.getDestination()+ "/" + userInput.getNewFile();
        JSONObject output;
        try{
            output = new JSONObject(jsonString);


            JSONArray docs = output.getJSONArray(userInput.getArrayName());

            File file=new File(path);
            String csv = CDL.toString(docs);
            csv = csv.replace(',', ';');
            FileUtils.writeStringToFile(file, csv);
            return Json.createObjectBuilder()
                    .add("path", "You might find your your file at ->" + path)
                    .build();
        } catch (IOException | JSONException e){
            throw new RuntimeException(e);
        }
    }
    
}
