package pl.lublin.wsei.java.cwiczenia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GusInfoGraphicList {
    public GusInfoGraphicList(String gusFileName)
    {
        infografikaList = new ArrayList<>();
        String contents;
        try
        {
            contents = new String(Files.readAllBytes(Paths.get(gusFileName)));
        }
        catch(IOException e)
        {
            System.out.println("Błąd przy odczycie pliku gusInfoGraphic.xml"+e.getLocalizedMessage());
            e.printStackTrace();
            contents="";
        }
        String[] itmes = contents.split("<item>");
        for (int i = 1; i < itmes.length;i++)
        {
            infografikaList.add(new Infografika(itmes[i]));
        }
    }
    public ArrayList<Infografika> infografikaList;


}
