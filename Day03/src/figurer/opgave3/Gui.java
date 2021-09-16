package figurer.opgave3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Figurer Opgave 3");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent()
    {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane)
    {
        Line line1 = new Line(25, 350, 375, 350);
        Rectangle rect1 = new Rectangle(50, 230,120, 120);
        Rectangle rect2 = new Rectangle(75, 255,40, 40);
        Polygon poly1 = new Polygon(25, 230, 110, 150, 195, 230);
        Circle circ1 = new Circle(280, 140,50);

        rect1.setFill(Color.RED);
        poly1.setFill(Color.GREEN);
        circ1.setFill(Color.YELLOW);
        circ1.setStroke(Color.BLACK);

        pane.getChildren().add(rect1);
        pane.getChildren().add(rect2);
        pane.getChildren().add(line1);
        pane.getChildren().add(poly1);
        pane.getChildren().add(circ1);

        /*
        Circle circle = new Circle(70, 70, 30); // Circle centrum 70,70 and
		// radius 30
		pane.getChildren().add(circle);
		circle.setFill(Color.CORNFLOWERBLUE);
		circle.setStroke(Color.BLACK);

		Line line = new Line(70, 70, 100, 70); // Line from (70,70) to (100,70)
		pane.getChildren().add(line);

		// Rectangle from (100,40) width 75 and height 25
		Rectangle rektangel = new Rectangle(100, 40, 75, 25);
		pane.getChildren().add(rektangel);
		rektangel.setFill(Color.CORAL);

		// Polygon with 3 points (100,100)(200,100)(150,150)
		Polygon polygon = new Polygon(100, 100, 200, 100, 150, 150);
		pane.getChildren().add(polygon);
		polygon.setFill(Color.PINK);

		// Ellipse with centrum (70,230) radius1 50 and radius2 100
		Ellipse ellipse = new Ellipse(70, 230, 50, 100);
		pane.getChildren().add(ellipse);
		ellipse.setFill(Color.YELLOW);
		ellipse.setStroke(Color.GREEN);
		ellipse.setStrokeWidth(5);

		// Text Datamatiker placed at 100,350
		Text text = new Text(100, 350, "Datamatiker");
		text.setFill(Color.BLUEVIOLET);
		pane.getChildren().add(text);

		// Arc with centrum (300,300) radius1 200 and radius2 60 start angel 90
		// and length 45
		Arc arc = new Arc(300, 300, 200, 60, 90, 45);
		arc.setType(ArcType.ROUND);
		// arc.setType(ArcType.OPEN);
		// arc.setType(ArcType.CHORD);

		// Arc arc = new Arc(300, 300, 200, 60, 0, 180);
		pane.getChildren().add(arc);
		arc.setFill(Color.GREEN);
        */
    }
}
