package source;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.AmbientLight;
import javafx.scene.Group;
import javafx.scene.PointLight;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;

public class Screens {

        public Button[] arrayBtnS0 = new Button[3];
        public Button[] arrayBtnS1 = new Button[5];
        public int x = 0;

        public HBox S0 () throws Exception {

            Button btn1 = new Button();
            btn1.setPrefSize(275,40);
            btn1.setText("Iniciar");
            btn1.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");

            Button btn2 = new Button();
            btn2.setPrefSize(275,40);
            btn2.setText("Saiba mais");
            btn2.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");

            Button btn3 = new Button();
            btn3.setPrefSize(275,40);
            btn3.setText("Contato");
            btn3.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");

            arrayBtnS0[0] = btn1;
            arrayBtnS0[1] = btn2;
            arrayBtnS0[2] = btn3;

            Click click = new Click();
            click.acaoS0(arrayBtnS0); 

            Text logoNome = new Text();
            logoNome.setText("V  O  S  T  O  K");
            logoNome.setStyle("-fx-fill: #fff; -fx-font-weight: 900; -fx-font-size: 25px;");
            logoNome.setFont(Font.font("JetBrains Mono", 24));

            HBox logoContainer = new HBox(15);
            logoContainer.setAlignment(Pos.CENTER);
            logoContainer.getChildren().addAll(logoNome);
            logoContainer.setPrefSize(400, 200);

            VBox btnContainer = new VBox(15);
            btnContainer.setAlignment(Pos.TOP_CENTER);
            btnContainer.getChildren().addAll(btn1, btn2, btn3);
            btnContainer.setPrefSize(400, 400);

            VBox optContainer = new VBox(15);
            optContainer.setAlignment(Pos.CENTER);
            optContainer.getChildren().addAll(logoContainer, btnContainer);
            optContainer.setPrefSize(400, 600);
            optContainer.setMaxWidth(400);

            Image imagem = new Image("telas/sat_0.jpg");
            ImageView imageView = new ImageView(imagem);
            imageView.setFitWidth(550);
            imageView.setFitHeight(400);

            Text legenda = new Text();
            legenda.setText("Saturn F-ring and Inner Satellite - 1999/04/11. NASA id: PIA01951.");
            legenda.setStyle("-fx-font-size: 10px; -fx-font-weight: 500; -fx-fill: white;");
            legenda.setFont(Font.font("JetBrains Mono", 10));

            VBox imgContainer = new VBox(15);
            imgContainer.setAlignment(Pos.CENTER);
            imgContainer.getChildren().addAll(imageView, legenda);                                                        
            HBox root = new HBox(15); 
            root.setAlignment(Pos.CENTER);
            root.getChildren().addAll(imgContainer, optContainer);
            root.setStyle("-fx-background-color: #000;");

            return root;

        }

        public HBox S1 () throws Exception {

            Button btn1 = new Button();
            btn1.setPrefSize(330,40);
            btn1.setText("Imagem do dia (NASA)");
            btn1.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");

            Button btn2 = new Button();
            btn2.setPrefSize(330,40);
            btn2.setText("Asteroídes próximos da terra (NASA)");
            btn2.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");

            Button btn3 = new Button();
            btn3.setPrefSize(330,40);
            btn3.setText("Últimas erupções solares registradas (NASA)");
            btn3.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");
            
            Button btn4 = new Button();
            btn4.setPrefSize(330,40);
            btn4.setText("Notificação (NASA)");
            btn4.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");

            Button btn5 = new Button();
            btn5.setPrefSize(330,40);
            btn5.setText("Voltar para o ínicio");
            btn5.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");

            arrayBtnS1[0] = btn1;
            arrayBtnS1[1] = btn2;
            arrayBtnS1[2] = btn3;
            arrayBtnS1[3] = btn4;
            arrayBtnS1[4] = btn5;

            Click click = new Click();
            click.acaoS1(arrayBtnS1); 

            VBox btnContainer = new VBox(15);
            btnContainer.setAlignment(Pos.CENTER);
            btnContainer.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);
            btnContainer.setPrefSize(400, 400);

            HBox root = new HBox(15); 
            root.setAlignment(Pos.CENTER);
            root.getChildren().addAll(btnContainer);
            root.setStyle("-fx-background-color: #000;");

            return root;
            
        }

        public HBox S2 () {

            VBox textoContainer = new VBox(15);
            textoContainer.setPrefSize(1000, 600);
            textoContainer.setAlignment(Pos.CENTER);

            VBox p1Container = new VBox(15);
            p1Container.setAlignment(Pos.TOP_CENTER);
            p1Container.setPadding(new Insets(0, 0, 0, 25));
            p1Container.setPrefSize(800, 50);

            VBox p2Container = new VBox(15);
            p2Container.setAlignment(Pos.TOP_CENTER);
            p2Container.setPadding(new Insets(0, 0, 0, 25));
            p2Container.setPrefSize(800, 100);

            Label p1 = new Label("Vostok é um projeto de software de código aberto, voltado a exibir de maneira acessível diversos dados da NASA, como imagens, erupções solares recentes, asteroides monitorados e etc. Exemplo: Imagem do dia.");
            Label p2 = new Label("Desenvolvido como projeto de estudos, o nome foi inspirado na série de 'spacecrafts' soviéticas, responsável por levar o primeiro ser humano (Yury A. Gagarin) para o espaço. Para manter o projeto ativo, novas features serão adicionadas mensalmente no dia 03.");
            p1.setWrapText(true);
            p1.setMaxWidth(500);
            p1.setPrefWidth(300);
            p2.setWrapText(true);
            p2.setMaxWidth(500);
            p2.setPrefWidth(300);
            p1.setStyle("-fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");
            p2.setStyle("-fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");

            Button voltarBtn = new Button();
            voltarBtn.setText("Tela anterior");
            voltarBtn.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");
            voltarBtn.setPrefSize(200,30);

            Screens screensRef = this;  
            voltarBtn.setOnAction(event -> {
                HBox s0Screen;
                try {
                    s0Screen = screensRef.S0();
                    voltarBtn.getScene().setRoot(s0Screen);
                } catch (Exception e) {
                    System.out.println("Erro ao voltar!");
                }
            });

            p1Container.getChildren().addAll(p1);
            p2Container.getChildren().addAll(p2);
            textoContainer.getChildren().addAll(p1Container, p2Container, voltarBtn);

            HBox root = new HBox(15); 
            root.setAlignment(Pos.CENTER);
            root.getChildren().addAll(textoContainer);
            root.setStyle("-fx-background-color: #000;");

            return root;

        }

        public HBox S3 () {

            VBox textoContainer = new VBox(30);
            textoContainer.setPrefSize(1000, 600);
            textoContainer.setAlignment(Pos.CENTER);

            VBox p1Container = new VBox(15);
            p1Container.setAlignment(Pos.TOP_CENTER);
            p1Container.setPadding(new Insets(0, 0, 0, 25));
            p1Container.setPrefSize(800, 50);

            Label p1 = new Label("Em caso de dúvidas ou sugestões, mande mensagem para o meu Gmail edensjaks@gmail.com. Você pode entrar em contato pelo Github também, usuário @luizagsoaress.");
            p1.setWrapText(true);
            p1.setMaxWidth(500);
            p1.setPrefWidth(300);
            p1.setStyle("-fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");

            Button voltarBtn = new Button();
            voltarBtn.setText("Tela anterior");
            voltarBtn.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");
            voltarBtn.setPrefSize(200,30);

            Screens screensRef = this;  
            voltarBtn.setOnAction(event -> {
                HBox s0Screen;
                try {
                    s0Screen = screensRef.S0();
                    voltarBtn.getScene().setRoot(s0Screen);
                } catch (Exception e) {
                    System.out.println("Erro ao voltar!");
                }
            });

            VBox btnContainer = new VBox();
            btnContainer.setAlignment(Pos.CENTER);
            btnContainer.setPadding(new Insets(0, 0, 0, 0));
            btnContainer.setPrefSize(800, 50);
            btnContainer.getChildren().addAll(voltarBtn);

            p1Container.getChildren().addAll(p1);
            textoContainer.getChildren().addAll(p1Container, btnContainer);

            HBox root = new HBox(15); 
            root.setAlignment(Pos.CENTER);
            root.getChildren().addAll(textoContainer);
            root.setStyle("-fx-background-color: #000;");

            return root;

        }
        
        public HBox S4 () throws Exception {

            Api api = new Api();
            String urlImagem = new String();
            String tituloImagem = new String();

            try {
                JSONObject dadosApi = api.apod();
                urlImagem = dadosApi.optString("imagem", null);
                tituloImagem = dadosApi.optString("titulo", null);

            } catch (Exception e) {
                JSONObject dadosApi = api.apod();
                String erroMsg = dadosApi.optString("error", null);
                System.err.println("Erro ao chamar API de imagem: " + erroMsg);
            }

            Button voltarBtn = new Button();
            voltarBtn.setText("Tela anterior");
            voltarBtn.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");
            voltarBtn.setPrefSize(200,30);

            Screens screensRef = this;  
            voltarBtn.setOnAction(event -> {
                HBox s1Screen;
                try {
                    s1Screen = screensRef.S1();
                    voltarBtn.getScene().setRoot(s1Screen);
                } catch (Exception e) {
                    System.out.println("Erro ao voltar!");
                }
            });

            String nullString = "NULL.";

            if(urlImagem == null || urlImagem.equals(nullString)) {
                Label erroLabel = new Label("Nenhuma imagem do dia encontrada!");
                erroLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #fff;");
                
                VBox c = new VBox(30);
                c.setAlignment(Pos.CENTER);
                c.getChildren().addAll(erroLabel, voltarBtn);
                c.setStyle("-fx-background-color: #000;");

                HBox root = new HBox();
                root.setAlignment(Pos.CENTER);
                root.getChildren().addAll(c);
                root.setStyle("-fx-background-color: #000;");
                
                return root;

            }

            Text titulo = new Text();
            titulo.setText("----- IMAGEM DO DIA -----");
            titulo.setStyle("-fx-font-size: 22px; -fx-font-weight: 900; -fx-fill: white;");
            titulo.setFont(Font.font("JetBrains Mono", 22));

            VBox tituloContainer = new VBox(15);
            tituloContainer.setAlignment(Pos.TOP_CENTER);
            tituloContainer.getChildren().addAll(titulo);
            tituloContainer.setPrefSize(1000, 40);

            Image imagem = new Image(urlImagem, true);
            ImageView imageView = new ImageView(imagem);
            imageView.setFitWidth(550);
            imageView.setFitHeight(350);

            DataD dataD = new DataD();
            String s = " - " + dataD.dataCompleta();
            System.out.println(s);

            String resultado = tituloImagem + s;

            Text legenda = new Text();
            legenda.setText(resultado);
            legenda.setStyle("-fx-font-size: 10px; -fx-font-weight: 700; -fx-fill: white;");
            legenda.setFont(Font.font("JetBrains Mono", 10));

            VBox imageContainer = new VBox(10);
            imageContainer.setAlignment(Pos.CENTER);
            imageContainer.getChildren().addAll(imageView, legenda);
            imageContainer.setPrefSize(1000, 400);

            VBox container = new VBox(15);
            container.setAlignment(Pos.CENTER);
            container.getChildren().addAll(tituloContainer, imageContainer, voltarBtn);
            container.setPrefSize(1000, 600);

            HBox root = new HBox(15); 
            root.setAlignment(Pos.CENTER);
            root.getChildren().addAll(container);
            root.setStyle("-fx-background-color: #000;");

            return root;

        }

        public HBox S5 () {

            Api api = new Api();
            ArrayList<ArrayList<String>> arrayObj = new ArrayList<>();

            try {
                JSONObject dadosApi = api.neo();
                JSONArray array = dadosApi.optJSONArray("objetos");
                
                if (array != null) {
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject item = array.getJSONObject(i);
                        ArrayList<String> linha = new ArrayList<>();
                        
                        String nome = item.optString("nome", "N/A");
                        String id = item.optString("id", "N/A");
                        String absMagnitudeH = item.optString("absMagnitudeH", "N/A");
                        String diametroKmMin = item.optString("diametroKmMin", "N/A");
                        String diametroKmMax = item.optString("diametroKmMax", "N/A");
                        String potencialmentePerigoso = item.optString("potencialmentePerigoso", "N/A");
                        String dataAproximacaoCompleta = item.optString("dataAproximacaoCompleta", "N/A");
                        String velocidadeKmHoras = item.optString("velocidadeKmHoras", "N/A");
                        String distanciaAstronomica = item.optString("distanciaAstronomica", "N/A");
                        String distanciaLunar = item.optString("distanciaLunar", "N/A");
                        String distanciaKm = item.optString("distanciaKm", "N/A");
                        String orbitaQualCorpo = item.optString("orbitaQualCorpo", "N/A");
                        String sentinelaObjeto = item.optString("sentinelaObjeto", "N/A");
                        String diametroFeetMin = item.optString("diametroFeetMin", "N/A");
                        String diametroFeetMax = item.optString("diametroFeetMax", "N/A");

                        linha.add(nome);
                        linha.add(id);
                        linha.add(absMagnitudeH);
                        linha.add(diametroKmMin);
                        linha.add(diametroKmMax);
                        linha.add(potencialmentePerigoso);
                        linha.add(dataAproximacaoCompleta);
                        linha.add(velocidadeKmHoras);
                        linha.add(distanciaAstronomica);
                        linha.add(distanciaLunar);
                        linha.add(distanciaKm);
                        linha.add(orbitaQualCorpo);
                        linha.add(sentinelaObjeto);
                        linha.add(diametroFeetMin);
                        linha.add(diametroFeetMax);

                        arrayObj.add(linha);
                    }
                }
            } catch (Exception e) {
                System.err.println("Erro ao chamar API: " + e.getMessage());
            }

            Button voltarBtn = new Button();
            voltarBtn.setText("Tela anterior");
            voltarBtn.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");
            voltarBtn.setPrefSize(200,30);

            Screens screensRef = this;  
            voltarBtn.setOnAction(event -> {
                HBox s1Screen;
                try {
                    s1Screen = screensRef.S1();
                    voltarBtn.getScene().setRoot(s1Screen);
                } catch (Exception e) {
                    System.out.println("Erro ao voltar!");
                }
            });
                
            if(arrayObj.isEmpty()) {
                Label erroLabel = new Label("Nenhum asteroide encontrado!");
                erroLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #fff;");
                
                VBox c = new VBox(30);
                c.setAlignment(Pos.CENTER);
                c.getChildren().addAll(erroLabel, voltarBtn);
                c.setStyle("-fx-background-color: #000;");

                HBox root = new HBox();
                root.setAlignment(Pos.CENTER);
                root.getChildren().addAll(c);
                root.setStyle("-fx-background-color: #000;");
                
                return root;
            }
                
            VBox legendaContainer = new VBox(10);
            legendaContainer.setAlignment(Pos.CENTER_LEFT);
            legendaContainer.setPadding(new Insets(0, 0, 0, 10));
            legendaContainer.setPrefSize(400, 600);
            legendaContainer.setStyle("-fx-background-color: #000;");

            Label infoLabel = new Label("Informações Do Asteroide " + arrayObj.get(x).get(0));
            infoLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #ff3838; -fx-font-weight: 700;");

            Label nomeLabel = new Label("Nome:");
            nomeLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label nomeValue = new Label(arrayObj.get(x).get(0));
            nomeValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox nomeBox = new HBox(5);
            nomeBox.getChildren().addAll(nomeLabel, nomeValue);

            Label idLabel = new Label("Id:");
            idLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label idValue = new Label(arrayObj.get(x).get(1));
            idValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox idBox = new HBox(5);
            idBox.getChildren().addAll(idLabel, idValue);

            Label absMagnitudeHLabel = new Label("Magnitude Absoluta:");
            absMagnitudeHLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label absMagnitudeHValue = new Label(arrayObj.get(x).get(2));
            absMagnitudeHValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox absMagnitudeHBox = new HBox(5);
            absMagnitudeHBox.getChildren().addAll(absMagnitudeHLabel, absMagnitudeHValue);

            Label diametroKmMinLabel = new Label("Diametro Minimo (Km):");
            diametroKmMinLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label diametroKmMinValue = new Label(arrayObj.get(x).get(3));
            diametroKmMinValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox diametroKmMinBox = new HBox(5);
            diametroKmMinBox.getChildren().addAll(diametroKmMinLabel, diametroKmMinValue);

            Label diametroKmMaxLabel = new Label("Diametro Máximo (Km):");
            diametroKmMaxLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label diametroKmMaxValue = new Label(arrayObj.get(x).get(4));
            diametroKmMaxValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox diametroKmMaxBox = new HBox(5);
            diametroKmMaxBox.getChildren().addAll(diametroKmMaxLabel, diametroKmMaxValue);

            Label potencialmentePerigososLabel = new Label("Potencialmente Perigoso:");
            potencialmentePerigososLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label potencialmentePerigososValue = new Label(arrayObj.get(x).get(5));
            potencialmentePerigososValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox potencialmentePerigososBox = new HBox(5);
            potencialmentePerigososBox.getChildren().addAll(potencialmentePerigososLabel, potencialmentePerigososValue);

            Label dataAproximacaoCompletaLabel = new Label("Data Completa Da Aproximação:");
            dataAproximacaoCompletaLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label dataAproximacaoCompletaValue = new Label(arrayObj.get(x).get(6));
            dataAproximacaoCompletaValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox dataAproximacaoCompletaBox = new HBox(5);
            dataAproximacaoCompletaBox.getChildren().addAll(dataAproximacaoCompletaLabel, dataAproximacaoCompletaValue);

            Label velocidadeKmHorasLabel = new Label("Velocidade Km/Hora:");
            velocidadeKmHorasLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label velocidadeKmHorasValue = new Label(arrayObj.get(x).get(7));
            velocidadeKmHorasValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox velocidadeKmHorasBox = new HBox(5);
            velocidadeKmHorasBox.getChildren().addAll(velocidadeKmHorasLabel, velocidadeKmHorasValue);

            Label distanciaAstronomicaLabel = new Label("Distância Astronomica:");
            distanciaAstronomicaLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label distanciaAstronomicaValue = new Label(arrayObj.get(x).get(8));
            distanciaAstronomicaValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox distanciaAstronomicaBox = new HBox(5);
            distanciaAstronomicaBox.getChildren().addAll(distanciaAstronomicaLabel, distanciaAstronomicaValue);

            Label distanciaLunarLabel = new Label("Distância Lunar:");
            distanciaLunarLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label distanciaLunarValue = new Label(arrayObj.get(x).get(9));
            distanciaLunarValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox distanciaLunarBox = new HBox(5);
            distanciaLunarBox.getChildren().addAll(distanciaLunarLabel, distanciaLunarValue);

            Label distanciaKmLabel = new Label("Distância (Km):");
            distanciaKmLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label distanciaKmValue = new Label(arrayObj.get(x).get(10));
            distanciaKmValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox distanciaKmBox = new HBox(5);
            distanciaKmBox.getChildren().addAll(distanciaKmLabel, distanciaKmValue);

            Label orbitaQualCorpoLabel = new Label("Orbita Qual Corpo:");
            orbitaQualCorpoLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label orbitaQualCorpoValue = new Label(arrayObj.get(x).get(11));
            orbitaQualCorpoValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox orbitaQualCorpoBox = new HBox(5);
            orbitaQualCorpoBox.getChildren().addAll(orbitaQualCorpoLabel, orbitaQualCorpoValue);

            Label sentinelaObjetoLabel = new Label("Objeto Sentinela:");
            sentinelaObjetoLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label sentinelaObjetoValue = new Label(arrayObj.get(x).get(12));
            sentinelaObjetoValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox sentinelaObjetoBox = new HBox(5);
            sentinelaObjetoBox.getChildren().addAll(sentinelaObjetoLabel, sentinelaObjetoValue);

            Label diametroFeetMinLabel = new Label("Diametro Minimo (Pés):");
            diametroFeetMinLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label diametroFeetMinValue = new Label(arrayObj.get(x).get(13));
            diametroFeetMinValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox diametroFeetMinBox = new HBox(5);
            diametroFeetMinBox.getChildren().addAll(diametroFeetMinLabel, diametroFeetMinValue);

            Label diametroFeetMaxLabel = new Label("Diametro Máximo (Pés):");
            diametroFeetMaxLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label diametroFeetMaxValue = new Label(arrayObj.get(x).get(14));
            diametroFeetMaxValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox diametroFeetMaxBox = new HBox(5);
            diametroFeetMaxBox.getChildren().addAll(diametroFeetMaxLabel, diametroFeetMaxValue);

            legendaContainer.getChildren().addAll(infoLabel, nomeBox, idBox, absMagnitudeHBox, diametroKmMinBox, diametroKmMaxBox, potencialmentePerigososBox, dataAproximacaoCompletaBox, velocidadeKmHorasBox, distanciaAstronomicaBox, distanciaLunarBox, distanciaKmBox, orbitaQualCorpoBox, sentinelaObjetoBox, diametroFeetMinBox, diametroFeetMaxBox, voltarBtn);

            Box sphere = new Box(175, 175, 175);
            PhongMaterial material = new PhongMaterial();
            material.setDiffuseColor(Color.WHITE);
            Image image = new Image("materiais/asteroid_material.jpg", true);
            material.setDiffuseMap(image);
            sphere.setMaterial(material);

            AmbientLight ambient = new AmbientLight(Color.color(0.35, 0.35, 0.35));

            PointLight light = new PointLight(Color.WHITE);
            light.setTranslateX(-150);
            light.setTranslateY(-120);
            light.setTranslateZ(-250);

            Group root = new Group(sphere, ambient, light);

            /*RotateTransition rt = new RotateTransition(javafx.util.Duration.seconds(10));
            rt.setAxis(Rotate.Y_AXIS);
            rt.setByAngle(500);
            rt.setCycleCount(Animation.INDEFINITE);
            rt.setNode(sphere);
            rt.play();*/

            HBox roothbox = new HBox(30);
            roothbox.setAlignment(Pos.CENTER);
            roothbox.getChildren().addAll(root);
            roothbox.setPrefSize(400, 600);

            Image antBtnImg = new Image("assets/seta_esq.png");
            ImageView antBtnImgView = new ImageView(antBtnImg);
            antBtnImgView.setFitWidth(20);
            antBtnImgView.setFitHeight(20);

            Button antBtn = new Button();
            antBtn.setGraphic(antBtnImgView);  
            antBtn.setPrefSize(30, 30);
            antBtn.setStyle("-fx-background-color: #000;");

            antBtn.setOnMouseClicked(event -> {
                if(x > 0) x--;
                infoLabel.setText("Informações Do Asteroide " + arrayObj.get(x).get(0));
                nomeValue.setText(arrayObj.get(x).get(0));
                idValue.setText(arrayObj.get(x).get(1));
                absMagnitudeHValue.setText(arrayObj.get(x).get(2));
                diametroKmMinValue.setText(arrayObj.get(x).get(3));
                diametroKmMaxValue.setText(arrayObj.get(x).get(4));
                potencialmentePerigososValue.setText(arrayObj.get(x).get(5));
                dataAproximacaoCompletaValue.setText(arrayObj.get(x).get(6));
                velocidadeKmHorasValue.setText(arrayObj.get(x).get(7));
                distanciaAstronomicaValue.setText(arrayObj.get(x).get(8));
                distanciaLunarValue.setText(arrayObj.get(x).get(9));
                distanciaKmValue.setText(arrayObj.get(x).get(10));
                orbitaQualCorpoValue.setText(arrayObj.get(x).get(11));
                sentinelaObjetoValue.setText(arrayObj.get(x).get(12));
                diametroFeetMinValue.setText(arrayObj.get(x).get(13));
                diametroFeetMaxValue.setText(arrayObj.get(x).get(14));
            });

            Image proxBtnImg = new Image("assets/seta_dir.png");
            ImageView proxBtnImgView = new ImageView(proxBtnImg);
            proxBtnImgView.setFitWidth(20);
            proxBtnImgView.setFitHeight(20);

            Button proxBtn = new Button();
            proxBtn.setGraphic(proxBtnImgView);  
            proxBtn.setPrefSize(30, 30);
            proxBtn.setStyle("-fx-background-color: #000;");

            proxBtn.setOnMouseClicked(event -> {
                if(x < arrayObj.size() - 1) x++;
                infoLabel.setText("Informações Do Asteroide " + arrayObj.get(x).get(0));
                nomeValue.setText(arrayObj.get(x).get(0));
                idValue.setText(arrayObj.get(x).get(1));
                absMagnitudeHValue.setText(arrayObj.get(x).get(2));
                diametroKmMinValue.setText(arrayObj.get(x).get(3));
                diametroKmMaxValue.setText(arrayObj.get(x).get(4));
                potencialmentePerigososValue.setText(arrayObj.get(x).get(5));
                dataAproximacaoCompletaValue.setText(arrayObj.get(x).get(6));
                velocidadeKmHorasValue.setText(arrayObj.get(x).get(7));
                distanciaAstronomicaValue.setText(arrayObj.get(x).get(8));
                distanciaLunarValue.setText(arrayObj.get(x).get(9));
                distanciaKmValue.setText(arrayObj.get(x).get(10));
                orbitaQualCorpoValue.setText(arrayObj.get(x).get(11));
                sentinelaObjetoValue.setText(arrayObj.get(x).get(12));
                diametroFeetMinValue.setText(arrayObj.get(x).get(13));
                diametroFeetMaxValue.setText(arrayObj.get(x).get(14));
            });

            HBox proxBtnHbox = new HBox(30);
            proxBtnHbox.setAlignment(Pos.CENTER);
            proxBtnHbox.getChildren().addAll(proxBtn);
            proxBtnHbox.setPrefSize(100, 100);

            HBox hbox = new HBox();
            hbox.setAlignment(Pos.CENTER);
            hbox.setPrefSize(1000, 600);
            hbox.getChildren().addAll(legendaContainer, antBtn, roothbox, proxBtnHbox);
            hbox.setStyle("-fx-background-color: #000;");

            return hbox;

        }

        public HBox S6 () {

            Api api = new Api();
            ArrayList<ArrayList<String>> arrayObj = new ArrayList<>();

            try {
                JSONObject dadosApi = api.solarFlare();
                JSONArray array = dadosApi.optJSONArray("objetos");
                
                if (array != null) {
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject item = array.getJSONObject(i);
                        ArrayList<String> linha = new ArrayList<>();
                        
                        String nome = item.optString("nome", "N/A");
                        String flrID = item.optString("flrID", "N/A");
                        String catalog = item.optString("catalog", "N/A");
                        String beginTime = item.optString("beginTime", "N/A");
                        String peakTime = item.optString("peakTime", "N/A");
                        String endTime = item.optString("endTime", "N/A");
                        String classType = item.optString("classType", "N/A");
                        String sourceLocation = item.optString("sourceLocation", "N/A");
                        String activeRegionNum = item.optString("activeRegionNum", "N/A");
                        String submissionTime = item.optString("submissionTime", "N/A");
                        String versionID = item.optString("versionID", "N/A");
                        String messageId = item.optString("messageId", "N/A");
                        String messageIssueTime = item.optString("messageIssueTime", "N/A");
                        
                        linha.add(nome);
                        linha.add(flrID);
                        linha.add(catalog);
                        linha.add(beginTime);
                        linha.add(peakTime);
                        linha.add(endTime);
                        linha.add(classType);
                        linha.add(sourceLocation);
                        linha.add(activeRegionNum);
                        linha.add(submissionTime);
                        linha.add(versionID);
                        linha.add(messageId);
                        linha.add(messageIssueTime);

                        arrayObj.add(linha);
                    }
                }
            } catch (Exception e) {
                System.err.println("Erro ao chamar API: " + e.getMessage());
            }

            Button voltarBtn = new Button();
            voltarBtn.setText("Tela anterior");
            voltarBtn.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");
            voltarBtn.setPrefSize(200,30);

            Screens screensRef = this;  
            voltarBtn.setOnAction(event -> {
                HBox s1Screen;
                try {
                    s1Screen = screensRef.S1();
                    voltarBtn.getScene().setRoot(s1Screen);
                } catch (Exception e) {
                    System.out.println("Erro ao voltar!");
                }
            });

            if (arrayObj.isEmpty()) {
                Label erroLabel = new Label("Nenhuma erupção solar encontrada!");
                erroLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #fff;");
                
                VBox c = new VBox(30);
                c.setAlignment(Pos.CENTER);
                c.getChildren().addAll(erroLabel, voltarBtn);
                c.setStyle("-fx-background-color: #000;");

                HBox root = new HBox();
                root.setAlignment(Pos.CENTER);
                root.getChildren().addAll(c);
                root.setStyle("-fx-background-color: #000;");
                
                return root;
            }
                
            VBox legendaContainer = new VBox(10);
            legendaContainer.setAlignment(Pos.CENTER_LEFT);
            legendaContainer.setPadding(new Insets(0, 0, 0, 10));
            legendaContainer.setPrefSize(300, 600);
            legendaContainer.setStyle("-fx-background-color: #000;");

            Label infoLabel = new Label("Informações da Erupção Solar");
            infoLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #ff3838; -fx-font-weight: 700;");

            Label nomeLabel = new Label("Nome:");
            nomeLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label nomeValue = new Label(arrayObj.get(x).get(0));
            nomeValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox nomeBox = new HBox(5);
            nomeBox.getChildren().addAll(nomeLabel, nomeValue);

            Label flrIDLabel = new Label("ID Erupção:");
            flrIDLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label flrIDValue = new Label(arrayObj.get(x).get(1));
            flrIDValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox flrIDBox = new HBox(5);
            flrIDBox.getChildren().addAll(flrIDLabel, flrIDValue);

            Label catalogLabel = new Label("Catálogo:");
            catalogLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label catalogValue = new Label(arrayObj.get(x).get(2));
            catalogValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox catalogBox = new HBox(5);
            catalogBox.getChildren().addAll(catalogLabel, catalogValue);

            Label beginTimeLabel = new Label("Início:");
            beginTimeLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label beginTimeValue = new Label(arrayObj.get(x).get(3));
            beginTimeValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox beginTimeBox = new HBox(5);
            beginTimeBox.getChildren().addAll(beginTimeLabel, beginTimeValue);

            Label peakTimeLabel = new Label("Pico:");
            peakTimeLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label peakTimeValue = new Label(arrayObj.get(x).get(4));
            peakTimeValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox peakTimeBox = new HBox(5);
            peakTimeBox.getChildren().addAll(peakTimeLabel, peakTimeValue);

            Label endTimeLabel = new Label("Fim:");
            endTimeLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label endTimeValue = new Label(arrayObj.get(x).get(5));
            endTimeValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox endTimeBox = new HBox(5);
            endTimeBox.getChildren().addAll(endTimeLabel, endTimeValue);

            Label classTypeLabel = new Label("Classe:");
            classTypeLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label classTypeValue = new Label(arrayObj.get(x).get(6));
            classTypeValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox classTypeBox = new HBox(5);
            classTypeBox.getChildren().addAll(classTypeLabel, classTypeValue);

            Label sourceLocationLabel = new Label("Local de Origem:");
            sourceLocationLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label sourceLocationValue = new Label(arrayObj.get(x).get(7));
            sourceLocationValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox sourceLocationBox = new HBox(5);
            sourceLocationBox.getChildren().addAll(sourceLocationLabel, sourceLocationValue);

            Label activeRegionNumLabel = new Label("Região Ativa Nº:");
            activeRegionNumLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label activeRegionNumValue = new Label(arrayObj.get(x).get(8));
            activeRegionNumValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox activeRegionNumBox = new HBox(5);
            activeRegionNumBox.getChildren().addAll(activeRegionNumLabel, activeRegionNumValue);

            Label submissionTimeLabel = new Label("Data de Submissão:");
            submissionTimeLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label submissionTimeValue = new Label(arrayObj.get(x).get(9));
            submissionTimeValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox submissionTimeBox = new HBox(5);
            submissionTimeBox.getChildren().addAll(submissionTimeLabel, submissionTimeValue);

            Label versionIDLabel = new Label("Versão ID:");
            versionIDLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label versionIDValue = new Label(arrayObj.get(x).get(10));
            versionIDValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox versionIDBox = new HBox(5);
            versionIDBox.getChildren().addAll(versionIDLabel, versionIDValue);

            Label messageIDLabel = new Label("ID Mensagem:");
            messageIDLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label messageIDValue = new Label(arrayObj.get(x).get(11));
            messageIDValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox messageIDBox = new HBox(5);
            messageIDBox.getChildren().addAll(messageIDLabel, messageIDValue);

            Label messageIssueTimeLabel = new Label("Emissão da Mensagem:");
            messageIssueTimeLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label messageIssueTimeValue = new Label(arrayObj.get(x).get(12));
            messageIssueTimeValue.setStyle("-fx-font-size: 10px; -fx-text-fill: #fff; -fx-font-weight: 500;");
            HBox messageIssueTimeBox = new HBox(5);
            messageIssueTimeBox.getChildren().addAll(messageIssueTimeLabel, messageIssueTimeValue);

            legendaContainer.getChildren().addAll(infoLabel, nomeBox, flrIDBox, catalogBox, beginTimeBox, peakTimeBox, endTimeBox, classTypeBox, sourceLocationBox, activeRegionNumBox, submissionTimeBox, versionIDBox, messageIDBox, messageIssueTimeBox, voltarBtn);

            Sphere sphere = new Sphere(120); 
            PhongMaterial material = new PhongMaterial();
            material.setDiffuseColor(Color.ORANGE);
            Image image = new Image("materiais/solar_material.jpg", true);
            material.setDiffuseMap(image);
            material.setSpecularMap(image);  
            sphere.setMaterial(material);

            PointLight light = new PointLight(Color.ORANGE);
            light.setTranslateX(-150);
            light.setTranslateY(-120);
            light.setTranslateZ(-250);
            
            AmbientLight ambient = new AmbientLight(Color.color(0.35, 0.35, 0.35));

            Group root = new Group(sphere, light, ambient);

            RotateTransition rt = new RotateTransition(javafx.util.Duration.seconds(10));
            rt.setAxis(Rotate.Y_AXIS);
            rt.setByAngle(500);
            rt.setCycleCount(Animation.INDEFINITE);
            rt.setNode(sphere);
            rt.play();

            HBox roothbox = new HBox(30);
            roothbox.setAlignment(Pos.CENTER);
            roothbox.getChildren().addAll(root);
            roothbox.setPrefSize(500, 600);

            Image antBtnImg = new Image("assets/seta_esq.png");
            ImageView antBtnImgView = new ImageView(antBtnImg);
            antBtnImgView.setFitWidth(20);
            antBtnImgView.setFitHeight(20);

            Button antBtn = new Button();
            antBtn.setGraphic(antBtnImgView);  
            antBtn.setPrefSize(30, 30);
            antBtn.setStyle("-fx-background-color: #000;");

            antBtn.setOnMouseClicked(event -> {
                if (x > 0) {
                    x--;
                    nomeValue.setText(arrayObj.get(x).get(0));
                    flrIDValue.setText(arrayObj.get(x).get(1));
                    catalogValue.setText(arrayObj.get(x).get(2));
                    beginTimeValue.setText(arrayObj.get(x).get(3));
                    peakTimeValue.setText(arrayObj.get(x).get(4));
                    endTimeValue.setText(arrayObj.get(x).get(5));
                    classTypeValue.setText(arrayObj.get(x).get(6));
                    sourceLocationValue.setText(arrayObj.get(x).get(7));
                    activeRegionNumValue.setText(arrayObj.get(x).get(8));
                    submissionTimeValue.setText(arrayObj.get(x).get(9));
                    versionIDValue.setText(arrayObj.get(x).get(10));
                    messageIDValue.setText(arrayObj.get(x).get(11));
                    messageIssueTimeValue.setText(arrayObj.get(x).get(12));
                } 
            });

            Image proxBtnImg = new Image("assets/seta_dir.png");
            ImageView proxBtnImgView = new ImageView(proxBtnImg);
            proxBtnImgView.setFitWidth(20);
            proxBtnImgView.setFitHeight(20);

            Button proxBtn = new Button();
            proxBtn.setGraphic(proxBtnImgView);  
            proxBtn.setPrefSize(30, 30);
            proxBtn.setStyle("-fx-background-color: #000;");

            proxBtn.setOnMouseClicked(event -> {
                if (x < arrayObj.size() - 1) {
                    x++;
                    nomeValue.setText(arrayObj.get(x).get(0));
                    flrIDValue.setText(arrayObj.get(x).get(1));
                    catalogValue.setText(arrayObj.get(x).get(2));
                    beginTimeValue.setText(arrayObj.get(x).get(3));
                    peakTimeValue.setText(arrayObj.get(x).get(4));
                    endTimeValue.setText(arrayObj.get(x).get(5));
                    classTypeValue.setText(arrayObj.get(x).get(6));
                    sourceLocationValue.setText(arrayObj.get(x).get(7));
                    activeRegionNumValue.setText(arrayObj.get(x).get(8));
                    submissionTimeValue.setText(arrayObj.get(x).get(9));
                    versionIDValue.setText(arrayObj.get(x).get(10));
                    messageIDValue.setText(arrayObj.get(x).get(11));
                    messageIssueTimeValue.setText(arrayObj.get(x).get(12));
                } 
            });

            HBox proxBtnHbox = new HBox(30);
            proxBtnHbox.setAlignment(Pos.CENTER);
            proxBtnHbox.getChildren().addAll(proxBtn);
            proxBtnHbox.setPrefSize(100, 100);

            HBox hbox = new HBox();
            hbox.setAlignment(Pos.CENTER);
            hbox.setPrefSize(1000, 600);
            hbox.getChildren().addAll(legendaContainer, antBtn, roothbox, proxBtnHbox);
            hbox.setStyle("-fx-background-color: #000;");

            return hbox;
        }

        public HBox S7 () {

            Api api = new Api();
            ArrayList<ArrayList<String>> arrayObj = new ArrayList<>();

            try {
                JSONObject dadosApi = api.notification();
                JSONArray array = dadosApi.optJSONArray("objetos");
                
                if (array != null) {
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject item = array.getJSONObject(i);
                        ArrayList<String> linha = new ArrayList<>();
                        
                        String messageType = item.optString("messageType", "N/A");
                        String messageID = item.optString("messageID", "N/A");
                        String messageURL = item.optString("messageURL", "N/A");
                        String messageIssueTime = item.optString("messageIssueTime", "N/A"); 
                        
                        linha.add(messageType);
                        linha.add(messageID);
                        linha.add(messageURL);
                        linha.add(messageIssueTime);

                        arrayObj.add(linha);
                    }
                }
            } catch (Exception e) {
                System.err.println("Erro ao chamar API: " + e.getMessage());
            }

            Button voltarBtn = new Button();
            voltarBtn.setText("Tela anterior");
            voltarBtn.setStyle("-fx-background-color: #353740; -fx-text-fill: #fff; -fx-font-weight: 700; -fx-font-size: 11px; -fx-font-family: 'JetBrains Mono';");
            voltarBtn.setPrefSize(200,30);

            Screens screensRef = this;  
            voltarBtn.setOnAction(event -> {
                HBox s1Screen;
                try {
                    s1Screen = screensRef.S1();
                    voltarBtn.getScene().setRoot(s1Screen);
                } catch (Exception e) {
                    System.out.println("Erro ao voltar!");
                }
            });

            if (arrayObj.isEmpty()) {
                Label erroLabel = new Label("Nenhuma notificação encontrada!");
                erroLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #fff;");
                
                VBox c = new VBox(30);
                c.setAlignment(Pos.CENTER);
                c.getChildren().addAll(erroLabel, voltarBtn);
                c.setStyle("-fx-background-color: #000;");

                HBox root = new HBox();
                root.setAlignment(Pos.CENTER);
                root.getChildren().addAll(c);
                root.setStyle("-fx-background-color: #000;");
                
                return root;
            }
                
            VBox legendaContainer = new VBox(10);
            legendaContainer.setAlignment(Pos.CENTER_LEFT);
            legendaContainer.setPadding(new Insets(0, 0, 0, 25));
            legendaContainer.setPrefSize(500, 350);

            Label infoLabel = new Label("Última notificação");
            infoLabel.setStyle("-fx-font-size: 18px; -fx-text-fill: #ff3838; -fx-font-weight: 900;");
            
            Label messageTypeLabel = new Label("Tipo Da Mensagem:");
            messageTypeLabel.setStyle("-fx-font-size: 12px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label messageTypeValue = new Label(arrayObj.get(x).get(0));
            messageTypeValue.setStyle("-fx-font-size: 12px; -fx-text-fill: #fff; -fx-font-weight: 400;");
            HBox messageTypeBox = new HBox(5);
            messageTypeBox.getChildren().addAll(messageTypeLabel, messageTypeValue);

            Label messageIDLabel = new Label("ID Da Mensagem:");
            messageIDLabel.setStyle("-fx-font-size: 12px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label messageIDValue = new Label(arrayObj.get(x).get(1));
            messageIDValue.setStyle("-fx-font-size: 12px; -fx-text-fill: #fff; -fx-font-weight: 400;");
            HBox messageIDBox = new HBox(5);
            messageIDBox.getChildren().addAll(messageIDLabel, messageIDValue);

            Label messageURLLabel = new Label("URL:");
            messageURLLabel.setStyle("-fx-font-size: 12px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label messageURLValue = new Label(arrayObj.get(x).get(2));
            messageURLValue.setStyle("-fx-font-size: 12px; -fx-text-fill: #fff; -fx-font-weight: 400; -fx-wrap-text: true;");
            HBox messageURLBox = new HBox(5);
            messageURLBox.getChildren().addAll(messageURLLabel, messageURLValue);

            Label messageIssueTimeLabel = new Label("Tempo Da Mensagem:");
            messageIssueTimeLabel.setStyle("-fx-font-size: 12px; -fx-text-fill: #fff; -fx-font-weight: 900;");
            Label messageIssueTimeValue = new Label(arrayObj.get(x).get(3));
            messageIssueTimeValue.setStyle("-fx-font-size: 12px; -fx-text-fill: #fff; -fx-font-weight: 400;");
            HBox messageIssueTimeBox = new HBox(5);
            messageIssueTimeBox.getChildren().addAll(messageIssueTimeLabel, messageIssueTimeValue);

            VBox btnContainer = new VBox(10);
            btnContainer.setAlignment(Pos.CENTER_LEFT);
            btnContainer.setPadding(new Insets(0, 0, 0, 25));
            btnContainer.setPrefSize(500, 250);

            btnContainer.getChildren().addAll(voltarBtn);
            legendaContainer.getChildren().addAll(infoLabel, messageTypeBox, messageIDBox, messageURLBox, messageIssueTimeBox, btnContainer);

            VBox tContainer = new VBox(10);
            tContainer.setAlignment(Pos.CENTER_LEFT);
            tContainer.setPadding(new Insets(0, 0, 0, 0));
            tContainer.getChildren().addAll(legendaContainer, btnContainer);
            tContainer.setPrefSize(500, 600);
            tContainer.maxHeight(600);
            tContainer.setStyle("-fx-background-color: #0c0c0c;");

            HBox hbox = new HBox();
            hbox.setAlignment(Pos.CENTER);
            hbox.setPrefSize(1000, 600);
            hbox.getChildren().addAll(tContainer);
            hbox.setStyle("-fx-background-color: #000;");

            return hbox;
        }
        
}