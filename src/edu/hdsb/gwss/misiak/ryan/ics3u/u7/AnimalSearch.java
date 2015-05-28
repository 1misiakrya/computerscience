/*
 * Name: AnimalSearch
 * Date: May 27, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program lists friends from a file.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u7;

import java.io.File;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author 1misiakrya
 */
public class AnimalSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File file = new File("animals.xml");

        Builder builder = new Builder();
        Document animalsDocument;
        Element animalsRoot;

        try {
            animalsDocument = builder.build(file);
            animalsRoot = animalsDocument.getRootElement();
            Elements animals = animalsRoot.getChildElements();
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("animalClass").getValue().equals("Aves")) {
                    System.out.println(animals.get(i).getFirstChildElement("animalName").getValue());
                }
            }
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("diet").getValue().equals("Carnivore")) {
                    System.out.println(animals.get(i).getFirstChildElement("animalName").getValue());
                }
            }
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("habitat").getValue().equals("North America")) {
                    System.out.println(animals.get(i).getFirstChildElement("animalName").getValue());
                }
            }
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("animalName").getValue().equals("Moose")) {
                    System.out.println(animals.get(i).getFirstChildElement("animalName").getValue());
                }
            }
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getFirstChildElement("animalName").getValue().equals("Toucan")) {
                    System.out.println("Toucan");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
