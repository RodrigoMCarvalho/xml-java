package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Telefone")
@XmlAccessorType(XmlAccessType.FIELD)
public class Telefone {
    @XmlElement(name = "id", required = true)
    private int id;

    @XmlElement(name = "ddd", required = true)
    private int ddd;

    @XmlElement(name = "numero", required = true)
    private int numero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Gerar métodos get/set

    @Override
    public String toString() {
        return "Telefone{" +
                "id=" + id +
                ", ddd=" + ddd +
                ", numero=" + numero +
                '}';
    }
}