package model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Contato")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contato {

    @XmlElement(name = "id", required = true)
    private int id;

    @XmlElement(name = "nome", required = true)
    private String nome;

    @XmlElement(name = "email", required = true)
    private String email;

    @XmlElementWrapper(name = "Telefones")
    @XmlElement(name = "Telefone")
    private List<Telefone> telefones;

    @XmlElement(name = "Endereco", required = true)
    private Endereco endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", telefones=" + telefones +
                '}';
    }
}
