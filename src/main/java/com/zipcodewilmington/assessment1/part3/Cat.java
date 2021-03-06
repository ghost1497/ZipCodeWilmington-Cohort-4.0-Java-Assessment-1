package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {

    protected String name;
    protected Integer age;
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

    //getters


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public PetOwner getOwner() {
        return super.getOwner();
    }
}
