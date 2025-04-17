import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.collections.*;
import javafx.geometry.*;

public class Main extends Application {

    private TableView<Transaction> table;
    private ObservableList<Transaction> transactions;
    private Label balanceLabel;
    private double balance = 0.0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        transactions = FXCollections.observableArrayList();

        Label title = new Label("💰 Simple Finance Tracker");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        TextField descriptionField = new TextField();
        descriptionField.setPromptText("Description");

        TextField amountField = new TextField();
        amountField.setPromptText("Amount");

        ChoiceBox<String> typeChoice = new ChoiceBox<>();
        typeChoice.getItems().addAll("Income", "Expense");
        typeChoice.setValue("Income");

        Button addButton = new Button("Add");
        addButton.setOnAction(e -> {
            String desc = descriptionField.getText();
            String type = typeChoice.getValue();
            double amount;

            try {
                amount = Double.parseDouble(amountField.getText());
            } catch (NumberFormatException ex) {
                showAlert("Invalid amount");
                return;
            }

            if (desc.isEmpty()) {
                showAlert("Description cannot be empty");
                return;
            }

            if (type.equals("Expense")) {
                amount = -amount;
            }

            Transaction transaction = new Transaction(desc, amount);
            transactions.add(transaction);
            balance += amount;
            updateBalance();
            descriptionField.clear();
            amountField.clear();
        });

        HBox inputBox = new HBox(10, descriptionField, amountField, typeChoice, addButton);
        inputBox.setAlignment(Pos.CENTER);

        table = new TableView<>();
        TableColumn<Transaction, String> descCol = new TableColumn<>("Description");
        descCol.setCellValueFactory(cell -> cell.getValue().descriptionProperty());

        TableColumn<Transaction, String> amountCol = new TableColumn<>("Amount");
        amountCol.setCellValueFactory(cell -> cell.getValue().amountProperty());

        table.getColumns().addAll(descCol, amountCol);
        table.setItems(transactions);

        balanceLabel = new Label("Current Balance: ₹0.00");
        balanceLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: green;");

        VBox root = new VBox(10, title, inputBox, table, balanceLabel);
        root.setPadding(new Insets(15));
        root.setStyle("-fx-background-color: #f9f9f9;");

        primaryStage.setTitle("Finance Tracker");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    private void updateBalance() {
        String color = balance >= 0 ? "green" : "red";
        balanceLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: " + color + ";");
        balanceLabel.setText(String.format("Current Balance: ₹%.2f", balance));
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.setHeaderText(null);
        alert.showAndWait();
    }
}
