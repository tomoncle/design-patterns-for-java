package com.tomoncle.designpattern.builder.simple;

import lombok.Data;

/**
 * @author tomoncle
 */
@Data
public class Car {
    private String name;
    private String version;

    public static class Builder{
        private Car car= new Car();

        public Builder setName(String name) {
            this.car.name = name;
            return this;
        }

        public Builder setVersion(String version) {
            this.car.version = version;
            return this;
        }

        public Car build(){
            return car;
        }
    }


}

class TestMain{
    public static void main(String[] args) {
        Car.Builder builder=new Car.Builder();
        builder.setName("honda");
        builder.setVersion("2023");
        Car car = builder.build();
        System.out.println(car);
    }
}
