package com.panally.api;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.panally.users.sessions.SessionData;
import com.panally.core.CoreInterface;

/**
 * @author gaurav.jain
 * @author nirlendu.saha
 */

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class PanallyResource {

	private SessionData sessionData = new SessionData();
	private CoreInterface coreInterface = new CoreInterface();

    public PanallyResource(){

    }

    @PermitAll
    @GET
    @Path("/getlist")
    public Response getListings() {
        return Response.ok(this.coreInterface.getListings(
        	sessionData.getUserID())
        ).build();
    }
}
