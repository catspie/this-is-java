package org.chapter16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/tools/tomcat/apache-tomcat-9.0.71");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p-> System.out.println(p.getFileName()));

    }
}
