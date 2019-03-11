package errai.openxava;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity
public class Contact extends Identifiable {
	
	
	@Column(length=40) @Required
	private String name;
	
	@Column(length=40) @Required
	private int phone;
	
	@Column(length=40) @Required
	private String email;
	
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = emailValidation(email);
	}
	public String emailValidation(String email) {
        if (email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")) {
            return email;
        } else {
            return "E-mail inválido";
        }
    }	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
