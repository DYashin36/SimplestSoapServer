package ru.omega;

import javax.jws.WebService;

@WebService(endpointInterface = "ru.omega.RecordService")
public class RecordServiceImpl implements RecordService {

    @Override
    public String getRecordById(String id) {
        System.out.println(">> [SOAP] Received ID: " + id);
        return "<record><id>" + id + "</id></record>";
    }
}