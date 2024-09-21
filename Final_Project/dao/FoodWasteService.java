package dao;

import java.util.List;

import bean.FoodWaste;
import service.FoodWasteDAO;

public class FoodWasteService {
    private final FoodWasteDAO foodWasteDAO = new FoodWasteDAO();

    public int createFoodWaste(FoodWaste foodWaste) {
        return foodWasteDAO.create(foodWaste);
    }

    public List<FoodWaste> getAllFoodWaste() {
        return foodWasteDAO.readAll();
    }

    public int updateFoodWaste(FoodWaste foodWaste) {
        return foodWasteDAO.update(foodWaste);
    }

    public int deleteFoodWaste(int id) {
        return foodWasteDAO.delete(id);
    }
}


/* public class FoodDao {
	public int createFoodItem(FoodBean food) {
		try (Connection con = FoodDBConnection.getConnection()) {
			String query = "INSERT INTO food_items (restaurant_id, type_food, location, quantity) VALUES (?, ?, ?, ?)";
			try (PreparedStatement pstmt = con.prepareStatement(query)) {
				pstmt.setInt(1, food.getRestaurant_id());
				pstmt.setString(2, food.getType_food());
				pstmt.setString(3, food.getLocation());

				return pstmt.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int reportWaste(String foodItem, double quantity) {
		try (Connection con = FoodDBConnection.getConnection()) {
			String query = "INSERT INTO food_waste (food_item, quantity) VALUES (?, ?)";
			try (PreparedStatement pstmt = con.prepareStatement(query)) {
				pstmt.setString(1, foodItem);
				pstmt.setDouble(2, quantity);
				return pstmt.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	// Get all food donations
	public String viewAllDonations() {
		StringBuilder donations = new StringBuilder();
		try (Connection con = FoodDBConnection.getConnection()) {
			String query = "SELECT * FROM food_items";
			try (PreparedStatement pstmt = con.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					donations.append(rs.getString("restaurant_id")).append(" - ").append(rs.getString("type_food"))
							.append(" - ").append(rs.getDouble("quantity")).append(" kg\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return donations.toString();
	}

	public String viewWasteReports() {
		StringBuilder wasteReports = new StringBuilder();
		try (Connection con = FoodDBConnection.getConnection()) {
			String query = "SELECT * FROM food_waste";
			try (PreparedStatement pstmt = con.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					wasteReports.append(rs.getString("food_item")).append(" - ").append(rs.getDouble("quantity"))
							.append(" kg wasted\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wasteReports.toString();
	}
} */
