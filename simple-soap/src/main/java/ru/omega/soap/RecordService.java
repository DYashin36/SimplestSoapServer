package ru.omega;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface RecordService {
    @WebMethod
    String getRecordById(String id);
}