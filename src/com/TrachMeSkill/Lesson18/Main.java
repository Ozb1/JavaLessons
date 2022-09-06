package src.com.TrachMeSkill.Lesson18;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private static final  String TAG_NAME_MAIN = "name";
    public static final  String TAG_PEOPLE = "people";
    public static final String TAG_ELEMENT = "element";
    public static final String TAG_NAME = "name";
    public static final String TAG_AGE = "age";
    public static void main(String[] args) {
        Root root = new Root();
        Service service = new Service();
        Document doc;
        try{
            doc = Service.buildDocument();
        }catch (Exception e)
        {
            System.out.println("Open parse error" + e.toString());
            return;
        }

        Node rootNode = doc.getFirstChild();
        NodeList rootChilds = rootNode.getChildNodes();
        String mainName = null;
        Node peopleNode = null;
        for (int i = 0; i < rootChilds.getLength(); i++) {
            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (rootChilds.item(i).getNodeName()) {
                case TAG_NAME_MAIN: {
                    mainName = rootChilds.item(i).getTextContent();
                    break;
                }
                case TAG_PEOPLE: {
                    peopleNode = rootChilds.item(i);
                    break;
                }
            }
        }
        root.setName(mainName);
        if (peopleNode == null) {
            return;
        }
    }
}
