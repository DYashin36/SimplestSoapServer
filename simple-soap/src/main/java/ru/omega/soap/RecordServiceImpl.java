package ru.omega.soap;

import javax.jws.WebService;

@WebService(endpointInterface = "ru.omega.soap.RecordService")
public class RecordServiceImpl implements RecordService {

    @Override
    public String getRecordByCode(String code) {
        return "<record><code>" + code + "</code></record>";
    }

    @Override
    public String getRecordByName(String name, String title) {
        return "<record><name>" + name + "</name><title>" + title + "</title></record>";
    }

    @Override
    public String getRecordById(String id) {
        return "<record><id>" + id + "</id></record>";
    }
}