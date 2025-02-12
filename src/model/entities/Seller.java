package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    private Integer id;
    private String nome;
    private String email;
    private Date birthDate;
    private Double baseSalary;

    private Department department;

    public Seller() {
    }

    public Seller(Integer id, String nome, String email, Date birthDate, Double baseSalary, Department department) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Analisa se o objeto recebido é o mesmo que o atual
        if (o == null || getClass() != o.getClass()) return false; // Verificar se o objeto passado não é nulo, e se o que foi passado e o atual são da mesma classe
        Seller seller = (Seller) o; // Casting do objeto para o tipo Seller
        return Objects.equals(id, seller.id); // verificando o id atual com o id do obj que foi passado
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id); // Criando uma hashcode do id
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }
}
