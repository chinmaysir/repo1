package com.log;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Insurance {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    @Column
	private String clientnumber;
    @Column
	private String clienttype;
    @Column
	private String dob;
    @Column
	private String mobile;
    @Column
	private String address;
    @Column
	private String state;
    @Column
	private String int_amt;
    @Column
	private String name;
    @Column
	private String password;
    @Column
	private String Age;
    @Column
	private String email;
    @Column
	private String city;
    @Column
	private String nation;
    @Column
	private String no_of_pay;
    @Column
	private String dat_creat;
	
	public Insurance(){
		super();
	}

	public Insurance( String clientnumber, String clienttype, String dob, String mobile, String address,
			String state, String int_amt, String name, String password, String age, String email, String city,
			String nation, String no_of_pay, String dat_creat) {
		super();
		
		this.clientnumber = clientnumber;
		this.clienttype = clienttype;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
		this.state = state;
		this.int_amt = int_amt;
		this.name = name;
		this.password = password;
		this.Age = age;
		this.email = email;
		this.city = city;
		this.nation = nation;
		this.no_of_pay = no_of_pay;
		this.dat_creat = dat_creat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientnumber() {
		return clientnumber;
	}

	public void setClientnumber(String clientnumber) {
		this.clientnumber = clientnumber;
	}

	public String getClienttype() {
		return clienttype;
	}

	public void setClienttype(String clienttype) {
		this.clienttype = clienttype;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInt_amt() {
		return int_amt;
	}

	public void setInt_amt(String int_amt) {
		this.int_amt = int_amt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getNo_of_pay() {
		return no_of_pay;
	}

	public void setNo_of_pay(String no_of_pay) {
		this.no_of_pay = no_of_pay;
	}

	public String getDat_creat() {
		return dat_creat;
	}

	public void setDat_creat(String dat_creat) {
		this.dat_creat = dat_creat;
	}
	
	
	
	
}