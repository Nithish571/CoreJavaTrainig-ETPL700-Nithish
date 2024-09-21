package service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.FoodWaste;
import dao.DBConnection;

public class FoodWasteDAO {
    private Connection getConnection() throws Exception {
        return DBConnection.getConnection();
    }

    public int create(FoodWaste foodWaste) {
        String sql = "INSERT INTO food_waste (food_item, quantity, date) VALUES (?, ?, ?)";
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, foodWaste.getFoodItem());
            pstmt.setDouble(2, foodWaste.getQuantity());
            pstmt.setString(3, foodWaste.getDate());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<FoodWaste> readAll() {
        List<FoodWaste> wasteList = new ArrayList<>();
        String sql = "SELECT * FROM food_waste";
        try (Connection con = getConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                FoodWaste waste = new FoodWaste();
                waste.setId(rs.getInt("id"));
                waste.setFoodItem(rs.getString("food_item"));
                waste.setQuantity(rs.getDouble("quantity"));
                waste.setDate(rs.getString("date"));
                wasteList.add(waste);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wasteList;
    }

    public int update(FoodWaste foodWaste) {
        String sql = "UPDATE food_waste SET food_item=?, quantity=?, date=? WHERE id=?";
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, foodWaste.getFoodItem());
            pstmt.setDouble(2, foodWaste.getQuantity());
            pstmt.setString(3, foodWaste.getDate());
            pstmt.setInt(4, foodWaste.getId());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int delete(int id) {
        String sql = "DELETE FROM food_waste WHERE id=?";
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}

/*
	public class FoodService {
		
	    private ArrayList<String> foodDonations = new ArrayList<>();
	    private ArrayList<String> wasteReports = new ArrayList<>();

	    public int addFoodItem(String foodItem, double quantity) {
	        foodDonations.add(foodItem + " - " + quantity + " kg");
	        return 1; 
	    }

	    public void reportWaste(String foodItem, double quantity) {
	        wasteReports.add(foodItem + " - " + quantity + " kg wasted");
	    }

	    public String viewDonations() {
	        return String.join("\n", foodDonations);
	    }

	    public String viewWasteReports() {
	        return String.join("\n", wasteReports);
	    }
	}
*/



