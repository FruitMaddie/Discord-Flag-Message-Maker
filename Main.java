package flagMaker;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class Main extends Application {

	@Override
	public void start (Stage primaryStage) throws Exception {
		HBox root = new HBox();
		Insets mainBorder = new Insets(30, 30, 30, 30);

		convertedString[] output = {new convertedString()};

		// Right side is the output
		VBox outputPane = new VBox();
		TextArea outputArea = new TextArea();
		outputArea.setEditable(false);
		outputArea.setWrapText(true);

		Button toClipboard = new Button("Copy to Clipboard");

		toClipboard.setOnAction((event) -> {
			ClipboardContent content = new ClipboardContent();
			content.putString(outputArea.getText());
			Clipboard.getSystemClipboard().setContent(content);
		});

		Label data = new Label("The output is 0 emote(s) long\n" + "0 emote(s) have been compressed into flags.\n" +
							   "The output is 0% smaller.");

		outputPane.getChildren().addAll(outputArea, toClipboard, data);
		outputPane.setAlignment(Pos.TOP_CENTER);

		// Left side is the input half
		VBox inputPane = new VBox();
		TextField input = new TextField();
		input.setMinHeight(50);
		Button convertTo = new Button("Convert to Flags!");
		convertTo.setDefaultButton(true);
		CheckBox spoiler = new CheckBox("Add spoiler text");

		convertTo.setOnAction((event) -> {
			output[0] = converter.convert(input.getText());
			outputArea.setText(output[0].toString());
			data.setText("The output is " + output[0].getOutputLength() + " emote(s) long\n" + output[0].getFlags() +
						 " emotes(s) have been compressed into flags.\nThe output is " +
						 new DecimalFormat("0.0%").format(1 - output[0].getCompressRatio()) + " smaller.");
			if (spoiler.isSelected()) {
				outputArea.appendText("\n\n||" + input.getText() + "||");
			}
		});

		Button clear = new Button("Clear Fields!");
		clear.setCancelButton(true);
		clear.setOnAction((event) -> {
			input.clear();
			outputArea.clear();
			data.setText("The output is 0 emote(s) long\n" + "0 emote(s) have been compressed into flags.\n" +
						 "The output is 0% smaller.");
		});

		inputPane.getChildren().addAll(input, convertTo, clear, spoiler);
		inputPane.setAlignment(Pos.CENTER);
		inputPane.setSpacing(20);

		outputPane.setSpacing(20);

		root.getChildren().addAll(inputPane, outputPane);
		root.setPadding(mainBorder);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(60);
		outputPane.setPrefSize(400, 450);

		primaryStage.setTitle("Make a phucking flag!");
		primaryStage.setScene(new Scene(root, 800, 500));
		primaryStage.show();
	}


	public static void main (String[] args) {
		launch(args);
	}
}
