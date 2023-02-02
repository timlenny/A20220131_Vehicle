package org.example;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class Vehicle implements Accelerateable {


    private String id;
    private String name;
    private int velocity;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getVelocity() {
        return velocity;
    }

    public int setVelocity(int velocity) {
        this.velocity = velocity;
        return this.velocity;
    }

    public void Break(){
        setVelocity(0);
    }


}
