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
import java.text.DecimalFormat;

public class Model {

    private double kx;
    private double uv;


    private double b;
    private double d;
    private double a;
    private double δ;
    private double σв;
    private double σ02;
    private double E;
    private double b1;
    private double b2;
    private double E1;
    private double E2;
    private double h;
    private double P;
    private double δ1;
    private double δ2;
    private double g;
    private double h1;
    private double h2;
    private double h4;
    private double α;

    private double e;
    private double bd;
    private double σ;
    private double ad;
    private Double Km;
    private Double Ppr;
    private Double ky;
    private Double hefect;
    private Double hd;

    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private CheckBox checkbox4;
    private CheckBox checkbox5;
    private CheckBox checkbox6;
    private CheckBox checkbox7;
    private CheckBox checkbox8;
    private CheckBox checkbox9;
    private CheckBox checkbox10;
    private CheckBox checkbox11;



    private Double Prast;
    private Double Psrez;
    private Double Psmt;
    private Double Prazr;
    private Double PrazrodinPr;


    private Double ηrast;
    private Double ηsrez;
    private Double ηsmt;
    private Double ηrazr;


    void setNum1(Double s) {
        b = s;
    }

    void setNum2(Double s) {
        d = s;
    }

    void setNum3(Double s) {
        a = s;
    }

    void setNum4(Double s) {
        δ = s;
    }

    void setNum5(Double s) {
        σв = s;
    }

    void setNum6(Double s) {
        σ02 = s;
    }

    void setNum7(Double s) {
        E = s;
    }

    void setNum8(Double s) {
        b1 = s;
    }

    void setNum9(Double s) {
        b2 = s;
    }

    void setNum10(Double s) {
        E1 = s;
    }

    void setNum11(Double s) {
        E2 = s;
    }

    void setNum20(Double s) {
        h = s;
    }

    void setNum21(Double s) {
        P = s;
    }

    void setNum22(Double s) {
        δ1 = s;
    }

    void setNum23(Double s) {
        δ2 = s;
    }

    void setNum24(Double s) {
        g = s;
    }

    void setNum25(Double s) {
        h1 = s;
    }

    void setNum26(Double s) {
        h2 = s;
    }

    void setNum27(Double s) {
        h4 = s;
    }

    void setNum28(Double s) {
        α = s;
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

    void setCheckBox5(CheckBox checkBox) {
        checkbox5 = checkBox;
    }

    void setCheckBox6(CheckBox checkBox) {
        checkbox6 = checkBox;
    }

    void setCheckBox7(CheckBox checkBox) {
        checkbox7 = checkBox;
    }

    void setCheckBox8(CheckBox checkBox) {
        checkbox8 = checkBox;
    }

    void setCheckBox9(CheckBox checkBox) {
        checkbox9 = checkBox;
    }

    void setCheckBox10(CheckBox checkBox) {
        checkbox10 = checkBox;
    }

    void setCheckBox11(CheckBox checkBox) {
        checkbox11 = checkBox;
    }


    void go() {
        e = a / h;
        bd = b / d;
        σ = Math.min(σв, 1.3 * σ02);
        hefect=6/(3/h1+1/h2+1/h+1/h4);
        hd=hefect/d;
        ad = a / d;
        /*
        Двойная проушина осевая сила
         */
        if (checkbox2.isSelected() && checkbox3.isSelected()&&checkbox11.isSelected()) {
            uv = 0.65 * Math.abs(ad - 1) + 1.35;
            Psrez = uv * a * δ * σ;
            Psmt = uv * d * δ * σ;
            if (checkbox6.isSelected()) {
                if ((e >= 1) && (e <= 1.2)) {
                    kx = -0.0034995432724827 * Math.pow(bd, 6) + 0.0547907117288560 * Math.pow(bd, 5) - 0.3262309290003030 * Math.pow(bd, 4) + 0.8444566291000230 * Math.pow(bd, 3) - 0.4609847973624710 * Math.pow(bd, 2) - 1.98351737858684008 * bd + 3.5062002683841300;
                } else if ((e > 1.2) && (e <= 1.4)) {
                    kx = -0.0038185829434951 * Math.pow(bd, 6) + 0.0320863630186068 * Math.pow(bd, 5) + 0.0729667268315097 * Math.pow(bd, 4) - 1.6899770793388600 * Math.pow(bd, 3) + 7.2917675239732500 * Math.pow(bd, 2) - 13.5231400500124000 * bd + 10.2935418962254000;
                } else if ((e > 1.4) && (e <= 1.6)) {
                    kx = 0.0000627411191090 * Math.pow(bd, 6) - 0.0279006384298555 * Math.pow(bd, 5) + 0.4352798606341820 * Math.pow(bd, 4) - 2.7429339756199600 * Math.pow(bd, 3) + 8.6855121189291800 * Math.pow(bd, 2) - 13.9379479273321000 * bd + 9.9303777871319300;
                } else if (e > 1.6) {
                    kx = -0.0015146253826970 * Math.pow(bd, 6) + 0.0283871512365295 * Math.pow(bd, 5) - 0.2097993799106920 * Math.pow(bd, 4) + 0.7537604416429530 * Math.pow(bd, 3) - 1.2355224730126800 * Math.pow(bd, 2) + 0.3751704465357760 * bd + 1.7065444150216500;
                }
            } else if (checkbox7.isSelected()) {
                if ((e > 1) && (e <= 1.2)) {
                    kx = 0.00168131 * Math.pow(bd, 6) - 0.03310337 * Math.pow(bd, 5) + 0.26322097 * Math.pow(bd, 4) - 1.08732669 * Math.pow(bd, 3) + 2.48428627 * Math.pow(bd, 2) - 3.07055607 * bd + 2.48653214;
                } else if ((e > 1.2) && (e <= 1.4)) {
                    kx = 0.00659592 * Math.pow(bd, 6) - 0.11843551 * Math.pow(bd, 5) + 0.87791177 * Math.pow(bd, 4) - 3.44124213 * Math.pow(bd, 3) + 7.54393824 * Math.pow(bd, 2) - 8.87353534 * bd + 5.35480361;
                } else if ((e > 1.4) && (e <= 1.6)) {
                    kx = 0.00928722 * Math.pow(bd, 6) - 0.16809662 * Math.pow(bd, 5) + 1.25607322 * Math.pow(bd, 4) - 4.96001362 * Math.pow(bd, 3) + 10.93206395 * Math.pow(bd, 2) - 12.85759847 * bd + 7.36526557;
                } else if (e > 1.6) {
                    kx = 0.20942793 * Math.pow(bd, 6) - 4.49358738 * Math.pow(bd, 5) + 40.21739191 * Math.pow(bd, 4) - 192.10660271 * Math.pow(bd, 3) + 516.34470248 * Math.pow(bd, 2) - 740.23540213 * bd + 443.14772137;
                }
            } else if (checkbox8.isSelected()) {
                if ((e > 1) && (e <= 1.2)) {
                    kx = -0.0000215017480514 * Math.pow(bd, 6) + 0.0000064308511118 * Math.pow(bd, 5) + 0.0124149977085961 * Math.pow(bd, 4) - 0.1588168411202250 * Math.pow(bd, 3) + 0.8387474516130680 * Math.pow(bd, 2) - 2.1306226189610500 * bd + 2.7942374137651600;
                } else if ((e > 1.2) && (e <= 1.4)) {
                    kx = 0.0108134563215572 * Math.pow(bd, 6) - 0.2020323476119740 * Math.pow(bd, 5) + 1.5641784852875200 * Math.pow(bd, 4) - 6.4392126815950700 * Math.pow(bd, 3) + 14.9514900040167000 * Math.pow(bd, 2) - 18.7989448924019000 * bd + 10.9626698154726000;
                } else if ((e > 1.4) && (e <= 1.6)) {
                    kx = -0.0065862982082763 * Math.pow(bd, 6) + 0.1215536150411940 * Math.pow(bd, 5) - 0.9131134227791340 * Math.pow(bd, 4) + 3.5487432820664300 * Math.pow(bd, 3) - 7.4159047319117200 * Math.pow(bd, 2) + 7.5975534959507100 * bd - 1.7802426649914800;
                } else if (e > 1.6) {
                    kx = 0.0603860216797329 * Math.pow(bd, 6) - 1.1761311183672600 * Math.pow(bd, 5) + 9.4832087657206000 * Math.pow(bd, 4) - 40.5240801419497000 * Math.pow(bd, 3) + 96.8361820810065000 * Math.pow(bd, 2) - 122.8456647029100000 * bd + 65.7604871067084000;
                }
            }
            Prast = kx * ((b - d)*δ) * σ;
            Prazr = Math.min(Prast, Math.min(Psmt, Psrez));
            ηrast = Prast / P;
            ηsrez = Psrez / P;
            ηsmt = Psmt / P;
            ηrazr = Prazr / P;
        }
        /*
        Одинарная проушина осевая сила
         */
       else if ((checkbox1.isSelected() && checkbox3.isSelected()&&checkbox10.isSelected())||(checkbox2.isSelected() && checkbox3.isSelected()&&checkbox10.isSelected())) {
            uv = 0.65 * Math.abs(ad - 1) + 1.35;
            Psrez = uv * a * δ * σ;
            Psmt = uv * d * δ * σ;
            kx = 0.565 + 0.46 * e - 0.1 * bd;
            if (checkbox6.isSelected() && checkbox7.isSelected() && checkbox8.isSelected()) {
                if (kx < 1) {
                    kx = 0.565 + 0.46 * e - 0.1 * bd;
                } else if (kx > 1) {
                    kx = 1;
                }
            }
            Prast = kx * ((b - d) *δ) * σ;
            Prazr = Math.min(Prast, Math.min(Psmt, Psrez));
            Km = 1 + 3 * ((1 + (δ1 / δ2) + 2 * (g / δ2)) / (1 + ((E2 * b2 * Math.pow(δ2, 3)) / (E1 * b1 * Math.pow(δ1, 3)))));
            PrazrodinPr = (1 / Km) * Prazr;
            ηrast = Prast / P;
            ηsrez = Psrez / P;
            ηsmt = Psmt / P;
            ηrazr = PrazrodinPr / P;
        }
        /*
        Двойная проушина или одинарная проушина поперечная сила
         */
       else if ((checkbox1.isSelected() && checkbox4.isSelected())||(checkbox2.isSelected()&&checkbox4.isSelected())) {
            ad = h2 / d;
            uv = 0.65 * Math.abs(ad - 1) + 1.35;
            ky=24.0;
            Ppr=ky*d*δ*σ;
            Psmt = uv * d * δ * σ;
            Prazr=Math.min(Ppr,Psmt);
            ηsmt = Psmt / P;
            ηrazr = Prazr / P;
        }
       /*
       Двойная проушина совместная сила
        */
       else if((checkbox2.isSelected() && checkbox5.isSelected())){
            if (checkbox6.isSelected()) {
                if ((e >= 1) && (e <= 1.2)) {
                    kx = -0.0034995432724827 * Math.pow(bd, 6) + 0.0547907117288560 * Math.pow(bd, 5) - 0.3262309290003030 * Math.pow(bd, 4) + 0.8444566291000230 * Math.pow(bd, 3) - 0.4609847973624710 * Math.pow(bd, 2) - 1.98351737858684008 * bd + 3.5062002683841300;
                } else if ((e > 1.2) && (e <= 1.4)) {
                    kx = -0.0038185829434951 * Math.pow(bd, 6) + 0.0320863630186068 * Math.pow(bd, 5) + 0.0729667268315097 * Math.pow(bd, 4) - 1.6899770793388600 * Math.pow(bd, 3) + 7.2917675239732500 * Math.pow(bd, 2) - 13.5231400500124000 * bd + 10.2935418962254000;
                } else if ((e > 1.4) && (e <= 1.6)) {
                    kx = 0.0000627411191090 * Math.pow(bd, 6) - 0.0279006384298555 * Math.pow(bd, 5) + 0.4352798606341820 * Math.pow(bd, 4) - 2.7429339756199600 * Math.pow(bd, 3) + 8.6855121189291800 * Math.pow(bd, 2) - 13.9379479273321000 * bd + 9.9303777871319300;
                } else if (e > 1.6) {
                    kx = -0.0015146253826970 * Math.pow(bd, 6) + 0.0283871512365295 * Math.pow(bd, 5) - 0.2097993799106920 * Math.pow(bd, 4) + 0.7537604416429530 * Math.pow(bd, 3) - 1.2355224730126800 * Math.pow(bd, 2) + 0.3751704465357760 * bd + 1.7065444150216500;
                }
                Prast = kx * ((b - d) / δ) * σ;
            } else if (checkbox7.isSelected()) {
                if ((e > 1) && (e <= 1.2)) {
                    kx = 0.00168131 * Math.pow(bd, 6) - 0.03310337 * Math.pow(bd, 5) + 0.26322097 * Math.pow(bd, 4) - 1.08732669 * Math.pow(bd, 3) + 2.48428627 * Math.pow(bd, 2) - 3.07055607 * bd + 2.48653214;
                } else if ((e > 1.2) && (e <= 1.4)) {
                    kx = 0.00659592 * Math.pow(bd, 6) - 0.11843551 * Math.pow(bd, 5) + 0.87791177 * Math.pow(bd, 4) - 3.44124213 * Math.pow(bd, 3) + 7.54393824 * Math.pow(bd, 2) - 8.87353534 * bd + 5.35480361;
                } else if ((e > 1.4) && (e <= 1.6)) {
                    kx = 0.00928722 * Math.pow(bd, 6) - 0.16809662 * Math.pow(bd, 5) + 1.25607322 * Math.pow(bd, 4) - 4.96001362 * Math.pow(bd, 3) + 10.93206395 * Math.pow(bd, 2) - 12.85759847 * bd + 7.36526557;
                } else if (e > 1.6) {
                    kx = 0.20942793 * Math.pow(bd, 6) - 4.49358738 * Math.pow(bd, 5) + 40.21739191 * Math.pow(bd, 4) - 192.10660271 * Math.pow(bd, 3) + 516.34470248 * Math.pow(bd, 2) - 740.23540213 * bd + 443.14772137;
                }
                Prast = kx * ((b - d) / δ) * σ;
            } else if (checkbox8.isSelected()) {
                if ((e > 1) && (e <= 1.2)) {
                    kx = -0.0000215017480514 * Math.pow(bd, 6) + 0.0000064308511118 * Math.pow(bd, 5) + 0.0124149977085961 * Math.pow(bd, 4) - 0.1588168411202250 * Math.pow(bd, 3) + 0.8387474516130680 * Math.pow(bd, 2) - 2.1306226189610500 * bd + 2.7942374137651600;
                } else if ((e > 1.2) && (e <= 1.4)) {
                    kx = 0.0108134563215572 * Math.pow(bd, 6) - 0.2020323476119740 * Math.pow(bd, 5) + 1.5641784852875200 * Math.pow(bd, 4) - 6.4392126815950700 * Math.pow(bd, 3) + 14.9514900040167000 * Math.pow(bd, 2) - 18.7989448924019000 * bd + 10.9626698154726000;
                } else if ((e > 1.4) && (e <= 1.6)) {
                    kx = -0.0065862982082763 * Math.pow(bd, 6) + 0.1215536150411940 * Math.pow(bd, 5) - 0.9131134227791340 * Math.pow(bd, 4) + 3.5487432820664300 * Math.pow(bd, 3) - 7.4159047319117200 * Math.pow(bd, 2) + 7.5975534959507100 * bd - 1.7802426649914800;
                } else if (e > 1.6) {
                    kx = 0.0603860216797329 * Math.pow(bd, 6) - 1.1761311183672600 * Math.pow(bd, 5) + 9.4832087657206000 * Math.pow(bd, 4) - 40.5240801419497000 * Math.pow(bd, 3) + 96.8361820810065000 * Math.pow(bd, 2) - 122.8456647029100000 * bd + 65.7604871067084000;
                }
                Prast = kx * ((b - d) / δ) * σ;
            }
            ky=24.0*hd;
            Ppr=ky*d*δ*σ;
            Prazr=1/Math.pow(Math.pow((Math.cos(α)/Prast),1.6)+Math.pow((Math.sin(α)/Ppr),1.6),0.625);
        }
       /*
       Одинарная проушина совместная сила
        */
            else if((checkbox1.isSelected() && checkbox5.isSelected())){
                if (checkbox6.isSelected() && checkbox7.isSelected() && checkbox8.isSelected()) {
                kx = 0.565 + 0.46 * e - 0.1 * bd;
                if (kx < 1) {
                    kx = 0.565 + 0.46 * e - 0.1 * bd;
                } else if (kx > 1) {
                    kx = 1;
                }
                Prast = kx * ((b - d) / δ) * σ;
                }
            ky=24.0*hd;
            Ppr=ky*d*δ*σ;
            Prazr=1/Math.pow(Math.pow((Math.cos(α)/Prast),1.6)+Math.pow((Math.sin(α)/Ppr),1.6),0.625);
            }
    }

    String getResultPrast() {
        String formattedDouble = (new DecimalFormat("#0.00").format(Prast));
       // return Prast;
        return formattedDouble;
    }
    String getResultPsrez() {
        String formattedDouble = (new DecimalFormat("#0.00").format(Psrez));
        return formattedDouble;
    }
    String getResultPsmt() {
        String formattedDouble = (new DecimalFormat("#0.00").format(Psmt));
        return formattedDouble;
    }
    String getResultPrazr() {
        String formattedDouble = (new DecimalFormat("#0.00").format(Prazr));
        return formattedDouble;
    }
    String getResultηrast() {
        String formattedDouble = (new DecimalFormat("#0.00").format(ηrast));
        return formattedDouble;
    }
    String getResultηsrez() {
        String formattedDouble = (new DecimalFormat("#0.00").format(ηsrez));
        return formattedDouble;
    }
    String getResultηsmt() {
        String formattedDouble = (new DecimalFormat("#0.00").format(ηsmt));
        return formattedDouble;
    }
    String getResultηrazr() {
        String formattedDouble = (new DecimalFormat("#0.00").format(ηrazr));
        return formattedDouble;
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

