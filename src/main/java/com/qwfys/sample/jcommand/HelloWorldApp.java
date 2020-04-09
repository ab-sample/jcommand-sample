package com.qwfys.sample.jcommand;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

/**
 * Hello world!
 */
public class HelloWorldApp {
    @Parameter(names = {"--length", "-l"})
    int length;

    @Parameter(names = {"--pattern", "-p"})
    int pattern;

    public static void main(String... argv) {
        HelloWorldApp main = new HelloWorldApp();
        JCommander.newBuilder().addObject(main).build().parse(argv);
        main.run();
    }

    public void run() {
        System.out.printf("%d %d", length, pattern);
    }
}
