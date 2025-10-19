package pe.edu.galaxy.training.java.library.architecture.arq.util;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.training.java.library.utils.date.DateUtilWrapper;
import pe.edu.galaxy.training.java.library.utils.date.DateUtilWrapperImpl;
import pe.edu.galaxy.training.java.library.utils.sql.SQLUtilWrapper;
import pe.edu.galaxy.training.java.library.utils.string.DataUtilWrapper;

@Component
public class FactoryUtil {

    public DateUtilWrapper dateUtilWrapper(){
        return  new DateUtilWrapperImpl();
    }

    public SQLUtilWrapper sqlUtilWrapper(){
        return  new SQLUtilWrapper();
    }

    public DataUtilWrapper dataUtilWrapper(){
        return  new DataUtilWrapper();
    }
}
