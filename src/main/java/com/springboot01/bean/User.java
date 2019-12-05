package com.springboot01.bean;

public class User {

	private Integer id;//id
	private String name;//姓名
	private String sex;//性别
	private Integer age;//年龄
	private String intro;//个人简介
	private String picture;//头像
	
	
	
	public User() {
		super();
	}

	public User(Integer id, String name, String sex, Integer age, String intro, String picture) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.intro = intro;
		this.picture = picture;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", intro=" + intro + ", picture="
				+ picture + "]";
	}

	
	
}
