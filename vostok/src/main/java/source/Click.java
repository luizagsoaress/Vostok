package source;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Click {

        public void acaoS0(Button[] btn) throws Exception {

            Screens screens = new Screens();

            for (int i = 0; i < btn.length; i++) {
                final int index = i;
                final Button current = btn[index];
                current.setOnAction(event -> {
                    try {
                        HBox nextScreen = null;
                        switch(index) {
                            case 0:
                                nextScreen = screens.S1();
                                break;
                            case 1:
                                nextScreen = screens.S2();
                                break;
                            case 2:
                                nextScreen = screens.S3();
                                break;   
                        }
                        if (nextScreen != null) current.getScene().setRoot(nextScreen);
                    } catch (Exception e) {
                        System.err.println("Erro ao abrir tela: " + e.getMessage());
                    }
                });
            }

        }   

        public void acaoS1(Button[] btn) throws Exception {

            Screens screens = new Screens();
 
            for (int i = 0; i < btn.length; i++) {
                final int index = i;
                final Button current = btn[index];
                current.setOnAction(event -> {
                    try {
                        HBox nextScreen = null;
                        switch(index) {
                            case 0:
                                nextScreen = screens.S4();
                                break;
                            case 1:
                                nextScreen = screens.S5();
                                break;
                            case 2:
                                nextScreen = screens.S6();
                                break;
                            case 3:
                                nextScreen = screens.S7();
                                break;
                            case 4:
                                nextScreen = screens.S0();
                                break;
                        }
                        if (nextScreen != null) current.getScene().setRoot(nextScreen);
                    } catch (Exception e) {
                        //e.printStackTrace();
                        System.err.println("Erro ao abrir tela: " + e.getMessage());
                    }
                });
            }

        }   

}