/**
 * 
 */
package view;

import java.sql.Connection;

import utils.Constants;
import utils.Dbconnection;

/**
 * Create by: HQTrung - CMC
 * Create date: Dec 28, 2018
 * Modifier: HQTrung
 * Modified date: Dec 28, 2018
 * Description: ....
 * Version 1.0
 */
public class ManageStudent {

        /**
         * Create by: HQTrung - CMC
         * Create date: Dec 28, 2018
         * Modifier: HQTrung
         * Modified date: Dec 28, 2018
         * Description: program manage student
         * Version 1.0
         * @param args
         */
        public static void main(String[] args) {
                System.out.println(Constants.Student.STUDENT_CODE);
                Connection connection = Dbconnection.connect();
                System.out.println(connection);
        }

}
