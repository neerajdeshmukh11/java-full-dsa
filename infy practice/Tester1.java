public class Tester1 {
    public static void main(String[] args) {
        // Available inventory
        String[] availJewelArr = {"Bentex", "Silver", "Gold", "Platinum"};
        int[] availPriceArr = {20, 50, 2600, 3000};
        
        // Items being purchased
        String[] purchasedJewelArr = {"Silver", "Gold", "Platinum"};
        int[] purchasedQuantityArr = {20, 7, 3};

        Solution s = new Solution();
        
        // Execute calculation and print output
        double result = s.calBillAmount(availJewelArr, availPriceArr, purchasedJewelArr, purchasedQuantityArr);
        System.out.println("Bill Amount: " + result);
    }

}


class Solution {
    
    public double calBillAmount(String[] availJewelArr, int[] availPriceArr, String[] purchasedJewelArr, int[] purchasedQuantityArr) {
        double billAmount = 0.0;
        
        // Iterate through each purchased jewel [cite: 115]
        for (int i = 0; i < purchasedJewelArr.length; i++) {
            String currentPurchasedJewel = purchasedJewelArr[i];
            boolean found = false;
            
            // Check if the purchased jewel is present in availJewelArr [cite: 116]
            for (int j = 0; j < availJewelArr.length; j++) {
                // Perform case-sensitive comparison 
                if (currentPurchasedJewel.equals(availJewelArr[j])) {
                    // Identify corresponding perGramAmount and calculate totalPrice [cite: 117, 118]
                    double totalPrice = (double) availPriceArr[j] * purchasedQuantityArr[i];
                    billAmount += totalPrice;
                    found = true;
                    break;
                }
            }
            
            // If any jewel is not present, set billAmount to -1.0 and exit [cite: 123, 125]
            if (!found) {
                return -1.0;
            }
        }
        
        // If billAmount > 20000.0, apply 3% discount [cite: 122]
        if (billAmount > 20000.0) {
            billAmount = billAmount - (billAmount * 3 / 100);
        }
        
        return billAmount;
    }
}
