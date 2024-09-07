package ru.gaew.springcourse.test_git_project;

import ru.gaew.springcourse.test_git_project.conceptTest.TestConcept;
import ru.gaew.springcourse.test_git_project.test2.Test2;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.print();
    }

    void print(){
        System.out.println("Hello World");
        Test1 test1 = new Test1("Test1");
        test1.printName();
        Test2 test2 = new Test2("Test2");
        test2.printName();
        TestConcept testConcept = new TestConcept();
        testConcept.test();
    }
}
