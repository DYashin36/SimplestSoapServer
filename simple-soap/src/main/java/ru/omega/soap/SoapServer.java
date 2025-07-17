package ru.omega.soap;

import javax.xml.ws.Endpoint;

public class SoapServer {
    public static void main(String[] args) {
        String address = "http://0.0.0.0:8888/soap";
        Endpoint.publish(address, new RecordServiceImpl());
        System.out.println("SOAP-сервер запущен на " + address);
    }
}