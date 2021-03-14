package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Struct;
import java.util.Scanner;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        Movie movie = null;

        while(true) {
            movie = MovieFactory.getMovie(string);
            if (movie == null)
                break;

            System.out.println(movie.getClass().getSimpleName());

            string = scanner.nextLine();

        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key))
                movie = new SoapOpera();
            if ("cartoon".equals(key))
                movie = new Cartoon();
            if ("thriller".equals(key))
                movie = new Thriller();

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }

}
