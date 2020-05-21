package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.io.IOException;
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
    private CheckBox checkbox1;
    @FXML
    private CheckBox checkbox2;
    @FXML
    private CheckBox checkbox3;
    @FXML
    private CheckBox checkbox4;


    private Model model = new Model();

   @Override
    public void initialize(URL location, ResourceBundle resources) {
       myTextField1.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField2.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField3.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField4.setTextFormatter(new AlphaNumericTextFormatter());
       myTextField5.setTextFormatter(new AlphaNumericTextFormatter());

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


     if(myTextField5.getText().equals("")){
        myTextField5.setPromptText("Уточните значение");
        myTextField5.clear();
     }
     else
 {
         model.setNum5(parseDouble(myTextField5.getText()));
     }

        model.setCheckBox1(checkbox1);
        model.setCheckBox2(checkbox2);
        model.setCheckBox3(checkbox3);
        model.setCheckBox4(checkbox4);

        // вычисляем результат
        model.go();


        // дальше нужно вывести результат
        myTextField6(model.getResult());
        myTextField7(model.getResultzapas());
    }

   /* public void createWord() throws IOException {

        this.runWord();
    }*/
   /* private void runWord() throws IOException {
        model.runWord();

    }*/
}
