// Import the browser widget and function.
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

// Extend the browser function.
public class PrinterCommand extends BrowserFunction {
    // Class constructor.
    public PrinterCommand(Browser browser, String name) {
        // Call parent constructor.
        super (browser, name);
    }

    @Override
    // Function logic.
    public Object function (Object[] arguments) {
        USBThermalPrinter printer = new USBThermalPrinter();
        // Print text if there is anything to print.
        if (arguments.length == 2) {
            return printer.print(
                arguments[0].toString(),
                arguments[1].toString()
            );
        } else {
            return false;
        }
    }
}
