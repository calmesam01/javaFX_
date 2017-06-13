package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		Scene scene = new Scene(grid,350,300);
		
		Text sceneTitle = new Text("Please Login : ");
		sceneTitle.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 20));
		Label usrnme = new Label("Email id : ");
		TextField usrnme_ = new TextField();
		Label pwd = new Label("Password : ");
		PasswordField pwd_ = new PasswordField();
		
		grid.add(sceneTitle, 0, 0, 2, 1);
		grid.add(usrnme, 0, 1);
		grid.add(usrnme_, 1, 1);
		grid.add(pwd, 0, 2);
		grid.add(pwd_, 1, 2);
		//grid.setGridLinesVisible(true);
		
		Button btn = new Button("Login");
		HBox hbtn = new HBox();
		hbtn.setAlignment(Pos. BOTTOM_RIGHT );
		hbtn.getChildren().add(btn);
		
		grid.add(hbtn,1,4);
		
		final Text actionTarget = new Text();
		grid.add(actionTarget, 1, 6);
		
		btn.setOnAction(event -> {
			actionTarget.setText("Logging in...");
			actionTarget.setFill(Color.WHITESMOKE);
		});
		
		scene.getStylesheets().add("application/application.css");
		
		primaryStage.setTitle("javaFX-loginForm");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
