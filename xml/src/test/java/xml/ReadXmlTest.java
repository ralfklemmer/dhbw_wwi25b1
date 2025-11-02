package xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ReadXmlTest {
    @Test
    void readFromFile() throws FileNotFoundException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(Student.class);
        Student ralf = (Student) context.createUnmarshaller()
                .unmarshal(new FileReader("src/test/resources/ralf.xml"));
        System.out.println(ralf);

    }

    @Test
    void writeXmlToFile() throws JAXBException, FileNotFoundException {
        Student student = new Student();
        student.setVorname("Ralf");
        student.setNachname("Klemmer");
        student.setHobbies(List.of("1", "2"));
        student.setLivingInKarlsruhe(true);

        JAXBContext context = JAXBContext.newInstance(Student.class);
        context.createMarshaller().marshal(student, new File("src/test/resources/ralf_from_java.xml"));

    }
}
