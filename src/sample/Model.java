package sample;

import javafx.scene.control.CheckBox;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Model {

    private double k;
    private double zapas;


    private double a;
    private double b;
    private double t;
    private double e;
    private double f;

    private double c;

    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private CheckBox checkbox4;


    private Double result;


    void setNum1(Double s) {
        a = s;
    }

    void setNum2(Double s) {
        b = s;
    }

    void setNum3(Double s) {
        t = s;
    }

    void setNum4(Double s) {
        e = s;
    }

    void setNum5(Double s) {
        f = s;
    }

    void setCheckBox1(CheckBox checkBox) {
        checkbox1 = checkBox;
    }

    void setCheckBox2(CheckBox checkBox) {
        checkbox2 = checkBox;
    }

    void setCheckBox3(CheckBox checkBox) {
        checkbox3 = checkBox;
    }

    void setCheckBox4(CheckBox checkBox) {
        checkbox4 = checkBox;
    }


    void go() {
        c = b / a;
        if (checkbox1.isSelected()) {
            if (c <= 0.1) {
                k = 8;
            } else if ((c > 0.1) && (c <= 0.15)) {
                k = 8.5;
            } else if ((c > 0.15) && (c <= 0.2)) {
                k = 8.8;
            } else if ((c > 0.2) && (c <= 0.25)) {
                k = 9;
            } else if ((c > 0.25) && (c <= 0.30)) {
                k = 9.2;
            } else if ((c > 0.3) && (c <= 0.35)) {
                k = 9.5;
            } else if ((c > 0.35) && (c <= 0.40)) {
                k = 9.8;
            } else if ((c > 0.40) && (c <= 0.45)) {
                k = 10.3;
            } else if ((c > 0.45) && (c <= 0.50)) {
                k = 10.5;
            } else if ((c > 0.5) && (c <= 0.55)) {
                k = 10.8;
            } else if ((c > 0.55) && (c <= 0.6)) {
                k = 11;
            } else if ((c > 0.6) && (c <= 0.65)) {
                k = 11.5;
            } else if ((c > 0.65) && (c <= 0.7)) {
                k = 11.8;
            } else if ((c > 0.7) && (c <= 0.75)) {
                k = 12;
            } else if ((c > 0.75) && (c <= 0.8)) {
                k = 12.5;
            } else if ((c > 0.8) && (c <= 0.85)) {
                k = 12.8;
            } else if ((c > 0.85) && (c <= 0.9)) {
                k = 13;
            } else if ((c > 0.9) && (c <= 0.95)) {
                k = 13.5;
            } else if ((c > 0.95) && (c <= 1)) {
                k = 14;
            }
            result = (k * e) / (Math.pow((b / t), 2));
        } else if (checkbox2.isSelected()) {
            if (c <= 0.1) {
                k = 8;
            } else if ((c > 0.1) && (c <= 0.15)) {
                k = 8.2;
            } else if ((c > 0.15) && (c <= 0.2)) {
                k = 8.4;
            } else if ((c > 0.2) && (c <= 0.25)) {
                k = 8.5;
            } else if ((c > 0.25) && (c <= 0.30)) {
                k = 8.6;
            } else if ((c > 0.3) && (c <= 0.35)) {
                k = 8.7;
            } else if ((c > 0.35) && (c <= 0.40)) {
                k = 8.9;
            } else if ((c > 0.40) && (c <= 0.45)) {
                k = 9;
            } else if ((c > 0.45) && (c <= 0.50)) {
                k = 9.2;
            } else if ((c > 0.5) && (c <= 0.55)) {
                k = 9.4;
            } else if ((c > 0.55) && (c <= 0.6)) {
                k = 9.5;
            } else if ((c > 0.6) && (c <= 0.65)) {
                k = 9.7;
            } else if ((c > 0.65) && (c <= 0.7)) {
                k = 10;
            } else if ((c > 0.7) && (c <= 0.75)) {
                k = 10;
            } else if ((c > 0.75) && (c <= 0.8)) {
                k = 10.2;
            } else if ((c > 0.8) && (c <= 0.85)) {
                k = 10.5;
            } else if ((c > 0.85) && (c <= 0.9)) {
                k = 10.6;
            } else if ((c > 0.9) && (c <= 0.95)) {
                k = 11;
            } else if ((c > 0.95) && (c <= 1)) {
                k = 11;
            }
            result = (k * e) / (Math.pow((b / t), 2));
        } else if (checkbox3.isSelected()) {
            if (c <= 0.1) {
                k = 4.9;
            } else if ((c > 0.1) && (c <= 0.15)) {
                k = 5.1;
            } else if ((c > 0.15) && (c <= 0.2)) {
                k = 5.2;
            } else if ((c > 0.2) && (c <= 0.25)) {
                k = 5.5;
            } else if ((c > 0.25) && (c <= 0.30)) {
                k = 5.8;
            } else if ((c > 0.3) && (c <= 0.35)) {
                k = 6;
            } else if ((c > 0.35) && (c <= 0.40)) {
                k = 6.2;
            } else if ((c > 0.40) && (c <= 0.45)) {
                k = 6.5;
            } else if ((c > 0.45) && (c <= 0.50)) {
                k = 6.9;
            } else if ((c > 0.5) && (c <= 0.55)) {
                k = 7;
            } else if ((c > 0.55) && (c <= 0.6)) {
                k = 7.5;
            } else if ((c > 0.6) && (c <= 0.65)) {
                k = 8;
            } else if ((c > 0.65) && (c <= 0.7)) {
                k = 8.2;
            } else if ((c > 0.7) && (c <= 0.75)) {
                k = 8.5;
            } else if ((c > 0.75) && (c <= 0.8)) {
                k = 9.1;
            } else if ((c > 0.8) && (c <= 0.85)) {
                k = 9.5;
            } else if ((c > 0.85) && (c <= 0.9)) {
                k = 10;
            } else if ((c > 0.9) && (c <= 0.95)) {
                k = 10.5;
            } else if ((c > 0.95) && (c <= 1)) {
                k = 11;
            }
            result = (k * e) / (Math.pow((b / t), 2));
        } else if (checkbox4.isSelected()) {
            if (c <= 0.1) {
                k = 4.8;
            } else if ((c > 0.1) && (c <= 0.15)) {
                k = 5;
            } else if ((c > 0.15) && (c <= 0.2)) {
                k = 5;
            } else if ((c > 0.2) && (c <= 0.25)) {
                k = 5.1;
            } else if ((c > 0.25) && (c <= 0.30)) {
                k = 5.2;
            } else if ((c > 0.3) && (c <= 0.35)) {
                k = 5.4;
            } else if ((c > 0.35) && (c <= 0.40)) {
                k = 5.5;
            } else if ((c > 0.40) && (c <= 0.45)) {
                k = 5.6;
            } else if ((c > 0.45) && (c <= 0.50)) {
                k = 5.9;
            } else if ((c > 0.5) && (c <= 0.55)) {
                k = 6;
            } else if ((c > 0.55) && (c <= 0.6)) {
                k = 6.2;
            } else if ((c > 0.6) && (c <= 0.65)) {
                k = 6.5;
            } else if ((c > 0.65) && (c <= 0.7)) {
                k = 6.7;
            } else if ((c > 0.7) && (c <= 0.75)) {
                k = 7;
            } else if ((c > 0.75) && (c <= 0.8)) {
                k = 7.1;
            } else if ((c > 0.8) && (c <= 0.85)) {
                k = 7.4;
            } else if ((c > 0.85) && (c <= 0.9)) {
                k = 7.8;
            } else if ((c > 0.9) && (c <= 0.95)) {
                k = 8;
            } else if ((c > 0.95) && (c <= 1)) {
                k = 8.3;
            }
            result = (k * e) / (Math.pow((b / t), 2));

        }

        zapas = result / f;
    }

    Double getResult() {
        return result;
    }

    Double getResultzapas() {

        return zapas;
    }


   /* void runWord()throws IOException {
            XWPFDocument document = new XWPFDocument();
            //Write the Document in file system
            FileOutputStream out = new FileOutputStream(new File("D:/createdocument.docx"));

            XWPFTable table = document.createTable();
            XWPFTableRow tableRowOne = table.getRow(0);
            //create first row
            table.getBottomBorderColor();
            tableRowOne.getCell(0).setText(String.valueOf("b="+zapas));
            tableRowOne.addNewTableCell().setText("");
            tableRowOne.addNewTableCell().setText("τ");
            table.removeBorders();
            document.write(out);
            out.close();
            System.out.println("U+0072");

    }*/
    }

