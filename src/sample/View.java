package sample;

import javafx.fxml.FXML;


import javafx.scene.control.TextField;


public class View {


    @FXML
    private TextField myTextField19;
    @FXML
    private TextField myTextField7;

    void myTextField19(Double s) {

        myTextField19.setText(String.valueOf(s));
    }

    /*void myTextField7(Double s) {
        if(myTextField6.getText().equals("")){
            myTextField7.setPromptText("Ввести действующие напряжения");
            myTextField7.clear();
        }
        else
        {
            myTextField7.setText(String.valueOf(s));
        }


    }*/
}
