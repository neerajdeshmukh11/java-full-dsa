import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Transaction {
    private final StringProperty description;
    private final StringProperty amount;

    public Transaction(String description, double amount) {
        this.description = new SimpleStringProperty(description);
        this.amount = new SimpleStringProperty(String.format("₹%.2f", amount));
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public StringProperty amountProperty() {
        return amount;
    }
}
