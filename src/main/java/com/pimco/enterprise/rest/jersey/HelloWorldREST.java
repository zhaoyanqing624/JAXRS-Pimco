package com.pimco.enterprise.rest.jersey;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.alibaba.fastjson.JSONObject;

@Path("/helloWorldREST")
public class HelloWorldREST {
	@GET
	@Path("/{parameter}")
	public Response responseMsg( @PathParam("parameter") String parameter,
			@DefaultValue("Nothing to say") @QueryParam("value") String value) {

		String output = "Hello from: " + parameter + " : " + value;
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "zhaoyanqing");
		jsonObject.put("age", "25");
		String json = jsonObject.toJSONString();
		return Response.status(200).entity(json).build();
	}
}
