// package ru.omega.rest;

// import javax.jws.WebService;

// @WebService(endpointInterface = "ru.omega.soap.RecordService",
//             targetNamespace = "http://imc.parus-s.ru",
//             serviceName = "RecordService")
// public class RecordServiceImpl implements RecordService {

//     @Override
//     public RecordResponse getRecordsInfo(RecordRequest request) {
//         RecordResponse response = new RecordResponse();
//         response.setXml("<record><receivedId>" + request.getCodes() + "</receivedId></record>");
//         return response;
//     }
// }
