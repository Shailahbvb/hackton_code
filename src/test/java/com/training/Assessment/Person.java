package com.training.Assessment;

class Person implements Comparable<Person> {
    int height;
    int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        if(this.height>p.height) {
            return 1;
        } else if(this.height < p.height) {
            return -1;
        } else {
            return 0;
        }
    }
}
