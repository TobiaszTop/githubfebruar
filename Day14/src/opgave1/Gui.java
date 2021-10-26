package opgave1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

	@Override
	public void start(Stage stage) {
		stage.setTitle("Gui Demo 1");
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

	// -------------------------------------------------------------------------

	private void initContent(GridPane pane) {
		// show or hide grid lines
		pane.setGridLinesVisible(false);

		// set padding of the pane
		pane.setPadding(new Insets(20));
		// set horizontal gap between components 
		pane.setHgap(10);
		// set vertical gap between components 
		pane.setVgap(10);


		// add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
		TextField txfName = new TextField();
		pane.add(txfName, 0, 0, 2, 1);
		TextField txfSurname = new TextField();
		pane.add(txfSurname, 2, 0, 5, 1);
		TextField txfFullname = new TextField();
		pane.add(txfFullname, 0, 1, 7, 2);

		// add a button to the pane (at col=1, row=1)
		Button btnUpperCase = new Button("Combine");
		pane.add(btnUpperCase, 2, 3);
		GridPane.setMargin(btnUpperCase, new Insets(10, 10, 0, 10));

		// connect a method to the button
		//btnUpperCase.setOnAction(event -> this.combineAction());
		}
		// -------------------------------------------------------------------------

		/*private void combineAction() {
			String name = txfFullname.getText().trim();
			txfFullname.setText(name.toUpperCase());
		}*/

}
