package ru.omega.soap;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetRecordsInfoResponse", namespace = "http://imc.parus-s.ru")
public class RecordResponse {

    @XmlElement(name = "return", namespace = "http://imc.parus-s.ru")
    private String xml;

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }
}