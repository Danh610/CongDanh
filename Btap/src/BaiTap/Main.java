package BaiTap;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        EditorModel model = new EditorModel();
        EditorView view = new EditorView();
        EditorController controller = new EditorController(model, view);

      
        try {
            File inputFile = new File("C:\\JavaProject\\Btap\\src\\Input.txt");
            controller.loadFromFile(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
     
        controller.displayLines();
      
        try {
            File outputFile = new File("C:\\JavaProject\\Btap\\src\\Output.txt");
            controller.saveToFile(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}