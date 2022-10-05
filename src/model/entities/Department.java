package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	
	public Department() {
		
	}

	public Department(Integer id, String name) {
		///super();
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
	// hashCode and equals para os objetos sejam comparados pelo conteúdo,e não pela referência de ponteiros.

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	// implements Serializable para os objetos serem transformados em sequência de bit, é preciso fazer para os 
	// os objetos serem guardados em arquivos e trafegar em rede etc.
	
}
