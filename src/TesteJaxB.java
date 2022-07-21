import model.Contato;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

public class TesteJaxB {

    public static void main(String[] args) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Contato.class);

        xmlParaObjeto(jaxbContext);
    }

    /**
     * Realiza a leitura de um arquivo .xml e converte para um objeto
     */
    private static void xmlParaObjeto(JAXBContext jaxbContext) throws Exception {
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Contato contato = (Contato) unmarshaller.unmarshal(new File("src/files/contato.xml"));
        System.out.println(contato);

        objetoToXml(contato);
    }

    /**
     * Converte um objeto em uma string xml
     */
    private static void objetoToXml(Contato contato)  {
        StringWriter sw = new StringWriter();
        JAXB.marshal(contato, sw);
        String xmlString = sw.toString();
        System.out.println(xmlString);

        stringXmlParaObjeto(xmlString);
    }

    /**
     * Converte uma string xml em um objeto
     */
    private static void stringXmlParaObjeto(String xmlString)  {
        Contato contato = JAXB.unmarshal(new StringReader(xmlString), Contato.class);
        System.out.println(contato);
    }


}
