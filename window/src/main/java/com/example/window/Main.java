import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Main {
}
/*1. Создать окно для клиентской части чата: большое текстовое поле для отображения переписки
в центре окна. Однострочное текстовое поле для ввода сообщений и кнопка для отсылки
сообщений на нижней панели. Сообщение должно отсылаться либо по нажатию кнопки на
форме, либо по нажатию кнопки Enter. При «отсылке» сообщение перекидывается из нижнего
поля в центральное.
Пример на рисунке ниже*/package com.example.window;

        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Scene;
        import javafx.stage.Stage;

        import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.window.HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Онлайн чат GB ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
package com.example.window;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

    public class HelloController {

        @FXML
        public TextField messegeField;

        @FXML
        public Button setMessegeBoton;

        @FXML
        public TextArea messegeTextArea;

        public void sendingText(ActionEvent actionEvent) {
            if (!messegeField.getText().isEmpty()) {
                messegeTextArea.appendText(messegeField.getText());
                messegeTextArea.appendText(System.lineSeparator());
                messegeField.clear();
            }
        }
    }<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.geometry.*?>
<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>

<BorderPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/16" xmlns:fx="http://javafx.com/fxml/1" fx:controller="com.example.window.HelloController">
   <bottom>
      <HBox prefHeight="6.0" prefWidth="600.0" BorderPane.alignment="CENTER">
         <children>
            <TextField fx:id="messegeField" onAction="#sendingText" prefHeight="25.0" prefWidth="499.0" />
            <Button fx:id="setMessegeBoton" maxHeight="-Infinity" maxWidth="-Infinity" mnemonicParsing="false" onAction="#sendingText" text="Отправить">
               <HBox.margin>
                  <Insets left="20.0" right="5.0" />
               </HBox.margin>
            </Button>
         </children>
      </HBox>
   </bottom>
   <center>
      <SplitPane dividerPositions="0.9919571045576407" orientation="VERTICAL" prefHeight="200.0" prefWidth="160.0" BorderPane.alignment="CENTER">
        <items>
          <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="100.0" prefWidth="160.0">
               <children>
                  <TextArea fx:id="messegeTextArea" prefHeight="200.0" prefWidth="200.0" style="-fx-border-width: 4px;" AnchorPane.bottomAnchor="0.0" AnchorPane.leftAnchor="0.0" AnchorPane.rightAnchor="0.0" AnchorPane.topAnchor="0.0" />
               </children>
            </AnchorPane>
          <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="100.0" prefWidth="160.0" />
        </items>
      </SplitPane>
   </center>
</BorderPane>
