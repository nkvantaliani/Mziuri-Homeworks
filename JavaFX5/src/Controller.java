import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    @FXML
    private ChoiceBox<String> from;
    @FXML
    private ChoiceBox<String> to;
    @FXML
    private Spinner<Double> amount;
    @FXML
    private Label result;

    private Map<String, Double> currencyValues = new HashMap<>();

    public void initialize(){
        from.getItems().addAll("GEL","USD","EUR","GBP");
        to.getItems().addAll("GEL","USD","EUR","GBP");
        from.setValue("GEL");
        to.setValue("USD");
        currencyValues.put("GEL", 1.0);
        currencyValues.put("USD", 0.37);
        currencyValues.put("EUR", 0.34);
        currencyValues.put("GBP", 0.29);


        amount.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 10000, 1));
        amount.getValueFactory().valueProperty().addListener((spinner, oldNumber, newNumber) -> {
            convert();
        });
        from.setOnAction(event -> {
            convert();
        });
        to.setOnAction(event -> {
            convert();
        });
        convert();
    }

    public void convert(){
        if (from.getValue() == null || to.getValue() == null) {
            result.setText("select currency");
            return;
        }


        double value = amount.getValue();
        double fromValue = currencyValues.get(from.getValue());
        double toValue = currencyValues.get(to.getValue());
        double finalResult = value * (toValue / fromValue);

        result.setText("Result: " + finalResult);

    }
}
