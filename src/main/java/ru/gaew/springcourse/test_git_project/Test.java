package ru.gaew.springcourse.test_git_project;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.print();
    }

    void print(){
        System.out.println("Hello World");
        Test1 test1 = new Test1("Test1");
        test1.printName();
    }
}
