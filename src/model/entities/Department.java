package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
    
    private Integer id;
    private String name;

    public Department() {
    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Analisa se o objeto recebido é o mesmo que o atual
        if (o == null || getClass() != o.getClass()) return false; // Verificar se o objeto passado não é nulo, e se o que foi passado e o atual são da mesma classe
        Department that = (Department) o; // Casting do objeto para o tipo Department
        return Objects.equals(id, that.id); // verificando o id atual com o id do obj que foi passado
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id); // Criando uma hashcode do id
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
