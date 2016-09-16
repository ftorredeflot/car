package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* System.out.println("hola mundo");*/
        coche jaguar= new coche("jaguar","xf","4423ghd",100,50000.0);
        coche ford= new coche("ford","mustang","4843ghd",500,25000.0);
        coche kia= new coche("kia","rio","4455jrn",84,13000.0);

        List<coche> carlist = new ArrayList<>();

        carlist.add(jaguar);
        carlist.add(ford);
        carlist.add(kia);

        System.out.println("muestro coche :"+carlist.get(0).getMarca()+", "+carlist.get(0).getModelo());
        System.out.println("muestro coche :"+carlist.get(1));
        System.out.println("muestro coche :"+carlist.get(2));

        Map<String, coche> carmap=new HashMap<>();

        carmap.put("4423ghd", jaguar);
        carmap.put("4843ghd", ford);
        carmap.put("4455jrn", kia);
        System.out.println("hashmap" +carmap.get("4455jrn"));
        System.out.println("muesto las keys"+carmap.keySet());

        System.out.println("muesto los values"+carmap.values());
    }
}
