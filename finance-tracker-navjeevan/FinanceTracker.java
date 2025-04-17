import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FinanceTracker extends JFrame {

    private JTextField descriptionField, amountField;
    private JComboBox<String> typeCombo;
    private JLabel balanceLabel;
    private JTable table;
    private DefaultTableModel tableModel;
    private double balance = 0.0;

    public FinanceTracker() {
        setTitle("Finance Tracker");
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Top panel for inputs
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel descLabel = new JLabel("Description:");
        descriptionField = new JTextField(10);

        JLabel amountLabel = new JLabel("Amount:");
        amountField = new JTextField(10);

        JLabel typeLabel = new JLabel("Type:");
        typeCombo = new JComboBox<>(new String[]{"Income", "Expense"});

        JButton addButton = new JButton("Add");
        addButton.addActionListener(e -> addTransaction());

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0; gbc.gridy = 0; inputPanel.add(descLabel, gbc);
        gbc.gridx = 1; inputPanel.add(descriptionField, gbc);
        gbc.gridx = 2; inputPanel.add(amountLabel, gbc);
        gbc.gridx = 3; inputPanel.add(amountField, gbc);
        gbc.gridx = 4; inputPanel.add(typeLabel, gbc);
        gbc.gridx = 5; inputPanel.add(typeCombo, gbc);
        gbc.gridx = 6; inputPanel.add(addButton, gbc);

        // Table
        String[] columns = {"Description", "Amount"};
        tableModel = new DefaultTableModel(columns, 0);
        table = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(table);

        // Balance display
        balanceLabel = new JLabel("Current Balance: ₹0.00");
        balanceLabel.setFont(new Font("Arial", Font.BOLD, 16));
        balanceLabel.setForeground(Color.BLUE);
        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Layout setup
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(tableScroll, BorderLayout.CENTER);
        add(balanceLabel, BorderLayout.SOUTH);
    }

    private void addTransaction() {
        String description = descriptionField.getText();
        String amountText = amountField.getText();
        String type = (String) typeCombo.getSelectedItem();

        if (description.isEmpty() || amountText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(amountText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if ("Expense".equals(type)) {
            amount = -amount;
        }

        tableModel.addRow(new Object[]{description, String.format("₹%.2f", amount)});
        balance += amount;
        updateBalance();

        descriptionField.setText("");
        amountField.setText("");
        typeCombo.setSelectedIndex(0);
    }

    private void updateBalance() {
        balanceLabel.setText(String.format("Current Balance: ₹%.2f", balance));
        if (balance < 0) {
            balanceLabel.setForeground(Color.RED);
        } else {
            balanceLabel.setForeground(new Color(0, 128, 0)); // Green
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FinanceTracker tracker = new FinanceTracker();
            tracker.setVisible(true);
        });
    }
}
