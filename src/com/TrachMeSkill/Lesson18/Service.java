package src.com.TrachMeSkill.Lesson18;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static src.com.TrachMeSkill.Lesson18.Main.*;

public class Service {
    public static Document buildDocument() throws Exception {
        File file = new File("Documents.xml");
        DocumentBuilderFactory dbf =
                DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);
    }

    public static <Node_peopleNode> List<People> parsPeople(Node_peopleNode) {
        List<People> peopleList = new ArrayList<>();
        Node peopleNode = null;
        NodeList peopleChilds = peopleNode.getChildNodes();
        for (int i = 0; i < peopleChilds.getLength(); i++) {
            if (peopleChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            if (!peopleChilds.item(i).getNodeName().equals(TAG_ELEMENT)) {
                continue;
            }
            String name = "";
            int age = 0;
            NodeList elementChilds = peopleChilds.item(i).getChildNodes();
            for (int j = 0; j < elementChilds.getLength(); j++) {
                if (elementChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                    switch (elementChilds.item(j).getNodeName()) {
                        case TAG_NAME: {
                            name = elementChilds.item(j).getTextContent();
                            break;
                        }
                        case TAG_AGE: {
                            age = Integer.parseInt(elementChilds.item(j).getTextContent());
                            break;
                        }
                    }
                }
                People people = new People(name, age);
                peopleList.add(people);
            }
        }
        return peopleList;
    }
}
