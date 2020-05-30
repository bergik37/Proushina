package sample;

import javafx.fxml.FXML;


import javafx.scene.control.TextField;


public class View {

    @FXML
    private TextField myTextField12;
    @FXML
    private TextField myTextField13;
    @FXML
    private TextField myTextField14;
    @FXML
    private TextField myTextField15;
    @FXML
    private TextField myTextField16;
    @FXML
    private TextField myTextField17;
    @FXML
    private TextField myTextField18;
    @FXML
    private TextField myTextField19;


    void myTextField12(String s) {
        myTextField12.setText((s));
    }
    void myTextField13(String s) {
        myTextField13.setText((s));
    }
    void myTextField14(String s) {
        myTextField14.setText((s));
    }
    void myTextField15(String s) {
        myTextField15.setText((s));
    }
    void myTextField16(String s) {
        myTextField16.setText((s));
    }
    void myTextField17(String s) {
        myTextField17.setText((s));
    }
    void myTextField18(String s) {
        myTextField18.setText((s));
    }
    void myTextField19(String s) {
        myTextField19.setText((s));
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
