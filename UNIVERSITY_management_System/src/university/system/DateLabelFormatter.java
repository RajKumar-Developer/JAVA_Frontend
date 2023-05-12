package university.management.system;
//
//import java.util.Date;
//import javax.swing.*;
//import org.jdatepicker.*;
//
//public class date {
//    public static void main(String[] args) {
//        // Create a date model and a date panel
//        UtilDateModel model = new UtilDateModel();
//        JDatePanelImpl datePanel = new JDatePanelImpl(model);
//
//        // Create a date picker
//        JDatePicker datePicker = new JDatePicker(datePanel);
//
//        // Add the date picker to a frame
//        JFrame frame = new JFrame("Date Picker");
//        frame.add(datePicker);
//        frame.pack();
//        frame.setVisible(true);
//
//        // Get the selected date from the date picker
//        Date selectedDate = (Date) datePicker.getModel().getValue();
//    }
//}
//

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFormattedTextField.AbstractFormatter;

public class DateLabelFormatter extends AbstractFormatter {

        private String datePattern = "yyyy-MM-dd";
        private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
        @Override
        public Object stringToValue(String text) throws ParseException {
            return dateFormatter.parseObject(text);
}

        @Override
            public String valueToString(Object value) throws ParseException {
                if (value != null) {
                    Calendar cal = (Calendar) value;
                return dateFormatter.format(cal.getTime());
}
                return "";
}

}