package test;

import test.domPars.Parser;

public class Main {
    public static void main(String[] args) {

        Parser parser = new Parser();

        try {
            parser.domParser();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
