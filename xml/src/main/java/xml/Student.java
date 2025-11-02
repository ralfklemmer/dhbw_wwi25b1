package xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "student")
public class Student {
    @XmlElement(name = "vorname")
    private String vorname;
    @XmlElement(name = "nachname")
    private String nachname;
    @XmlElementWrapper(name = "hobbies")
    @XmlElement(name = "hobby")
    private List<String> hobbies;
    @XmlElement(name = "isLivingInKarlsruhe")
    private boolean isLivingInKarlsruhe;

    public Student() {
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setLivingInKarlsruhe(boolean livingInKarlsruhe) {
        isLivingInKarlsruhe = livingInKarlsruhe;
    }

    @Override
    public String toString() {
        return "Student{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", hobbies=" + hobbies +
                ", isLivingInKarlsruhe=" + isLivingInKarlsruhe +
                '}';
    }
}
