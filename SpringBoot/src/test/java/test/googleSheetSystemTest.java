package test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import web_run.hellospring.google_API.join;

import java.io.IOException;
import java.security.GeneralSecurityException;



public class googleSheetSystemTest {
    @Test
    @DisplayName("googleSheet_api_검증")
    void sheetTest() throws GeneralSecurityException, IOException {
        String[] st;

        join Join=new join();
        st=Join.main();

        for(String a:st)
        {
            System.out.println(a);
        }
        // Join.main의 반환값은 String[]이다.
    }

}
