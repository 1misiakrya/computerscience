/*
 * Name: ALStandings
 * Date: June 5, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program takes the information about American League teams from a 
file, sorts them into their divisions, then writes the eastern division teams to a new
file.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.Serializer;

/**
 *
 * @author 1misiakrya
 */
public class ALStandings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File file = new File("AL.STANDINGS.xml");

        Builder builder = new Builder();
        Document standingsDocument;
        Element standingsRoot;

        Element americanLeagueEastTeams = new Element("americanLeagueEastTeams");
        Document americanLeagueEastTeamsDoc = new Document(americanLeagueEastTeams);

        try {
            standingsDocument = builder.build(file);
            standingsRoot = standingsDocument.getRootElement();
            Elements standings = standingsRoot.getChildElements();
            System.out.println("American League East");
            System.out.println("--------------------");
            System.out.println("Team            Record");
            for (int i = 0; i < standings.size(); i++) {
                if (standings.get(i).getFirstChildElement("division").getValue().equals("East")) {
                    System.out.format("%-10s %10s", (standings.get(i).getFirstChildElement("name").getValue()), (standings.get(i).getFirstChildElement("record").getValue()));
                    System.out.println("");

                    Element team = new Element("team");
                    Element name = new Element("name");
                    Element division = new Element("division");
                    Element record = new Element("record");
                    name.appendChild(standings.get(i).getFirstChildElement("name").getValue());
                    division.appendChild(standings.get(i).getFirstChildElement("division").getValue());
                    record.appendChild(standings.get(i).getFirstChildElement("record").getValue());

                    team.appendChild(name);
                    team.appendChild(division);
                    team.appendChild(record);
                    americanLeagueEastTeams.appendChild(team);
                }
            }
            System.out.println("\nAmerican League Central");
            System.out.println("-----------------------");
            System.out.println("Team            Record");
            for (int i = 0; i < standings.size(); i++) {
                if (standings.get(i).getFirstChildElement("division").getValue().equals("Central")) {
                    System.out.format("%-10s %10s", (standings.get(i).getFirstChildElement("name").getValue()), (standings.get(i).getFirstChildElement("record").getValue()));
                    System.out.println("");
                }
            }
            System.out.println("\nAmerican League West");
            System.out.println("-----------------------");
            System.out.println("Team            Record");
            for (int i = 0; i < standings.size(); i++) {
                if (standings.get(i).getFirstChildElement("division").getValue().equals("West")) {
                    System.out.format("%-10s %10s", (standings.get(i).getFirstChildElement("name").getValue()), (standings.get(i).getFirstChildElement("record").getValue()));
                    System.out.println("");
                }
            }
            System.out.println("");
            try {
                Serializer a = new Serializer(System.out);
                a.setIndent(4);
                a.setMaxLength(64);
                a.write(americanLeagueEastTeamsDoc);
            } catch (IOException ex) {
                System.err.println(ex);
            }

            try {
                FileWriter output = new FileWriter("AL.EAST.STANDINGS.xml");
                BufferedWriter writer = new BufferedWriter(output);
                writer.write(americanLeagueEastTeams.toXML());
                writer.close();
            } catch (IOException ex) {
                System.err.println(ex);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
