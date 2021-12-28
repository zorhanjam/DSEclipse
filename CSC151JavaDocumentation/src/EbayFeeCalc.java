import java.util.Scanner;

/**
 * Program reports the fees charged by ebay.com given an item's selling price.
 *
 * @author Zyante Developers
 * @version 1.0
 */
public class EbayFeeCalc {
	/**
	 * Returns fees charged by ebay.com given selling price of fixed-price
	 * books/movies/music/video-games. $0.50 to list plus 13% of selling price up to
	 * $50.00, %5 of amount from $50.01 to$1000.00, and 2% for amount $1000.01 or
	 * more.
	 *
	 * @param sellingPrice the item's selling price
	 * @return a double representing the imposed fees
	 * @see "http://pages.ebay.com/help/sell/fees.html"
	 */
	public static double ebayFee(double sellingPrice) {
		final double BASE_LIST_FEE = 0.50; // Listing Fee
		final double PERC_50_OR_LESS = 0.13; // % $50 or less
		final double PERC_50_TO_1000 = 0.05; // % $50.01..$1000.00
		final double PERC_1000_OR_MORE = 0.02; // % $1000.01 or more
		double feeTot; // Resulting eBay fee

		feeTot = BASE_LIST_FEE;

		// Determine additional fee based on selling price
		if (sellingPrice <= 50.00) { // $50.00 or lower
			feeTot = feeTot + (sellingPrice * PERC_50_OR_LESS);
		} else if (sellingPrice <= 1000.00) { // $50.01..$1000.00
			feeTot = feeTot + (50 * PERC_50_OR_LESS) + ((sellingPrice - 50) * PERC_50_TO_1000);
		} else { // $1000.01 and higher
			feeTot = feeTot + (50 * PERC_50_OR_LESS) + ((1000 - 50) * PERC_50_TO_1000)
					+ ((sellingPrice - 1000) * PERC_1000_OR_MORE);
		}

		return feeTot;
	}

	/**
	 * Asks for an item's selling price and calls ebayFee() to calculate the imposed
	 * fees.
	 *
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double sellingPrice; // User defined selling price

		// Prompt user for selling price, call eBay fee method
		System.out.print("Enter item selling price (e.g., 65.00): ");
		sellingPrice = scnr.nextDouble();
		System.out.println("eBay fee: $" + ebayFee(sellingPrice));
	}
}