package application;

import java.io.IOException;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlRocket {

	
	/*--------------------------------PARA MOSTRAR LA SEGUNDA VENTANA Y CERRAR LA PRIMERA ----------------------------------*/
	
	@FXML
	private AnchorPane anchorPane;
	
	@FXML
	private ImageView fotoPrincipal;
	
	@FXML	
	public void openStage() {		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Urano.fxml"));
			anchorPane = (AnchorPane) loader.load();
			Scene scene = new Scene(anchorPane);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void cerrarVentana() {
		System.exit(0);
	}
	
	
	
	private void transicionLogo1() {
		FadeTransition ft = new FadeTransition(Duration.seconds(8), fotoPrincipal);
		ft.setFromValue(0);
		ft.setToValue(1);
		ft.play();
	}
	
	
	
	/*--------------------------------PARA LAS IMÁGENES Y EL HAMBURGUER----------------------------------*/
	
    @FXML
    private AnchorPane pane1,pane2,pane3,pane4; 
    
    /*@FXML
    private AnchorPane opacityPane,drawerPane;*/


    @FXML
    private ImageView drawerImage;

    public void initialize() {

        //opacityPane.setVisible(false);

        /*TranslateTransition translateTransition=new TranslateTransition(Duration.seconds(0.5),drawerPane);
        translateTransition.setByX(-200);
        translateTransition.play();*/
    	transicionLogo1();
        Animation();
        

        /*drawerImage.setOnMouseClicked(event -> {

            opacityPane.setVisible(true);

            FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(0.5),opacityPane);
            fadeTransition1.setFromValue(0);
            fadeTransition1.setToValue(0.3);
            fadeTransition1.play();

            TranslateTransition translateTransition1=new TranslateTransition(Duration.seconds(0.5),drawerPane);
            translateTransition1.setByX(200);
            translateTransition1.play();
        });

        opacityPane.setOnMouseClicked(event -> {

            FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(0.5),opacityPane);
            fadeTransition1.setFromValue(0.3);
            fadeTransition1.setToValue(0);
            fadeTransition1.play();

            fadeTransition1.setOnFinished(event1 -> {
                opacityPane.setVisible(false);
            });

            TranslateTransition translateTransition1=new TranslateTransition(Duration.seconds(0.5),drawerPane);
            translateTransition1.setByX(-200);
            translateTransition1.play();
        });*/

    }

    public  void  Animation(){


        FadeTransition fadeTransition=new FadeTransition(Duration.seconds(3),pane4);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();

        fadeTransition.setOnFinished(event -> {
            FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(3),pane3);
            fadeTransition1.setFromValue(1);
            fadeTransition1.setToValue(0);
            fadeTransition1.play();

            fadeTransition1.setOnFinished(event1 -> {

                FadeTransition fadeTransition2=new FadeTransition(Duration.seconds(3),pane2);
                fadeTransition2.setFromValue(1);
                fadeTransition2.setToValue(0);
                fadeTransition2.play();

                fadeTransition2.setOnFinished(event2 -> {

                    FadeTransition fadeTransition00=new FadeTransition(Duration.seconds(3),pane2);
                    fadeTransition00.setFromValue(0);
                    fadeTransition00.setToValue(1);
                    fadeTransition00.play();


                    fadeTransition00.setOnFinished(event3 -> {
                        FadeTransition fadeTransition11=new FadeTransition(Duration.seconds(3),pane3);
                        fadeTransition11.setFromValue(0);
                        fadeTransition11.setToValue(1);
                        fadeTransition11.play();

                        fadeTransition11.setOnFinished(event4 -> {
                            FadeTransition fadeTransition22=new FadeTransition(Duration.seconds(3),pane4);
                            fadeTransition22.setFromValue(0);
                            fadeTransition22.setToValue(1);
                            fadeTransition22.play();

                            fadeTransition22.setOnFinished(event5 -> {
                                Animation();
                            });
                        });


                    });
                });

            });




        });



    }


	
}
