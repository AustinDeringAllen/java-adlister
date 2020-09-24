

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            while(rs.next()) {
                Ad ad = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add(ad);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement statement = connection.createStatement();
            String query = String.format("INSERT INTO ads (user_id, title, description) VALUES('%s', '%s', '%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());
            statement.executeUpdate(query);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        List<Ad> ads = all();
        if(ads.size() == 0) {
            return 1L;
        }

        return ads.get(ads.size()-1).getId();
    }
}
