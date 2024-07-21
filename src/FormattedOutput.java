import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattedOutput {
    public static void main(String[] args) {
        formatUsingFormat();
        formatUsingDecimalFormat();
        formatDates();
    }

    private static void formatUsingFormat() {
        int x = 8;
        int y = 10;
        int z = 100;

        System.out.println("Unformatted output");
        System.out.format("Value of x is %d\n", x);
        System.out.format("Value of y is %d\n", y);
        System.out.format("Value of z is %d\n", z);

        System.out.println("Formatted output");
        System.out.format("Value of x is %3d\n", x);
        System.out.format("Value of y is %3d\n", y);
        System.out.format("Value of z is %3d\n", z);

        float pi = (float) Math.PI;

        System.out.format("Value of pi without formatting is %f\n", pi);
        // this will rout off the float value up to 2 decimal places
        System.out.format("Value of pi is %.2f\n", pi);

        // printf works the same as format
        System.out.printf("Value of pi is %.2f\n", pi);
    }

    private static void formatUsingDecimalFormat() {
        System.out.println("\nFormating Decimals");
        double num = 37.382;

        // print only number part
        DecimalFormat ft = new DecimalFormat("#");
        System.out.println("Formatted decimal: " + ft.format(num));

        // number and decimal two three decimal places
        ft = new DecimalFormat("#.##");
        System.out.println("Formatted decimal: " + ft.format(num));

        // Appends 0 at the end
        ft = new DecimalFormat("#.000000");
        System.out.println("Formatted decimal: " + ft.format(num));

        // Appends 0 at the left most
        ft = new DecimalFormat("000.000000");
        System.out.println("Formatted decimal: " + ft.format(num));

        // Adds comma
        ft = new DecimalFormat("0,00.000000");
        System.out.println("Formatted decimal: " + ft.format(num));
    }

    private static void formatDates() {
        System.out.println("\nFormating Decimals");
        SimpleDateFormat ft = new SimpleDateFormat("YYY/MM/DD");
        System.out.println("Formatted date: " + ft.format(new Date()));
    }
}
