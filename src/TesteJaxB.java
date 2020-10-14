import model.Contato;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class TesteJaxB {

    public static void main(String[] args) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Contato.class);

        xmlParaObjeto(jaxbContext);
    }

    private static void xmlParaObjeto(JAXBContext jaxbContext) throws Exception {
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Contato contato = (Contato) unmarshaller.unmarshal(new File("src/files/contato.xml"));
        System.out.println(contato);
    }


}
