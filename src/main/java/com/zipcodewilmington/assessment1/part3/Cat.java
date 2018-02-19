package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {

    protected String name;
    protected Integer age;
    PetOwner owner = new PetOwner(name);
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.age = age;
        this.name = "";
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.name = name;
        this.age = 0;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        this.name = "";
        this.age = 0;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        Animal cat = new Animal() {
            @Override
            public String speak() {
                return "Meow";
            }
        };
        return cat.speak();
    }

    public String getName(){
        return this.name;
    }
    public Integer getAge(){
        return this.age;
    }
    public void setOwner(PetOwner owner){
        this.owner = owner;
    }

    @Override
    public PetOwner getOwner() {
        return owner;
    }
}
