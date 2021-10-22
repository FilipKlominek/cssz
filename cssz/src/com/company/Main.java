package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("cssz.csv"));
        Education y2006 = new Education(2006);
        Education y2007 = new Education(2007);
        Education y2008 = new Education(2008);
        Education y2009 = new Education(2009);
        Education y2010 = new Education(2010);
        Education y2011 = new Education(2011);
        Education y2012 = new Education(2012);
        Education y2013 = new Education(2013);
        Education y2014 = new Education(2014);
        Education y2015 = new Education(2015);
        Education y2016 = new Education(2016);
        Education y2017 = new Education(2017);
        Education y2018 = new Education(2018);
        Education y2019 = new Education(2019);
        Education y2020 = new Education(2020);
        while (true) {
            String current = br.readLine();
            if (current == null) break;
            String[] split = current.split(",");
            switch (split[0]) {
                case "2006":
                    if (split[1].equals("VOV")) y2006.setVov(y2006.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2006.setVs(y2006.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2006.setZak(y2006.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2006.setSo(y2006.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2006.setUso(y2006.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2007":
                    if (split[1].equals("VOV")) y2007.setVov(y2007.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2007.setVs(y2007.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2007.setZak(y2007.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2007.setSo(y2007.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2007.setUso(y2007.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2008":
                    if (split[1].equals("VOV")) y2008.setVov(y2008.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2008.setVs(y2008.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2008.setZak(y2008.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2008.setSo(y2008.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2008.setUso(y2008.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2009":
                    if (split[1].equals("VOV")) y2009.setVov(y2009.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2009.setVs(y2009.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2009.setZak(y2009.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2009.setSo(y2009.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2009.setUso(y2009.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2010":
                    if (split[1].equals("VOV")) y2010.setVov(y2010.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2010.setVs(y2010.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2010.setZak(y2010.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2010.setSo(y2010.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2010.setUso(y2010.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2011":
                    if (split[1].equals("VOV")) y2011.setVov(y2011.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2011.setVs(y2011.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2011.setZak(y2011.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2011.setSo(y2011.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2011.setUso(y2011.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2012":
                    if (split[1].equals("VOV")) y2012.setVov(y2012.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2012.setVs(y2012.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2012.setZak(y2012.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2012.setSo(y2012.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2012.setUso(y2012.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2013":
                    if (split[1].equals("VOV")) y2013.setVov(y2013.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2013.setVs(y2013.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2013.setZak(y2013.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2013.setSo(y2013.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2013.setUso(y2013.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2014":
                    if (split[1].equals("VOV")) y2014.setVov(y2014.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2014.setVs(y2014.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2014.setZak(y2014.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2014.setSo(y2014.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2014.setUso(y2014.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2015":
                    if (split[1].equals("VOV")) y2015.setVov(y2015.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2015.setVs(y2015.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2015.setZak(y2015.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2015.setSo(y2015.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2015.setUso(y2015.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2016":
                    if (split[1].equals("VOV")) y2016.setVov(y2016.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2016.setVs(y2016.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2016.setZak(y2016.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2016.setSo(y2016.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2016.setUso(y2016.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2017":
                    if (split[1].equals("VOV")) y2017.setVov(y2017.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2017.setVs(y2017.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2017.setZak(y2017.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2017.setSo(y2017.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2017.setUso(y2017.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2018":
                    if (split[1].equals("VOV")) y2018.setVov(y2018.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2018.setVs(y2018.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2018.setZak(y2018.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2018.setSo(y2018.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2018.setUso(y2018.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2019":
                    if (split[1].equals("VOV")) y2019.setVov(y2019.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2019.setVs(y2019.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2019.setZak(y2019.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2019.setSo(y2019.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2019.setUso(y2019.getUso() + Integer.parseInt(split[3]));
                    break;
                case "2020":
                    if (split[1].equals("VOV")) y2020.setVov(y2020.getVov() + Integer.parseInt(split[3]));
                    else if (split[1].equals("VS")) y2020.setVs(y2020.getVs() + Integer.parseInt(split[3]));
                    else if (split[1].equals("ZAK")) y2020.setZak(y2020.getZak() + Integer.parseInt(split[3]));
                    else if (split[1].equals("SO")) y2020.setSo(y2020.getSo() + Integer.parseInt(split[3]));
                    else if (split[1].equals("USO")) y2020.setUso(y2020.getUso() + Integer.parseInt(split[3]));
                    break;
            }
        }
        System.out.println(y2006.getRatio("SO"));
        System.out.println(y2007.getRatio("USO"));
        System.out.println(y2020.getRatio("VOV"));
    }
}
