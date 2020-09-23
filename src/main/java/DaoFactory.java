import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            try {
                Config config = new Config();
                adsDao = new MySQLAdsDao(config);
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return adsDao;
    }
}
