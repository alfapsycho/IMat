package component;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import java.io.IOException;


public class GridView extends AnchorPane{

    @FXML GridPane gridPane;

    public GridView() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../resources/view/grid_view.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        fillGridPane();
    }

    public void fillGridPane() {
        int width = 4;
        int lenght = 100;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < lenght; j++) {
                gridPane.add(new Product_item().getProduct(), i, j);
            }
        }
    }


}









