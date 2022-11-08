package com.example.justatestback;


import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "input_object")
@ToString
public class InputObject {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "input")
    private String input;

    public String getInput(){
        return input;
    }
    public void setInput(String input){
        this.input = input;
    }


}
