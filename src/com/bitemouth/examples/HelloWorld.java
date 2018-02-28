package com.bitemouth.examples;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * Created by gbs04694 on 2/28/2018.
 */
public class HelloWorld {
    //TOPICS INTERESTED TO COVER
    //OPTIONAL
    //STREAMS
    //LAMBDA
    //TYPE INFERENCES
    //FUNCTIONAL PROGRAMMING VS IMPERATIVE PROGRAMMING
    //COMPLETABLE FUTURES
    //JAVA 9 STACKWALKER



    public static void main(String[] args) {


    //OPTIONAL
    //Similar to Optional in Guava libraries from Google.
        //Refer https://www.tutorialspoint.com/java8/java8_optional_class.htm

    Integer int1 = 10;
    Optional<Integer> optOb = Optional.ofNullable(int1);
    Integer test = (Integer)optOb.orElse(new Integer(0));
    System.out.println("value is " + test);
    Consumer<Integer> consumer = integer -> {};
    optOb.ifPresent(consumer);
    }

}
