package tests.d11_file_upload_actions;

import org.testng.annotations.Test;

public class FileExamples {

    @Test
    public void test(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));

        String projectPath=System.getProperty("user.dir");
        String relativePath="/src/test/resources/test_file.txt";

        String fullPath=projectPath+relativePath;
        System.out.println(fullPath);

    }
}
