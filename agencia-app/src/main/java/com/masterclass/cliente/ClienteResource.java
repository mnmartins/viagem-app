package com.masterclass.cliente;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/cliente")
public class ClienteResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> get(){
        return Cliente.listAll();
    }

}
