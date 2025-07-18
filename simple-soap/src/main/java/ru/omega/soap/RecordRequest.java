package ru.omega.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetRecordsInfo", namespace = "http://imc.parus-s.ru")
public class RecordRequest {

    @XmlElement(name = "Codes", namespace = "http://imc.parus-s.ru")
    private String codes;

    @XmlElement(name = "Separator", namespace = "http://imc.parus-s.ru")
    private String separator;

    @XmlElement(name = "Type", namespace = "http://imc.parus-s.ru")
    private String type;

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}