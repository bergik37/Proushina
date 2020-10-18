package sample;


import com.spire.doc.documents.*;
import com.spire.doc.fields.DocPicture;
import com.spire.doc.fields.omath.OfficeMath;
import javafx.scene.control.CheckBox;


import java.io.IOException;
import java.text.DecimalFormat;
import com.spire.doc.*;

import java.awt.*;

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
    private Double ηpr;


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

   /* void setNum7(Double s) {
        E = s;
    }*/

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
        hefect = 6 / ((3 / h1) + (1 / h2) + (1 / a) + (1 / h4));
        hd = hefect / d;
        ad = a / d;
        /*
        Двойная проушина осевая сила
         */
        if ((checkbox2.isSelected() && checkbox3.isSelected() && checkbox11.isSelected())) {
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
                if ((e >= 1) && (e <= 1.2)) {
                    kx = 0.00168131 * Math.pow(bd, 6) - 0.03310337 * Math.pow(bd, 5) + 0.26322097 * Math.pow(bd, 4) - 1.08732669 * Math.pow(bd, 3) + 2.48428627 * Math.pow(bd, 2) - 3.07055607 * bd + 2.48653214;
                } else if ((e > 1.2) && (e <= 1.4)) {
                    kx = 0.00659592 * Math.pow(bd, 6) - 0.11843551 * Math.pow(bd, 5) + 0.87791177 * Math.pow(bd, 4) - 3.44124213 * Math.pow(bd, 3) + 7.54393824 * Math.pow(bd, 2) - 8.87353534 * bd + 5.35480361;
                } else if ((e > 1.4) && (e <= 1.6)) {
                    kx = 0.00928722 * Math.pow(bd, 6) - 0.16809662 * Math.pow(bd, 5) + 1.25607322 * Math.pow(bd, 4) - 4.96001362 * Math.pow(bd, 3) + 10.93206395 * Math.pow(bd, 2) - 12.85759847 * bd + 7.36526557;
                } else if (e > 1.6) {
                    kx = 0.20942793 * Math.pow(bd, 6) - 4.49358738 * Math.pow(bd, 5) + 40.21739191 * Math.pow(bd, 4) - 192.10660271 * Math.pow(bd, 3) + 516.34470248 * Math.pow(bd, 2) - 740.23540213 * bd + 443.14772137;
                }
            } else if (checkbox8.isSelected()) {
                if ((e >= 1) && (e <= 1.2)) {
                    kx = -0.0000215017480514 * Math.pow(bd, 6) + 0.0000064308511118 * Math.pow(bd, 5) + 0.0124149977085961 * Math.pow(bd, 4) - 0.1588168411202250 * Math.pow(bd, 3) + 0.8387474516130680 * Math.pow(bd, 2) - 2.1306226189610500 * bd + 2.7942374137651600;
                } else if ((e > 1.2) && (e <= 1.4)) {
                    kx = 0.0108134563215572 * Math.pow(bd, 6) - 0.2020323476119740 * Math.pow(bd, 5) + 1.5641784852875200 * Math.pow(bd, 4) - 6.4392126815950700 * Math.pow(bd, 3) + 14.9514900040167000 * Math.pow(bd, 2) - 18.7989448924019000 * bd + 10.9626698154726000;
                } else if ((e > 1.4) && (e <= 1.6)) {
                    kx = -0.0065862982082763 * Math.pow(bd, 6) + 0.1215536150411940 * Math.pow(bd, 5) - 0.9131134227791340 * Math.pow(bd, 4) + 3.5487432820664300 * Math.pow(bd, 3) - 7.4159047319117200 * Math.pow(bd, 2) + 7.5975534959507100 * bd - 1.7802426649914800;
                } else if (e > 1.6) {
                    kx = 0.0603860216797329 * Math.pow(bd, 6) - 1.1761311183672600 * Math.pow(bd, 5) + 9.4832087657206000 * Math.pow(bd, 4) - 40.5240801419497000 * Math.pow(bd, 3) + 96.8361820810065000 * Math.pow(bd, 2) - 122.8456647029100000 * bd + 65.7604871067084000;
                }
            }
            Prast = kx * ((b - d) * δ) * σ;
            Prazr = Math.min(Prast, Math.min(Psmt, Psrez));
            ηrast = Prast / P;
            ηsrez = Psrez / P;
            ηsmt = Psmt / P;
            ηrazr = Prazr / P;
            ηpr = 0.0;
            Ppr = 0.0;


        }
        /*
        Односрезная проушина проушина осевая сила
         */
        else if ((checkbox1.isSelected() && checkbox3.isSelected())) {
            //if (checkbox6.isSelected() || checkbox7.isSelected() || checkbox8.isSelected()) {
            b = Math.min(b1, b2);
            bd = b / d;
            δ = Math.min(δ1, δ2);
            uv = 0.65 * (Math.abs(ad - 1)) + 1.35;
            Psrez = uv * a * δ * σ;
            Psmt = uv * d * δ * σ;
            kx = 0.565 + 0.46 * e - 0.1 * bd;
            if (kx > 1) {
                kx = 1;
            }
            Prast = kx * ((b - d) * δ) * σ;
            Prazr = Math.min(Prast, Math.min(Psmt, Psrez));
            Km = 1 + 3 * ((1 + (δ1 / δ2) + 2 * (g / δ2)) / (1 + ((E2 * b2 * Math.pow(δ2, 3)) / (E1 * b1 * Math.pow(δ1, 3)))));
            PrazrodinPr = (1 / Km) * Prazr;
            Prazr = PrazrodinPr;//переприсвоение для таблицы результатов
            ηrast = Prast / P;
            ηsrez = Psrez / P;
            ηsmt = Psmt / P;
            ηrazr = PrazrodinPr / P;
            ηpr = 0.0;
            Ppr = 0.0;

            // }
        }
            /*
            Двухсрезная одинарная проушина осевая сила
             */
        else if ((checkbox2.isSelected() && checkbox3.isSelected() && checkbox10.isSelected())) {
            uv = 0.65 * Math.abs(ad - 1) + 1.35;
            Psrez = uv * a * δ * σ;
            Psmt = uv * d * δ * σ;
            if (checkbox6.isSelected() || checkbox7.isSelected() || checkbox8.isSelected()) {
                kx = 0.565 + 0.46 * e - 0.1 * bd;
                if (kx > 1) {
                    kx = 1;
                }
            }
            Prast = kx * ((b - d) * δ) * σ;
            Prazr = Math.min(Prast, Math.min(Psmt, Psrez));
            ηrast = Prast / P;
            ηsrez = Psrez / P;
            ηsmt = Psmt / P;
            ηrazr = Prazr / P;
            ηpr = 0.0;
            Ppr = 0.0;
        }


        /*
        Двухсрезная двойная проушина или одинарная проушина поперечная сила
         */
        else if ((checkbox2.isSelected() && checkbox4.isSelected() && checkbox10.isSelected()) || (checkbox2.isSelected() && checkbox4.isSelected() && checkbox11.isSelected())) {
            if (checkbox6.isSelected() || checkbox7.isSelected() || checkbox8.isSelected()) {
                uv = 0.65 * Math.abs(ad - 1) + 1.35;
                Prast = 0.0;
                Psrez = 0.0;
                ηrast = 0.0;
                ηsrez = 0.0;
                ad = h2 / d;
                uv = 0.65 * Math.abs(ad - 1) + 1.35;
                ky = 24.0;
                Ppr = ky * d * δ * σ;
                Psmt = uv * d * δ * σ;
                ηpr = Ppr / P;
                Prazr = Math.min(Ppr, Psmt);
                ηsmt = Psmt / P;
                ηrazr = Prazr / P;
            }
        }
       /*
       Двойная проушина совместная сила
        */
        else if ((checkbox2.isSelected() && checkbox5.isSelected()) && checkbox11.isSelected()) {
            uv = 0.65 * Math.abs(ad - 1) + 1.35;
            Psrez = 0.0;
            Psmt = uv * d * δ * σ;
            ηrast = 0.0;
            ηsrez = 0.0;
            ηpr = 0.0;
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
                Prast = kx * ((b - d) * δ) * σ;
            } else if (checkbox7.isSelected()) {
                if ((e >= 1) && (e <= 1.2)) {
                    kx = 0.00168131 * Math.pow(bd, 6) - 0.03310337 * Math.pow(bd, 5) + 0.26322097 * Math.pow(bd, 4) - 1.08732669 * Math.pow(bd, 3) + 2.48428627 * Math.pow(bd, 2) - 3.07055607 * bd + 2.48653214;
                } else if ((e > 1.2) && (e <= 1.4)) {
                    kx = 0.00659592 * Math.pow(bd, 6) - 0.11843551 * Math.pow(bd, 5) + 0.87791177 * Math.pow(bd, 4) - 3.44124213 * Math.pow(bd, 3) + 7.54393824 * Math.pow(bd, 2) - 8.87353534 * bd + 5.35480361;
                } else if ((e > 1.4) && (e <= 1.6)) {
                    kx = 0.00928722 * Math.pow(bd, 6) - 0.16809662 * Math.pow(bd, 5) + 1.25607322 * Math.pow(bd, 4) - 4.96001362 * Math.pow(bd, 3) + 10.93206395 * Math.pow(bd, 2) - 12.85759847 * bd + 7.36526557;
                } else if (e > 1.6) {
                    kx = 0.20942793 * Math.pow(bd, 6) - 4.49358738 * Math.pow(bd, 5) + 40.21739191 * Math.pow(bd, 4) - 192.10660271 * Math.pow(bd, 3) + 516.34470248 * Math.pow(bd, 2) - 740.23540213 * bd + 443.14772137;
                }
                Prast = kx * ((b - d) * δ) * σ;
            } else if (checkbox8.isSelected()) {
                if ((e >= 1) && (e <= 1.2)) {
                    kx = -0.0000215017480514 * Math.pow(bd, 6) + 0.0000064308511118 * Math.pow(bd, 5) + 0.0124149977085961 * Math.pow(bd, 4) - 0.1588168411202250 * Math.pow(bd, 3) + 0.8387474516130680 * Math.pow(bd, 2) - 2.1306226189610500 * bd + 2.7942374137651600;
                } else if ((e > 1.2) && (e <= 1.4)) {
                    kx = 0.0108134563215572 * Math.pow(bd, 6) - 0.2020323476119740 * Math.pow(bd, 5) + 1.5641784852875200 * Math.pow(bd, 4) - 6.4392126815950700 * Math.pow(bd, 3) + 14.9514900040167000 * Math.pow(bd, 2) - 18.7989448924019000 * bd + 10.9626698154726000;
                } else if ((e > 1.4) && (e <= 1.6)) {
                    kx = -0.0065862982082763 * Math.pow(bd, 6) + 0.1215536150411940 * Math.pow(bd, 5) - 0.9131134227791340 * Math.pow(bd, 4) + 3.5487432820664300 * Math.pow(bd, 3) - 7.4159047319117200 * Math.pow(bd, 2) + 7.5975534959507100 * bd - 1.7802426649914800;
                } else if (e > 1.6) {
                    kx = 0.0603860216797329 * Math.pow(bd, 6) - 1.1761311183672600 * Math.pow(bd, 5) + 9.4832087657206000 * Math.pow(bd, 4) - 40.5240801419497000 * Math.pow(bd, 3) + 96.8361820810065000 * Math.pow(bd, 2) - 122.8456647029100000 * bd + 65.7604871067084000;
                }
                Prast = kx * ((b - d) * δ) * σ;
            }
            ky = -0.0298249707557261 * Math.pow(hd, 6) + 0.0789122361456975 * Math.pow(hd, 5) + 0.0352590117836371 * Math.pow(hd, 4) - 0.2713984944857660 * Math.pow(hd, 3) - 0.0271109379245900 * Math.pow(hd, 2) + 1.1504565558716400 * hd - 0.0035987823155210;
            Ppr = ky * d * δ * σ;
            Prazr = 1 / Math.pow(Math.pow((Math.cos((Math.toRadians(α))) / Prast), 1.6) + Math.pow((Math.sin((Math.toRadians(α))) / Ppr), 1.6), 0.625);
            ηrazr = Prazr / P;
            ηsmt = Psmt / P;


        }
       /*
       Одинарная проушина совместная сила
        */
        else if ((checkbox2.isSelected() && checkbox5.isSelected() && checkbox10.isSelected())) {
            uv = 0.65 * Math.abs(ad - 1) + 1.35;
            Psrez = 0.0;
            Psmt = uv * d * δ * σ;
            ηrast = 0.0;
            ηsrez = 0.0;
            ηpr = 0.0;
            if (checkbox6.isSelected() || checkbox7.isSelected() || checkbox8.isSelected()) {
                kx = 0.565 + 0.46 * e - 0.1 * bd;
                if (kx > 1) {
                    kx = 1;
                }
                Prast = kx * ((b - d) * δ) * σ;
                ky = -0.0298249707557261 * Math.pow(hd, 6) + 0.0789122361456975 * Math.pow(hd, 5) + 0.0352590117836371 * Math.pow(hd, 4) - 0.2713984944857660 * Math.pow(hd, 3) - 0.0271109379245900 * Math.pow(hd, 2) + 1.1504565558716400 * hd - 0.0035987823155210;
                Ppr = ky * d * δ * σ;
                Prazr = 1 / Math.pow(Math.pow((Math.cos((Math.toRadians(α))) / Prast), 1.6) + Math.pow((Math.sin((Math.toRadians(α))) / Ppr), 1.6), 0.625);
                //ηpr=Ppr/P;

            }
            ηrazr = Prazr / P;
            ηsmt = Psmt / P;
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

    String getResultηpr() {
        String formattedDouble = (new DecimalFormat("#0.00").format(ηpr));
        return formattedDouble;
    }

    String getResultPpr() {
        String formattedDouble = (new DecimalFormat("#0.00").format(Ppr));
        return formattedDouble;
    }

    void otchet() {

        String name = "Proushina.docx";
        Document document = new Document();

        Section section = document.addSection();

        Paragraph paragraph1 = section.addParagraph();

        //название и нстройки главы

        paragraph1.setText("5.1.Расчет проушины");

        ParagraphStyle style1 = new ParagraphStyle(document);

        style1.setName("titleStyle");

        style1.getCharacterFormat().setBold(true);

        style1.getCharacterFormat().setTextColor(Color.BLACK);

        style1.getCharacterFormat().setFontName("Times New Roman");

        style1.getCharacterFormat().setFontSize(14f);

        //пробелы
        style1.getCharacterFormat().setPosition(10);

        //style1.getCharacterFormat().set

        document.getStyles().add(style1);

        paragraph1.applyStyle("titleStyle");


        Paragraph paragraph2 = section.addParagraph();


        paragraph2.setText("Расчет проушины проводился по методике ЭРДК 1530, номера ссылок на графике в отчете соответствуют графикам в методичке.");

        Paragraph paragraph3 = section.addParagraph();

        paragraph3.setText("На рисунке 1 показана схема проушины с размерами и направлением приложенной нагрузки.");
        //Set title style for paragraph 1

        Paragraph paragraph4 = section.addParagraph();

        DocPicture picture = paragraph4.appendPicture("D:\\IntelIdeaProect\\Proushina\\src\\sample\\Otchet1.png");

        Paragraph paragraph5 = section.addParagraph();


        //paragraph5.set;
        paragraph5.setText("Рисунок 1. Схема проушины");



        //Set image width

        picture.setHorizontalPosition(800f);

        picture.setVerticalPosition(800f);

        picture.setWidth(300f);

        //Set image height

        picture.setHeight(250f);

        //Add a table

        Table table = section.addTable(true);
        table.resetCells(10, 3);

        //Set column width

        table.autoFit(AutoFitBehaviorType.Auto_Fit_To_Window);
        table.autoFit(AutoFitBehaviorType.Auto_Fit_To_Contents);


        table.get(0,0).addParagraph().appendText("Обозначение");
        table.get(0,1).addParagraph().appendText("Расшифровка");
        table.get(0,2).addParagraph().appendText("Значение");

        //2 строка

        table.get(1,0).addParagraph().appendText("a");
        table.get(1,1).addParagraph().appendText("расстояние от края отверстия до вершины проушины, мм");
        table.get(1,2).addParagraph().appendText(""+a);

        //3 строка

        table.get(2,0).addParagraph().appendText("b");
        table.get(2,1).addParagraph().appendText("ширина проушины в поперечном сечении по центру отверстия, мм");
        table.get(2,2).addParagraph().appendText(""+b);

        //4 строка

        table.get(3,0).addParagraph().appendText("d");
        table.get(3,1).addParagraph().appendText("диаметр отверстия, мм");
        table.get(3,2).addParagraph().appendText(""+d);

        //5 строка

        table.get(4,0).addParagraph().appendText("h");
        table.get(4,1).addParagraph().appendText("расстояние от отверстия до края проушины в ее перечном сечении, мм");
        table.get(4,2).addParagraph().appendText(""+h);

        //6 строка

        table.get(5,0).addParagraph().appendText("α");
        table.get(5,1).addParagraph().appendText("угол между направлением действия силы и продольной осью проушины, град");
        table.get(5,2).addParagraph().appendText(""+α);

        //7 строка

        table.get(6,0).addParagraph().appendText("δ");
        table.get(6,1).addParagraph().appendText("толщина проушины, мм");
        table.get(6,2).addParagraph().appendText(""+δ);

        //8 строка

        table.get(7,0).addParagraph().appendText("σ02");
        table.get(7,1).addParagraph().appendText("условный предел текучести, МПа");
        table.get(7,2).addParagraph().appendText(""+σ02);

        //9 строка

        table.get(8,0).addParagraph().appendText("σв");
        table.get(8,1).addParagraph().appendText("предел прочности материала проушины, МПа");
        table.get(8,2).addParagraph().appendText(""+σв);

        //10 строка

        table.get(9,0).addParagraph().appendText("P");
        table.get(9,1).addParagraph().appendText("сила, действующая на проушину, Н");
        table.get(9,2).addParagraph().appendText(""+P);

        //Формула
        Paragraph paragraph6 = section.addParagraph();

        paragraph6.setText("1.Разрыв по сечению проушины, проходящему через центр отверстия:");

        paragraph6.getFormat().setBeforeSpacing(20);



        String[] latexMathCode1 = {
                "P_{PACT} = ",
                "k_{x}",
                "F_{PACT}",
                "L^*"+" = "+kx+Prast+σ


        };



        //style1.getCharacterFormat().setPosition(10);

        OfficeMath officeMath;

        //Table table1 = section.getTables().get(0);

        for (int i = 0; i < latexMathCode1.length; i++) {

            //  paragraph5 = table1.getRows().get(i + 1).getCells().get(0).addParagraph();

            // paragraph5.setText(latexMathCode1[i]);

            //paragraph5 = table1.getRows().get(i + 1).getCells().get(1).addParagraph();

            officeMath = new OfficeMath(document);

            officeMath.fromLatexMathCode(latexMathCode1[i]);

            paragraph6.getItems().add(officeMath);

        }


        document.saveToFile(name, FileFormat.Docx);


    }


    void otchet2() {

    }

    void otchet3() {

    }

    void otchet4() {

    }
}
