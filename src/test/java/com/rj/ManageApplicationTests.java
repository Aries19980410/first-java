package com.rj;

import com.rj.util.Md5;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@SpringBootTest
class ManageApplicationTests {

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Md5 md5 = new Md5();
        String str = "apple";
        try {
            String newString = md5.EncoderByMd5(str);
            System.out.println(newString);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(md5.EncoderByMd5("apple").equals("HzhwvidPbEmz4xoMZyiVfw=="));

    }

}
