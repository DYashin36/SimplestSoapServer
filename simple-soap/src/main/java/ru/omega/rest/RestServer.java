package ru.omega.rest;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class RestServer {

    public static final String BASE_URI = "http://0.0.0.0:8888/";

    public static HttpServer startServer() {
        final ResourceConfig rc = new ResourceConfig().packages("ru.omega.rest");
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    public static void main(String[] args) throws IOException {
        final HttpServer server = startServer();
        System.out.println("REST-сервер запущен на " + BASE_URI);
        System.in.read();
        server.shutdownNow();
    }
}