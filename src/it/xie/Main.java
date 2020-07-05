package it.xie;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Main {
    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {
        System.out.println( URLDecoder.decode("%E4%B8%8A%E6%B5%B7\n", "UTF-8"));

    }
} 