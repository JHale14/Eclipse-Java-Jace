import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

/*
* Class: CMSC201
* Instructor:
* Description: plot sine and cosine functions
* Due: 4/26/2026
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Jason Hale
*/

public class Project4_Part2 extends Application{

	public void start(Stage primaryStage) {
		Polyline polyline1 = new Polyline();
		polyline1.setStroke(new Color(1.0,0.0,0.0,0.5));
		ObservableList<Double> list = polyline1.getPoints();
		double scaleFactor = 50.0;
		for (int x = -170; x <= 170; x++) {
		list.add(x + 200.0);
		list.add(100.0 - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI));
		}
		Polyline polyline2 = new Polyline();
		polyline2.setStroke(new Color(0.0,0.0,1.0,0.5));
		ObservableList<Double> list2 = polyline2.getPoints();
		for (int x = -170; x <= 170; x++) {
		list2.add(x + 200.0);
		list2.add(100.0 - scaleFactor * Math.cos((x / 100.0) * 2 * Math.PI));
		}
		Line line1 = new Line(200,180,200,20);
		Line line2 = new Line(20,100,380,100);
		Text text1 = new Text(200,110,"0");
		Text text2 = new Text(250,110,"\u03c0");
		Text text3 = new Text(300,110,"2\u03c0");
		Text text4 = new Text(150,110,"-\u03c0");
		Text text5 = new Text(100,110,"-2\u03c0");
		Text text6 = new Text(360,90,"X");
		Text text7 = new Text(210,40,"Y");
		Pane pane = new Pane();
		pane.getChildren().addAll(polyline1,polyline2,line1,line2,text1,text2,text3,text4,text5,text6,text7);
		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setTitle("ShowPolyline");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
