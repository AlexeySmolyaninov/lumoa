/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexey.lumoa.jsontocsv.boundary;

import com.alexey.lumoa.jsontocsv.entity.UserInput;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

/**
 *
 * @author user
 */
@Path("jsontocsv")
public class HashResource {
    
    @EJB
    Service service;
    
    @POST
    @Consumes("application/json; charset=utf-8")
    @Produces("application/json; charset=utf-8")
    public Response hash(UserInput userInput){
        Object result = service.test(userInput);
        return Response.ok(result).build();
    }
    
}
