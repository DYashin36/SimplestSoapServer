package ru.omega.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface RecordService {
    @WebMethod
    String getRecordByCode(String code);

    @WebMethod
    String getRecordByName(String name, String title);

    @WebMethod
    String getRecordById(String id);
}