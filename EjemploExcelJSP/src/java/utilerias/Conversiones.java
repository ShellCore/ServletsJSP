package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversiones {
    
    private static final String FORMATO_FECHA = "yyyy-MM-dd";
    
    public static String format(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
        return sdf.format(fecha);
    }
}
