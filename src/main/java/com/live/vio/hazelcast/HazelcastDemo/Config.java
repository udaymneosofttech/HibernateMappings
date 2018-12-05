package com.live.vio.hazelcast.HazelcastDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class Config {


    public String  getDate(String date) throws ParseException {
        SimpleDateFormat sdfmt1 = new SimpleDateFormat("ddMMyyyy");
        SimpleDateFormat sdfmt2= new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dDate = sdfmt1.parse(date);
        String s=sdfmt2.format(dDate);

        System.out.println(s);

        return null;

    }
}
