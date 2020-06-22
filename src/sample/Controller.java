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
    /* @FXML
     private TextField myTextField7;*/
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
//       myTextField7.setTextFormatter(new AlphaNumericTextFormatter());
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

checkbox9.setDisable(true);

    }

    /*
    Кнопка решения
     */
    @FXML
    public void select() throws Exception {
      if(checkbox1.isSelected())

    {
        //myTextField1.setDisable(true);
        checkbox2.setDisable(true);
        checkbox4.setDisable(true);
        checkbox5.setDisable(true);
        checkbox10.setDisable(true);
        checkbox11.setDisable(true);
        //myTextField1.setOpacity(0.5);
        checkbox6.setDisable(true);
        checkbox7.setDisable(true);
        checkbox8.setDisable(true);
    }
     else
    {
        checkbox2.setDisable(false);
        checkbox4.setDisable(false);
        checkbox5.setDisable(false);
        checkbox10.setDisable(false);
        checkbox11.setDisable(false);
        checkbox6.setDisable(false);
        checkbox7.setDisable(false);
        checkbox8.setDisable(false);
    }
}

    public void select2() throws Exception {
        if (checkbox2.isSelected()) {
            checkbox1.setDisable(true);
            myTextField8.setDisable(true);
            myTextField9.setDisable(true);
            myTextField10.setDisable(true);
            myTextField11.setDisable(true);
            myTextField22.setDisable(true);
            myTextField23.setDisable(true);
            myTextField24.setDisable(true);
        }
        else{
            checkbox1.setDisable(false);
            myTextField8.setDisable(false);
            myTextField9.setDisable(false);
            myTextField10.setDisable(false);
            myTextField11.setDisable(false);
            myTextField22.setDisable(false);
            myTextField23.setDisable(false);
            myTextField24.setDisable(false);
        }
    }
    public void select3() throws Exception {
        if (checkbox3.isSelected()) {
            checkbox4.setDisable(true);
            checkbox5.setDisable(true);
            myTextField25.setDisable(true);
            myTextField26.setDisable(true);
            myTextField27.setDisable(true);
            myTextField28.setDisable(true);

        }
        else{
            checkbox4.setDisable(false);
            checkbox5.setDisable(false);
            myTextField25.setDisable(false);
            myTextField26.setDisable(false);
            myTextField27.setDisable(false);
            myTextField28.setDisable(false);
        }
    }

    public void select4() throws Exception {
        if (checkbox4.isSelected()) {
            checkbox3.setDisable(true);
            checkbox5.setDisable(true);
        }
        else{
            checkbox3.setDisable(false);
            checkbox5.setDisable(false);

        }
    }

    public void select5() throws Exception {

    }

    public void select6() throws Exception {
        if(checkbox6.isSelected()){
            checkbox7.setDisable(true);
            checkbox8.setDisable(true);
        }
        else{
            checkbox7.setDisable(false);
            checkbox8.setDisable(false);
        }
    }
    public void select7() throws Exception {
        if(checkbox7.isSelected()){
            checkbox8.setDisable(true);
            checkbox6.setDisable(true);
        }
        else{
            checkbox8.setDisable(false);
            checkbox6.setDisable(false);
        }
    }
    public void select8() throws Exception {
        if(checkbox8.isSelected()){
            checkbox7.setDisable(true);
            checkbox6.setDisable(true);
        }
        else{
            checkbox7.setDisable(false);
            checkbox6.setDisable(false);
        }
    }
    public void select10() throws Exception {
        if(checkbox10.isSelected()) {
            checkbox11.setDisable(true);
        }
            else{
                checkbox11.setDisable(false);
            }
        }

    public void select11() throws Exception {
        if(checkbox11.isSelected()) {
            checkbox10.setDisable(true);
        }
        else{
            checkbox10.setDisable(false);
        }
    }


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
       // model.setNum7(parseDouble(myTextField7.getText()));
        model.setNum8(parseDouble(myTextField8.getText()));
        model.setNum9(parseDouble(myTextField9.getText()));
        model.setNum10(parseDouble(myTextField10.getText()));
        model.setNum11(parseDouble(myTextField11.getText()));
        model.setNum20(parseDouble(myTextField20.getText()));
        model.setNum21(parseDouble(myTextField21.getText()));
        model.setNum22(parseDouble(myTextField22.getText()));
        model.setNum23(parseDouble(myTextField23.getText()));
        model.setNum24(parseDouble(myTextField24.getText()));
        model.setNum25(parseDouble(myTextField25.getText()));
        model.setNum26(parseDouble(myTextField26.getText()));
        model.setNum27(parseDouble(myTextField27.getText()));
        model.setNum28(parseDouble(myTextField28.getText()));



  /*   if(myTextField25.getText().equals("")){
         myTextField25.setPromptText("Уточните значение");
         myTextField25.clear();
     }
     else
    {
         model.setNum25(parseDouble(myTextField25.getText()));
     }*/



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
        myTextField29(model.getResultPpr());
        myTextField30(model.getResultηpr());
    }




   /* public void createWord() throws IOException {

        this.runWord();
    }*/
   /* private void runWord() throws IOException {
        model.runWord();

    }*/
}
