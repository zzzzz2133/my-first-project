package com.example.demo2.pojo;
import jakarta.persistence.*;

@Table(name="tb_worker")
@Entity

public class Worker {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)//主键自增
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private Integer age;


}
