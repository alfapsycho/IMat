package component;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import java.io.IOException;


public class GridView extends AnchorPane{

    @FXML GridPane gridpane;

    public GridView() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../resources/view/grid_view.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        gridpane.add(new Product_item(), 0, 0);

        for (int i = 0; i<4 ; i++) {
       }
    }
}





