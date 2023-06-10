package com.example.validate_subsequence;

import com.example.validate_subsequence.logic.Subsequence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ValidateSubsequenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidateSubsequenceApplication.class, args);

        System.out.println("Execution");
        Subsequence subsequence = new Subsequence();
        subsequence.isSubSequence();

    }

}
