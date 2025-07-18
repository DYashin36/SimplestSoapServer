// package ru.omega.rest;

// import javax.ws.rs.*;
// import javax.ws.rs.core.MediaType;
// import javax.ws.rs.core.Response;

// @Path("/record")
// public class RecordResource {

//     @POST
//     @Path("/by-id")
//     @Consumes(MediaType.APPLICATION_JSON)
//     @Produces(MediaType.APPLICATION_XML)
//     public Response getRecordById(RecordRequest request) {
//         String id = request.getId();

//         String xml = "<record><id>" + id + "</id></record>";
//         return Response.ok(xml, MediaType.APPLICATION_XML).build();
//     }
// }