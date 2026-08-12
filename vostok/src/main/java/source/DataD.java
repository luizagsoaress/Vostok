package source;

import java.util.Calendar;

public class DataD {

        String dataCompleta() {
            Calendar c = Calendar.getInstance();

            return String.format("%d/%d/%d", 
                c.get(Calendar.DAY_OF_MONTH),
                c.get(Calendar.MONTH) + 1,
                c.get(Calendar.YEAR));
        }

    }