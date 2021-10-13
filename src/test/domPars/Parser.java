package test.domPars;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import test.park.Bush;
import test.park.Flower;
import test.park.Plant;
import test.park.Tree;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.ArrayList;

public class Parser {

    private static ArrayList<Plant> plants = new ArrayList<>();

    private static final String TAG_FLOWER ="flower";
    private static final String TAG_TREE = "tree";
    private static final String TAG_BUSH = "bush";

    public void domParser() throws Exception {

        Document doc;

        try {
            doc = buildDocument();
        } catch (ParserConfigurationException e) {
            System.out.println("parser err " + e.toString());
            return ;
        }

        collectInformation(doc, TAG_FLOWER);
        collectInformation(doc, TAG_TREE);
        collectInformation(doc, TAG_BUSH);


        plants.forEach(System.out::println);


    }


    private Document buildDocument() throws Exception {
        File file = new File("park.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);
    }


    private void collectInformation(Document document, final String element){

        NodeList elements = document.getElementsByTagName(element);

        for(int i = 0; i<elements.getLength();i++){
            NamedNodeMap attributes = elements.item(i).getAttributes();
            String name = attributes.getNamedItem("name").getNodeValue();

            switch (element){

                case TAG_FLOWER:{
                    String numberOfPlantingFlowers = attributes.getNamedItem("numberOfPlanting").getNodeValue();

                    plants.add(new Flower(name, numberOfPlantingFlowers));
                } break;


                case TAG_TREE:{
                    String numberOfPlantingTrees = attributes.getNamedItem("numberOfPlanting").getNodeValue();

                    plants.add(new Tree(name, numberOfPlantingTrees));
                } break;

                case TAG_BUSH:{
                    String numberOfPlantingBushes = attributes.getNamedItem("numberOfPlanting").getNodeValue();

                    plants.add(new Bush(name, numberOfPlantingBushes));
                }break;
            }

        }
    }


}
