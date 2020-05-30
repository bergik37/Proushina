package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.awt.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import static java.lang.Double.parseDouble;


public class Controller extends View implements Initializable {

    @FXML
    private TextField myTextField4;
    @FXML
    private TextField myTextField1;
    @FXML
    private TextField myTextField2;
    @FXML
    private TextField myTextField3;
    @FXML
    private TextField myTextField5;
    @FXML
    private TextField myTextField6;
    @FXML
    private TextField myTextField7;
    @FXML
    private TextField myTextField8;
    @FXML
    private TextField myTextField9;
    @FXML
    private TextField myTextField10;
    @FXML
    private TextField myTextField11;
    @FXML
    private TextField myTextField20;
    @FXML
    private TextField myTextField21;
    @FXML
    private TextField myTextField22;
    @FXML
    private TextField myTextField23;
    @FXML
    private TextField myTextField24;
    @FXML
    private TextField myTextField25;
    @FXML
    private TextField myTextField26;
    @FXML
    private TextField myTextField27;
    @FXML
    private TextField myTextField28;

    @FXML
    private CheckBox checkbox1;
    @FXML
    private CheckBox checkbox2;
    @FXML
    private CheckBox checkbox3;
    @FXML
    private CheckBox checkbox4;
    @FXML
    private CheckBox checkbox5;
    @FXML
    private CheckBox checkbox6;
    @FXML
    private CheckBox checkbox7;
    @FXML
    private CheckBox checkbox8;
    @FXML
    private CheckBox checkbox9;
    @FXML
    private CheckBox checkbox10;
    @FXML
    private CheckBox checkbox11;


    private Model model = new Model();

   @Override
    public void initialize(URL location, ResourceBundle resources) {

       myTextField1.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField2.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField3.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField4.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField6.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField7.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField8.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField9.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField10.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField11.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField20.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField21.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField22.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField23.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField24.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField25.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField26.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField27.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField28.setTextFormatter(new AlphaNumericTextFormatter());
   }
/*
Кнопка решения
 */
    @FXML
    public void solve() throws Exception {
        this.go();
    }
    private void go(){
        // отдаем классу модель нужные данные

        model.setNum1(parseDouble(myTextField1.getText()));
        model.setNum2(parseDouble(myTextField2.getText()));
        model.setNum3(parseDouble(myTextField3.getText()));
        model.setNum4(parseDouble(myTextField4.getText()));
        model.setNum5(parseDouble(myTextField5.getText()));
        model.setNum6(parseDouble(myTextField6.getText()));
        model.setNum7(parseDouble(myTextField7.getText()));
        model.setNum8(parseDouble(myTextField8.getText()));
        model.setNum9(parseDouble(myTextField9.getText()));
        model.setNum10(parseDouble(myTextField10.getText()));
        model.setNum11(parseDouble(myTextField11.getText()));
        model.setNum20(parseDouble(myTextField20.getText()));
        model.setNum21(parseDouble(myTextField21.getText()));
        model.setNum22(parseDouble(myTextField21.getText()));
        model.setNum23(parseDouble(myTextField21.getText()));
        model.setNum24(parseDouble(myTextField21.getText()));
        model.setNum25(parseDouble(myTextField21.getText()));
        model.setNum26(parseDouble(myTextField21.getText()));
        model.setNum27(parseDouble(myTextField21.getText()));
        model.setNum28(parseDouble(myTextField21.getText()));



     if(myTextField25.getText().equals("")){
         myTextField25.setPromptText("Уточните значение");
         myTextField25.clear();
     }
     else
    {
         model.setNum25(parseDouble(myTextField25.getText()));
     }


        model.setCheckBox1(checkbox1);
        model.setCheckBox2(checkbox2);
        model.setCheckBox3(checkbox3);
        model.setCheckBox4(checkbox4);
        model.setCheckBox5(checkbox5);
        model.setCheckBox6(checkbox6);
        model.setCheckBox7(checkbox7);
        model.setCheckBox8(checkbox8);
        model.setCheckBox9(checkbox9);
        model.setCheckBox10(checkbox10);
        model.setCheckBox11(checkbox11);


        // вычисляем результат
        model.go();


        // дальше нужно вывести результат
        myTextField12(model.getResultPrast());
        myTextField13(model.getResultPsrez());
        myTextField14(model.getResultPsmt());
        myTextField15(model.getResultPrazr());
        myTextField16(model.getResultηrast());
        myTextField17(model.getResultηsrez());
        myTextField18(model.getResultηsmt());
        myTextField19(model.getResultηrazr());
        //myTextField7(model.getResultzapas());
    }

    public void maxsize() throws FileNotFoundException {
        Image img = new Image(new FileInputStream("TipProushin6.jpg"));
        ImageView imv=new ImageView(img);
        imv.setViewport(new Rectangle2D(100,100,500,500));
        imv.setPreserveRatio(true);
        imv.setFitHeight(200);
        imv.setFitWidth(200);
        imv.setX(10);
        imv.setY(50);
        imv.setLayoutX(50);
        imv.setLayoutY(50);
        imv.setSmooth(true);

      //  imv.setBlendMode(BlendMode.DARKEN);
       // imv.setCursor(Cursor.TEXT);

    }


   /* public void createWord() throws IOException {

        this.runWord();
    }*/
   /* private void runWord() throws IOException {
        model.runWord();

    }*/
}
