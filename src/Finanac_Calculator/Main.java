package Finanac_Calculator;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.text.DecimalFormat;

public class Main extends Application {

    Scene Home_window, Mortgage_window, Finance_window, AutoLone_window,Help_window,History_window;

    @Override
    public void start(Stage primaryStage) {


        Pane rootHome = new Pane();
        rootHome.setStyle("-fx-background-color:#b3d9ff;");

        Label lblTitle = new Label("CALCULATOR");
        lblTitle.setLayoutX(0);
        lblTitle.setLayoutY(0);
        lblTitle.setStyle("-fx-background-color:#3333cc; -fx-alignment:center; -fx-min-width:500; " +
                " -fx-text-fill:white; -fx-font: normal bold 18px 'serif'");

        Button btnMORTGAGE = new Button("MORTGAGE  CALCULATOR");
        btnMORTGAGE.setLayoutX(150);
        btnMORTGAGE.setLayoutY(100);
        btnMORTGAGE.setStyle("-fx-background-color:#3385ff; -fx-background-radius:10; " +
                "-fx-min-height:40;-fx-font: normal bold 15px 'serif'; -fx-text-fill:black");
        btnMORTGAGE.setOnAction(event -> primaryStage.setScene(Mortgage_window));


        Button btnFINANCE = new Button("FINANCE  CALCULATOR");
        btnFINANCE.setLayoutX(158);
        btnFINANCE.setLayoutY(180);
        btnFINANCE.setStyle("-fx-background-color:#3385ff; -fx-background-radius:10;" +
                "-fx-min-height:40;-fx-font: normal bold 15px 'serif'; -fx-text-fill:black");
        btnFINANCE.setOnAction(event -> primaryStage.setScene(Finance_window));


        Button btnAUTO_LOAN = new Button("AUTO  LOAN  CALCULATOR");
        btnAUTO_LOAN.setLayoutX(150);
        btnAUTO_LOAN.setLayoutY(260);
        btnAUTO_LOAN.setStyle("-fx-background-color:#3385ff; -fx-background-radius:10;" +
                "-fx-min-height:40;-fx-font: normal bold 15px 'serif'; -fx-text-fill:black");
        btnAUTO_LOAN.setOnAction(event -> primaryStage.setScene(AutoLone_window));


        Button btn_Help = new Button("Help");
        btn_Help.setLayoutX(80);
        btn_Help.setLayoutY(340);
        btn_Help.setStyle("-fx-background-color:#ff3333; -fx-background-radius:10;" +
                "-fx-min-height:10;-fx-font: normal bold 13px 'serif'; -fx-text-fill:black;-fx-min-width:80");
        btn_Help.setOnAction(event -> primaryStage.setScene(Help_window));


        Button btn_History = new Button("History");
        btn_History.setLayoutX(210);
        btn_History.setLayoutY(340);
        btn_History.setStyle("-fx-background-color:#ff3333; -fx-background-radius:10;" +
                "-fx-min-height:10;-fx-font: normal bold 13px 'serif'; -fx-text-fill:black;-fx-min-width:80");
        btn_History.setOnAction(event -> primaryStage.setScene(History_window));



        Button btn_Close = new Button("Close");
        btn_Close.setLayoutX(350);
        btn_Close.setLayoutY(340);
        btn_Close.setOnAction(event -> primaryStage.close());
        btn_Close.setStyle("-fx-background-color:#ff3333; -fx-background-radius:10;" +
                "-fx-min-height:10;-fx-font: normal bold 13px 'serif'; -fx-text-fill:black;-fx-min-width:80");


        rootHome.getChildren().add(lblTitle);
        rootHome.getChildren().add(btnMORTGAGE);
        rootHome.getChildren().add(btnFINANCE);
        rootHome.getChildren().add(btnAUTO_LOAN);
        rootHome.getChildren().add(btn_Help);
        rootHome.getChildren().add(btn_Close);
        rootHome.getChildren().add(btn_History);

        Home_window = new Scene(rootHome, 500, 400);
        primaryStage.setScene(Home_window);
        primaryStage.show();


        //----------------------------------------------------Mortgage Calculator-----------------------------------------------------------------------------------------------//


        Label lbl_Title = new Label("Modify the values and click the Calculate button to use");
        lbl_Title.setLayoutX(0);
        lbl_Title.setLayoutY(10);
        lbl_Title.setStyle("-fx-background-color:blue; -fx-alignment:center; " +
                "-fx-min-width:748; -fx-text-fill:white;  -fx-font: normal bold 18px 'serif'");

        Label lblHome_price = new Label(" Home Price ");
        lblHome_price.setLayoutX(50);
        lblHome_price.setLayoutY(50);

        TextField textHome_price = new TextField();
        textHome_price.setLayoutX(150);
        textHome_price.setLayoutY(50);

        Label lblDown_payment = new Label(" Down Payment ");
        lblDown_payment.setLayoutX(50);
        lblDown_payment.setLayoutY(90);

        TextField textDown_payment = new TextField();
        textDown_payment.setLayoutX(150);
        textDown_payment.setLayoutY(90);

        ComboBox combo_1 = new ComboBox();
        combo_1.getItems().addAll("$", "%");
        combo_1.setLayoutX(300);
        combo_1.setLayoutY(90);

        Label lblLoan_term = new Label(" Loan Term ");
        lblLoan_term.setLayoutX(50);
        lblLoan_term.setLayoutY(130);

        TextField textLoan_term = new TextField();
        textLoan_term.setLayoutX(150);
        textLoan_term.setLayoutY(130);

        Label lblLoan_term_years = new Label(" Loan Term ");
        lblLoan_term_years.setLayoutX(300);
        lblLoan_term_years.setLayoutY(130);

        Label lblInterest_rate = new Label(" Interest Rate ");
        lblInterest_rate.setLayoutX(50);
        lblInterest_rate.setLayoutY(170);

        TextField textInterest_rate = new TextField();
        textInterest_rate.setLayoutX(150);
        textInterest_rate.setLayoutY(170);

        Button btnMort_Calculator = new Button("Calculate");
        btnMort_Calculator.setLayoutX(60);
        btnMort_Calculator.setLayoutY(280);
        btnMort_Calculator.setStyle("-fx-background-color:#bfff00;-fx-min-width:100; -fx-font: normal bold 15px 'serif'");


        Button btn_back = new Button("Back");
        btn_back.setLayoutX(250);
        btn_back.setLayoutY(280);
        btn_back.setStyle("-fx-background-color:#bfff00;-fx-min-width:100; -fx-font: normal bold 15px 'serif'");
        btn_back.setOnAction(event -> primaryStage.setScene(Home_window));

        Label lblMonthly_pay = new Label(" Monthly Pay: ");
        lblMonthly_pay.setLayoutX(400);
        lblMonthly_pay.setLayoutY(50);
        lblMonthly_pay.setStyle("-fx-background-color:#00e600; -fx-min-width:345;-fx-text-fill:white; " +
                "-fx-font: normal bold 20px 'Arial'; -fx-font_color:white;");

        Label lblHouse_price = new Label("House Price");
        lblHouse_price.setLayoutX(400);
        lblHouse_price.setLayoutY(100);
        lblHouse_price.setStyle("-fx-background-color:lightgrey; -fx-min-width:265; -fx-font: normal bold 15px 'serif';");

        Label lblHouse_price_2 = new Label(" ");
        lblHouse_price_2.setLayoutX(670);
        lblHouse_price_2.setLayoutY(100);
        lblHouse_price_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:80; -fx-font: normal bold 15px 'serif';");

        Label lblLoan_amount = new Label(" Loan Amount ");
        lblLoan_amount.setLayoutX(400);
        lblLoan_amount.setLayoutY(140);

        Label lblLoan_amount_2 = new Label(" ");
        lblLoan_amount_2.setLayoutX(670);
        lblLoan_amount_2.setLayoutY(140);

        Label lblDown_Payment = new Label(" Down Payment ");
        lblDown_Payment.setLayoutX(400);
        lblDown_Payment.setLayoutY(180);

        Label lblDown_Payment_2 = new Label(" ");
        lblDown_Payment_2.setLayoutX(670);
        lblDown_Payment_2.setLayoutY(180);

        Label lblTotal_Payments = new Label("Total of.....Mortgage Payments");
        lblTotal_Payments.setLayoutX(400);
        lblTotal_Payments.setLayoutY(220);

        Label lblTotal_Payments_2 = new Label(" ");
        lblTotal_Payments_2.setLayoutX(670);
        lblTotal_Payments_2.setLayoutY(220);

        Label lblTotal_Interest = new Label("Total Interest");
        lblTotal_Interest.setLayoutX(400);
        lblTotal_Interest.setLayoutY(260);

        Label lblTotal_Interest_2 = new Label(" ");
        lblTotal_Interest_2.setLayoutX(670);
        lblTotal_Interest_2.setLayoutY(260);

        Pane rootMortgage = new Pane();
        rootMortgage.setStyle("-fx-background-color:#b3d9ff;");


        rootMortgage.getChildren().add(lbl_Title);
        rootMortgage.getChildren().add(lblHome_price);
        rootMortgage.getChildren().add(textHome_price);
        rootMortgage.getChildren().add(lblDown_payment);
        rootMortgage.getChildren().add(textDown_payment);
        rootMortgage.getChildren().add(combo_1);
        rootMortgage.getChildren().add(lblLoan_term);
        rootMortgage.getChildren().add(textLoan_term);
        rootMortgage.getChildren().add(lblInterest_rate);
        rootMortgage.getChildren().add(textInterest_rate);
        rootMortgage.getChildren().add(btnMort_Calculator);
        rootMortgage.getChildren().add(btn_back);
        rootMortgage.getChildren().add(lblMonthly_pay);
        rootMortgage.getChildren().add(lblHouse_price);
        rootMortgage.getChildren().add(lblHouse_price_2);
        rootMortgage.getChildren().add(lblLoan_amount);
        rootMortgage.getChildren().add(lblLoan_amount_2);
        rootMortgage.getChildren().add(lblDown_Payment);
        rootMortgage.getChildren().add(lblDown_Payment_2);
        rootMortgage.getChildren().add(lblTotal_Payments);
        rootMortgage.getChildren().add(lblTotal_Payments_2);
        rootMortgage.getChildren().add(lblTotal_Interest);
        rootMortgage.getChildren().add(lblTotal_Interest_2);


        pop_up_key(textHome_price, rootMortgage, 130, 350);
        pop_up_key(textDown_payment, rootMortgage, 130, 350);
        pop_up_key(textLoan_term, rootMortgage, 130, 350);
        pop_up_key(textInterest_rate, rootMortgage, 130, 350);


        Mortgage_window = new Scene(rootMortgage, 755, 600);

        DecimalFormat decimal = new DecimalFormat("###,###,##0.00");

        btnMort_Calculator.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                int LoanTermMonths = Integer.parseInt(textLoan_term.getText()) * 12;
                lblTotal_Payments.setText("Total of " + LoanTermMonths + "  Mortgage Payments");

                double Total_Price = Double.parseDouble(textHome_price.getText());
                double Down_payment;

                if (combo_1.getValue().equals("%")) {
                    Down_payment = Double.parseDouble(textHome_price.getText()) * Double.parseDouble(textDown_payment.getText()) * 0.01;
                } else {
                    Down_payment = Double.parseDouble(textDown_payment.getText());
                }

                double P = Total_Price - Down_payment;

                double Loan_Term = Double.parseDouble(textLoan_term.getText());
                double n = Loan_Term * 12;

                double Annual_Interest_Rate = Double.parseDouble(textInterest_rate.getText()) * 0.01;
                double r = Annual_Interest_Rate / 12;

                double A = (P * r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);

                lblMonthly_pay.setText("Monthly Pay :             $" + decimal.format(A));

                lblHouse_price_2.setText("$" + decimal.format(Total_Price));
                lblLoan_amount_2.setText("$" + decimal.format(P));
                lblDown_Payment_2.setText("$" + decimal.format(Down_payment));
                lblTotal_Payments_2.setText("$" + decimal.format(A * LoanTermMonths));
                lblTotal_Interest_2.setText("$" + decimal.format(A * LoanTermMonths - P));
            }
        });

        //-------------------------------------------------------------Finance Calculator-----------------------------------------------------------------------------------//


        Label lblTitle_2 = new Label("Modify the values and click the Calculate button to use");
        lblTitle_2.setLayoutX(0);
        lblTitle_2.setLayoutY(10);
        lblTitle_2.setStyle("-fx-background-color:blue; -fx-alignment:center; -fx-min-width:800; -fx-text-fill:white;  -fx-font: normal bold 20px 'serif'");


        Label lblNoPeriods = new Label("N(# of periods)");
        lblNoPeriods.setLayoutX(40);
        lblNoPeriods.setLayoutY(40);

        TextField txtNoPeriods = new TextField("");
        txtNoPeriods.setLayoutX(200);
        txtNoPeriods.setLayoutY(40);

        Label lblStart = new Label("Start Principal");
        lblStart.setLayoutX(40);
        lblStart.setLayoutY(80);

        TextField txtStart = new TextField("");
        txtStart.setLayoutX(200);
        txtStart.setLayoutY(80);

        Label lblInterest = new Label("I/Y(Interest)");
        lblInterest.setLayoutX(40);
        lblInterest.setLayoutY(120);

        TextField txtInterest = new TextField("");
        txtInterest.setLayoutX(200);
        txtInterest.setLayoutY(120);

        Label lblFuture_Val = new Label("FV(Future Value)");
        lblFuture_Val.setLayoutX(40);
        lblFuture_Val.setLayoutY(160);

        TextField txtFuture_Val = new TextField("");
        txtFuture_Val.setLayoutX(200);
        txtFuture_Val.setLayoutY(160);

        Label lblAnnuity_Pay = new Label("PMT(Annuity Payment)");
        lblAnnuity_Pay.setLayoutX(40);
        lblAnnuity_Pay.setLayoutY(200);

        TextField txtAnnuity_Pay = new TextField("");
        txtAnnuity_Pay.setLayoutX(200);
        txtAnnuity_Pay.setLayoutY(200);

        Button btn_Submit = new Button("Calculate");
        btn_Submit.setLayoutX(40);
        btn_Submit.setLayoutY(300);
        btn_Submit.setStyle("-fx-background-color:#bfff00;-fx-min-width:100; -fx-font: normal bold 15px 'serif'");

        Button btnFin_Back = new Button("Back");
        btnFin_Back.setLayoutX(250);
        btnFin_Back.setLayoutY(300);
        btnFin_Back.setStyle("-fx-background-color:#bfff00;-fx-min-width:100; -fx-font: normal bold 15px 'serif'");
        btnFin_Back.setOnAction(event -> primaryStage.setScene(Home_window));

        Label lblResult = new Label("Results ");
        lblResult.setLayoutX(400);
        lblResult.setLayoutY(40);
        lblResult.setStyle("-fx-background-color:#00e600; -fx-min-width:400;-fx-text-fill:white; -fx-font: normal bold 20px 'Arial'; -fx-font_color:white;");

        Label lblFuture = new Label("FV(Future Value)");
        lblFuture.setLayoutX(400);
        lblFuture.setLayoutY(65);
        lblFuture.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblFuture_2 = new Label(" ");
        lblFuture_2.setLayoutX(700);
        lblFuture_2.setLayoutY(65);
        lblFuture_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100; -fx-font: normal bold 15px 'serif';");

        Label lblPresent = new Label("PV(Present Value)");
        lblPresent.setLayoutX(400);
        lblPresent.setLayoutY(85);
        lblPresent.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblPresent_2 = new Label(" ");
        lblPresent_2.setLayoutX(700);
        lblPresent_2.setLayoutY(85);
        lblPresent_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100; -fx-font: normal bold 15px 'serif';");

        Label lblNumber = new Label("N(Number of Periods)");
        lblNumber.setLayoutX(400);
        lblNumber.setLayoutY(105);
        lblNumber.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblNumber_2 = new Label(" ");
        lblNumber_2.setLayoutX(700);
        lblNumber_2.setLayoutY(105);
        lblNumber_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100; -fx-font: normal bold 15px 'serif';");

        Label lblRate = new Label("I/Y(Interest Rate)");
        lblRate.setLayoutX(400);
        lblRate.setLayoutY(125);
        lblRate.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblRate_2 = new Label(" ");
        lblRate_2.setLayoutX(700);
        lblRate_2.setLayoutY(125);
        lblRate_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100; -fx-font: normal bold 15px 'serif';");

        Label lblPeriodic = new Label("PMT(Periodic Payment)");
        lblPeriodic.setLayoutX(400);
        lblPeriodic.setLayoutY(145);
        lblPeriodic.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblPeriodic_2 = new Label(" ");
        lblPeriodic_2.setLayoutX(700);
        lblPeriodic_2.setLayoutY(145);
        lblPeriodic_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100; -fx-font: normal bold 15px 'serif';");

        Label lblString = new Label("String Investment");
        lblString.setLayoutX(400);
        lblString.setLayoutY(165);
        lblString.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblString_2 = new Label(" ");
        lblString_2.setLayoutX(700);
        lblString_2.setLayoutY(165);
        lblString_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100; -fx-font: normal bold 15px 'serif';");

        Label lblTotal_Pri = new Label("Total Principal");
        lblTotal_Pri.setLayoutX(400);
        lblTotal_Pri.setLayoutY(185);
        lblTotal_Pri.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblTotal_Pri_2 = new Label(" ");
        lblTotal_Pri_2.setLayoutX(700);
        lblTotal_Pri_2.setLayoutY(185);
        lblTotal_Pri_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100; -fx-font: normal bold 15px 'serif';");

        Label lblTotal_Int = new Label("Total Interest");
        lblTotal_Int.setLayoutX(400);
        lblTotal_Int.setLayoutY(205);
        lblTotal_Int.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblTotal_Int_2 = new Label(" ");
        lblTotal_Int_2.setLayoutX(700);
        lblTotal_Int_2.setLayoutY(205);
        lblTotal_Int_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100; -fx-font: normal bold 15px 'serif';");


        Pane rootFinance = new Pane();
        rootFinance.setStyle("-fx-background-color:#b3d9ff;");

        rootFinance.getChildren().add(lblTitle_2);
        rootFinance.getChildren().add(lblNoPeriods);
        rootFinance.getChildren().add(txtNoPeriods);
        rootFinance.getChildren().add(lblStart);
        rootFinance.getChildren().add(txtStart);
        rootFinance.getChildren().add(lblInterest);
        rootFinance.getChildren().add(txtInterest);
        rootFinance.getChildren().add(lblFuture_Val);
        rootFinance.getChildren().add(txtFuture_Val);
        rootFinance.getChildren().add(btn_Submit);
        rootFinance.getChildren().add(lblResult);
        rootFinance.getChildren().add(lblFuture);
        rootFinance.getChildren().add(lblFuture_2);
        rootFinance.getChildren().add(lblPresent);
        rootFinance.getChildren().add(lblPresent_2);
        rootFinance.getChildren().add(lblNumber);
        rootFinance.getChildren().add(lblNumber_2);
        rootFinance.getChildren().add(lblRate);
        rootFinance.getChildren().add(lblRate_2);
        rootFinance.getChildren().add(lblPeriodic);
        rootFinance.getChildren().add(lblPeriodic_2);
        rootFinance.getChildren().add(lblString);
        rootFinance.getChildren().add(lblString_2);
        rootFinance.getChildren().add(lblTotal_Pri);
        rootFinance.getChildren().add(lblTotal_Pri_2);
        rootFinance.getChildren().add(lblTotal_Int);
        rootFinance.getChildren().add(lblTotal_Int_2);
        rootFinance.getChildren().add(lblAnnuity_Pay);
        rootFinance.getChildren().add(txtAnnuity_Pay);
        rootFinance.getChildren().add(btnFin_Back);


        pop_up_key(txtNoPeriods, rootFinance, 400, 250);
        pop_up_key(txtStart, rootFinance, 400, 250);
        pop_up_key(txtInterest, rootFinance, 400, 250);
        pop_up_key(txtFuture_Val, rootFinance, 400, 250);
        pop_up_key(txtAnnuity_Pay, rootFinance, 400, 250);


        Finance_window = new Scene(rootFinance, 800, 500);


        //----------------------------------------------------------------Auto Loan Calculator-------------------------------------------------------------------//


        primaryStage.setTitle("Finance Calculator");

        AnchorPane root_Auto_loan = new AnchorPane();
        root_Auto_loan.setStyle("-fx-background-color:#b3d9ff;");


        Label lbl_title = new Label("Modify the values and click the Calculate button to use");
        lbl_title.setLayoutX(0);
        lbl_title.setLayoutY(10);
        lbl_title.setStyle("-fx-background-color:blue; -fx-alignment:center; -fx-min-width:800; -fx-text-fill:white;  -fx-font: normal bold 20px 'serif'");


        Label lblAuto = new Label("Auto Price");
        lblAuto.setLayoutX(40);
        lblAuto.setLayoutY(60);

        TextField txtAuto = new TextField("");
        txtAuto.setLayoutX(150);
        txtAuto.setLayoutY(60);

        Label lblLoan = new Label("Loan Term");
        lblLoan.setLayoutX(40);
        lblLoan.setLayoutY(100);

        TextField txtLoan = new TextField("");
        txtLoan.setLayoutX(150);
        txtLoan.setLayoutY(100);

        Label lbl_Interest = new Label("Interest Rate");
        lbl_Interest.setLayoutX(40);
        lbl_Interest.setLayoutY(140);

        TextField txt_Interest = new TextField("");
        txt_Interest.setLayoutX(150);
        txt_Interest.setLayoutY(140);

        Label lblDown = new Label("Down Payment");
        lblDown.setLayoutX(40);
        lblDown.setLayoutY(180);

        TextField txtDown = new TextField("");
        txtDown.setLayoutX(150);
        txtDown.setLayoutY(180);

        Label lblTrade = new Label("Trade-in Value");
        lblTrade.setLayoutX(40);
        lblTrade.setLayoutY(220);

        TextField txtTrade = new TextField("");
        txtTrade.setLayoutX(150);
        txtTrade.setLayoutY(220);

        Label lblSales = new Label("Sales Tax");
        lblSales.setLayoutX(40);
        lblSales.setLayoutY(260);

        TextField txtSales = new TextField("");
        txtSales.setLayoutX(150);
        txtSales.setLayoutY(260);

        Label lblRegistration = new Label("Title,Registration");
        lblRegistration.setLayoutX(40);
        lblRegistration.setLayoutY(300);

        Label lblRegistration_2 = new Label("and Other Fees");
        lblRegistration_2.setLayoutX(40);
        lblRegistration_2.setLayoutY(313);

        TextField txtRegistration = new TextField("");
        txtRegistration.setLayoutX(150);
        txtRegistration.setLayoutY(300);

        Button btn_auto_cal = new Button("Calculate");
        btn_auto_cal.setLayoutX(40);
        btn_auto_cal.setLayoutY(380);
        btn_auto_cal.setStyle("-fx-background-color:#bfff00;;-fx-min-width:100; -fx-font: normal bold 15px 'serif'");

        Button btnAuto_back = new Button("Back");
        btnAuto_back.setLayoutX(200);
        btnAuto_back.setLayoutY(380);
        btnAuto_back.setStyle("-fx-background-color:#bfff00;-fx-min-width:100; -fx-font: normal bold 15px 'serif'");
        btnAuto_back.setOnAction(event -> primaryStage.setScene(Home_window));


        Label lblMonthly_Pay = new Label(" Monthly Pay: ");
        lblMonthly_Pay.setLayoutX(400);
        lblMonthly_Pay.setLayoutY(40);
        lblMonthly_Pay.setStyle("-fx-background-color:#00e600; -fx-min-width:400;-fx-text-fill:white; -fx-font: normal bold 20px 'Arial'; -fx-font_color:white;");

        Label lblTotal_Loan = new Label("Total Loan Amount");
        lblTotal_Loan.setLayoutX(400);
        lblTotal_Loan.setLayoutY(80);
        lblTotal_Loan.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblTotal_Loan_2 = new Label(" ");
        lblTotal_Loan_2.setLayoutX(700);
        lblTotal_Loan_2.setLayoutY(80);
        lblTotal_Loan_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100;");

        Label lblSale_Tax = new Label("Sale Tax");
        lblSale_Tax.setLayoutX(400);
        lblSale_Tax.setLayoutY(100);
        lblSale_Tax.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblSale_Tax_2 = new Label(" ");
        lblSale_Tax_2.setLayoutX(700);
        lblSale_Tax_2.setLayoutY(100);
        lblSale_Tax_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100;");

        Label lblUpfront_Payment = new Label("Upfront Payment");
        lblUpfront_Payment.setLayoutX(400);
        lblUpfront_Payment.setLayoutY(120);
        lblUpfront_Payment.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblUpfront_Payment_2 = new Label(" ");
        lblUpfront_Payment_2.setLayoutX(700);
        lblUpfront_Payment_2.setLayoutY(120);
        lblUpfront_Payment_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100;");

        Label lblTotal_payments = new Label("Total of...Loan Payments");
        lblTotal_payments.setLayoutX(400);
        lblTotal_payments.setLayoutY(180);
        lblTotal_payments.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblTotal_payments_2 = new Label(" ");
        lblTotal_payments_2.setLayoutX(700);
        lblTotal_payments_2.setLayoutY(180);
        lblTotal_payments_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100;");


        Label lblTotal_interest = new Label("Total Loan Interest");
        lblTotal_interest.setLayoutX(400);
        lblTotal_interest.setLayoutY(200);
        lblTotal_interest.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblTotal_interest_2 = new Label(" ");
        lblTotal_interest_2.setLayoutX(700);
        lblTotal_interest_2.setLayoutY(200);
        lblTotal_interest_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100;");

        Label lblTotal_Cost = new Label("Total Cost(price,interest,tax,fees)");
        lblTotal_Cost.setLayoutX(400);
        lblTotal_Cost.setLayoutY(220);
        lblTotal_Cost.setStyle("-fx-background-color:lightgrey; -fx-min-width:298;");

        Label lblTotal_Cost_2 = new Label(" ");
        lblTotal_Cost_2.setLayoutX(700);
        lblTotal_Cost_2.setLayoutY(220);
        lblTotal_Cost_2.setStyle("-fx-background-color:lightgrey; -fx-min-width:100;");


        root_Auto_loan.getChildren().add(lblAuto);
        root_Auto_loan.getChildren().add(txtAuto);
        root_Auto_loan.getChildren().add(lblLoan);
        root_Auto_loan.getChildren().add(txtLoan);
        root_Auto_loan.getChildren().add(lblDown);
        root_Auto_loan.getChildren().add(txtDown);
        root_Auto_loan.getChildren().add(lbl_title);
        root_Auto_loan.getChildren().add(lbl_Interest);
        root_Auto_loan.getChildren().add(txt_Interest);
        root_Auto_loan.getChildren().add(lblTrade);
        root_Auto_loan.getChildren().add(txtTrade);
        root_Auto_loan.getChildren().add(lblSales);
        root_Auto_loan.getChildren().add(txtSales);
        root_Auto_loan.getChildren().add(lblRegistration);
        root_Auto_loan.getChildren().add(lblRegistration_2);
        root_Auto_loan.getChildren().add(txtRegistration);
        root_Auto_loan.getChildren().add(btn_auto_cal);
        root_Auto_loan.getChildren().add(lblMonthly_Pay);
        root_Auto_loan.getChildren().add(lblTotal_Loan);
        root_Auto_loan.getChildren().add(lblTotal_Loan_2);
        root_Auto_loan.getChildren().add(lblSale_Tax);
        root_Auto_loan.getChildren().add(lblSale_Tax_2);
        root_Auto_loan.getChildren().add(lblUpfront_Payment);
        root_Auto_loan.getChildren().add(lblUpfront_Payment_2);
        root_Auto_loan.getChildren().add(lblTotal_payments);
        root_Auto_loan.getChildren().add(lblTotal_payments_2);
        root_Auto_loan.getChildren().add(lblTotal_interest);
        root_Auto_loan.getChildren().add(lblTotal_interest_2);
        root_Auto_loan.getChildren().add(lblTotal_Cost);
        root_Auto_loan.getChildren().add(lblTotal_Cost_2);
        root_Auto_loan.getChildren().add(btnAuto_back);


        pop_up_key(txtLoan, root_Auto_loan, 400, 300);
        pop_up_key(txtAuto, root_Auto_loan, 400, 300);
        pop_up_key(txtDown, root_Auto_loan, 400, 300);
        pop_up_key(txt_Interest, root_Auto_loan, 400, 300);
        pop_up_key(txtTrade, root_Auto_loan, 400, 300);
        pop_up_key(txtSales, root_Auto_loan, 400, 300);
        pop_up_key(txtRegistration, root_Auto_loan, 400, 300);


        AutoLone_window = new Scene(root_Auto_loan, 800, 550);


        btn_auto_cal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                lblTotal_payments.setText("Total of " + txtLoan.getText() + " Loan Payments");

                double Auto_Price = Double.parseDouble(txtAuto.getText());
                double Down_Payment = Double.parseDouble(txtDown.getText());
                double Tread_In_Value = Double.parseDouble(txtTrade.getText());
                double Loan_present_Val = Auto_Price - Down_Payment - Tread_In_Value;

                double Loan_t = Double.parseDouble(txtLoan.getText());
                double Loan_Interest_Rate = Double.parseDouble(txt_Interest.getText());
                double Loan_r = (Loan_Interest_Rate * 0.01) / 12;

                double PMT;
                PMT = (Loan_present_Val * Loan_r * Math.pow((1 + Loan_r), Loan_t)) / (Math.pow((1 + Loan_r), Loan_t) - 1);

                lblMonthly_Pay.setText("Monthly Pay :  $" + decimal.format(PMT));

                lblTotal_Loan_2.setText("$" + decimal.format(Loan_present_Val));

                double Sales_Tax_Percentage = Double.parseDouble(txtSales.getText()) * 0.01;
                double Sales_Tax = (Auto_Price - Tread_In_Value) * Sales_Tax_Percentage;
                lblSale_Tax_2.setText("$ " + decimal.format(Sales_Tax));

                double Other_Fees = Double.parseDouble(txtRegistration.getText());
                lblUpfront_Payment_2.setText("$ " + decimal.format(Down_Payment + Other_Fees + Sales_Tax));

                double Number_of_Months = Double.parseDouble(txtLoan.getText());
                double Tot_Num_of_Months = PMT * Number_of_Months;
                lblTotal_payments_2.setText("$ " + decimal.format(Tot_Num_of_Months));

                lblTotal_interest_2.setText("$ " + decimal.format(Tot_Num_of_Months - Loan_present_Val));

                lblTotal_Cost_2.setText("$ " + decimal.format(Auto_Price + (Tot_Num_of_Months - Loan_present_Val) + Sales_Tax + Other_Fees));

            }
        });


        //-----------------------------------------------------------------------Help--------------------------------------------------------------------------------------------------//


        Pane rootHelp = new Pane();
        rootHelp.setStyle("-fx-background-color:#b3d9ff;");


        Label lblHelp = new Label("HELP");
        lblHelp.setLayoutX(0);
        lblHelp.setLayoutY(10);
        lblHelp.setStyle("-fx-background-color:#3333cc; -fx-alignment:center; -fx-min-width:550; " +
                " -fx-text-fill:white; -fx-font: normal bold 18px 'serif'");

        Label lblHelp_1 = new Label("1) Click the Calculator button to get the result.");
        lblHelp_1.setLayoutX(40);
        lblHelp_1.setLayoutY(60);
        lblHelp_1.setStyle("-fx-font-size:15");

        Label lblHelp_2 = new Label("2) Click the Back button to go back to the first window.");
        lblHelp_2.setLayoutX(40);
        lblHelp_2.setLayoutY(100);
        lblHelp_2.setStyle("-fx-font-size:15");

        Label lblHelp_3 = new Label("3) Click on any text field to get the keyboard.");
        lblHelp_3.setLayoutX(40);
        lblHelp_3.setLayoutY(140);
        lblHelp_3.setStyle("-fx-font-size:15");

        Label lblHelp_4 = new Label("4) Use the pop-up keyboard to enter the details. ");
        lblHelp_4.setLayoutX(40);
        lblHelp_4.setLayoutY(180);
        lblHelp_4.setStyle("-fx-font-size:15");

        Label lblHelp_5 = new Label("5) Click the Close button to exit.");
        lblHelp_5.setLayoutX(40);
        lblHelp_5.setLayoutY(220);
        lblHelp_5.setStyle("-fx-font-size:15");

        Button btnHelp_back = new Button("Back");
        btnHelp_back.setLayoutX(400);
        btnHelp_back.setLayoutY(280);
        btnHelp_back.setStyle("-fx-background-color:#bfff00;-fx-min-width:100; -fx-font: normal bold 15px 'serif'");
        btnHelp_back.setOnAction(event -> primaryStage.setScene(Home_window));


        rootHelp.getChildren().addAll(lblHelp, lblHelp_1, lblHelp_2, lblHelp_3, lblHelp_4, lblHelp_5, btnHelp_back);

        Help_window = new Scene(rootHelp, 550, 350);


     //----------------------------------------------------------------------History-----------------------------------------------------------------------------------//


        Pane rootHistory = new Pane();
        rootHistory.setStyle("-fx-background-color:#b3d9ff;");


        Label lblHistory = new Label("Histoty");
        lblHistory.setLayoutX(0);
        lblHistory.setLayoutY(10);
        lblHistory.setStyle("-fx-background-color:#3333cc; -fx-alignment:center; -fx-min-width:600; " +
                " -fx-text-fill:white; -fx-font: normal bold 18px 'serif'");


        TextArea textArea_History = new TextArea();
        textArea_History.setLayoutX(10);
        textArea_History.setLayoutY(50);
        textArea_History.setPrefSize(580,300);

        Button btnHistory_Back = new Button("Back");
        btnHistory_Back.setLayoutX(500);
        btnHistory_Back.setLayoutY(400);
        btnHistory_Back.setOnAction(event -> primaryStage.setScene(Home_window));
        btnHistory_Back.setStyle("-fx-background-color:#bfff00;-fx-min-width:100; -fx-font: normal bold 15px 'serif'");

        rootHistory.getChildren().addAll(lblHistory,textArea_History,btnHistory_Back);

        History_window = new Scene(rootHistory,600,500);

    }

    //-------------------------------------------------------------------Pop-up keyboard-------------------------------------------------------------------------//


    void pop_up_key(TextField x, Pane panePOPKEY, int xAxis, int yAxis) {

        x.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                Button btnKEY_1 = new Button("1");
                btnKEY_1.setLayoutX(xAxis);
                btnKEY_1.setLayoutY(yAxis);
                btnKEY_1.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:20; -fx-font-size:20;");


                btnKEY_1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text + "1");
                    }
                });

                Button btnKEY_2 = new Button("2");
                btnKEY_2.setLayoutX(xAxis + 60);
                btnKEY_2.setLayoutY(yAxis);
                btnKEY_2.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:20; -fx-font-size:20;");


                btnKEY_2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text + "2");
                    }
                });

                Button btnKEY_3 = new Button("3");
                btnKEY_3.setLayoutX(xAxis + 120);
                btnKEY_3.setLayoutY(yAxis);
                btnKEY_3.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:20; -fx-font-size:20;");


                btnKEY_3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text + "3");
                    }
                });

                Button btnKEY_4 = new Button("4");
                btnKEY_4.setLayoutX(xAxis);
                btnKEY_4.setLayoutY(yAxis + 60);
                btnKEY_4.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:20; -fx-font-size:20;");


                btnKEY_4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text + "4");
                    }
                });

                Button btnKEY_5 = new Button("5");
                btnKEY_5.setLayoutX(xAxis + 60);
                btnKEY_5.setLayoutY(yAxis + 60);
                btnKEY_5.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:20; -fx-font-size:20;");


                btnKEY_5.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text + "5");
                    }
                });

                Button btnKEY_6 = new Button("6");
                btnKEY_6.setLayoutX(xAxis + 120);
                btnKEY_6.setLayoutY(yAxis + 60);
                btnKEY_6.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:20; -fx-font-size:20;");

                btnKEY_6.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text + "6");
                    }
                });

                Button btnKEY_7 = new Button("7");
                btnKEY_7.setLayoutX(xAxis);
                btnKEY_7.setLayoutY(yAxis + 120);
                btnKEY_7.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:20; -fx-font-size:20;");


                btnKEY_7.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text + "7");
                    }
                });

                Button btnKEY_8 = new Button("8");
                btnKEY_8.setLayoutX(xAxis + 60);
                btnKEY_8.setLayoutY(yAxis + 120);
                btnKEY_8.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:20; -fx-font-size:20;");


                btnKEY_8.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text + "8");
                    }
                });

                Button btnKEY_9 = new Button("9");
                btnKEY_9.setLayoutX(xAxis + 120);
                btnKEY_9.setLayoutY(yAxis + 120);
                btnKEY_9.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:20; -fx-font-size:20;");


                btnKEY_9.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text + "9");
                    }
                });

                Button btnKEY_0 = new Button("0");
                btnKEY_0.setLayoutX(xAxis + 60);
                btnKEY_0.setLayoutY(yAxis + 180);
                btnKEY_0.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:20; -fx-font-size:20;");


                btnKEY_0.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text + "0");
                    }
                });

                Button btnKEY_decimal = new Button(".");
                btnKEY_decimal.setLayoutX(xAxis);
                btnKEY_decimal.setLayoutY(yAxis + 180);
                btnKEY_decimal.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:20; -fx-font-size:20;");
                btnKEY_decimal.setPrefSize(40, 40);


                btnKEY_decimal.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text + ".");
                    }
                });

                Button btnKEY_Clear = new Button("⬅");
                btnKEY_Clear.setLayoutX(xAxis + 120);
                btnKEY_Clear.setLayoutY(yAxis + 180);
                btnKEY_Clear.setStyle("-fx-background-color:#ffd11a; -fx-background-radius:18; -fx-font-size:18;");


                btnKEY_Clear.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = x.getText();
                        x.setText(text.substring(0, text.length() - 1));
                    }
                });

                panePOPKEY.getChildren().addAll(btnKEY_0, btnKEY_1, btnKEY_2, btnKEY_3, btnKEY_4, btnKEY_5, btnKEY_6, btnKEY_7, btnKEY_8, btnKEY_9, btnKEY_Clear, btnKEY_decimal);
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}