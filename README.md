# FIT TRACK PRO - Gym Management System

**FIT TRACK PRO** is a simple and user-friendly Gym Management System designed to manage gym members, attendance, and membership details through an easy-to-use dashboard.



##  Features

- **Login Page** for secure access
- **Dashboard** with navigation to all modules
- **Add Members** with:
  - Personal details
  - Membership fee
- **View Members** list
- **Update / Delete** member details
- **Attendance System**:
  - Mark and view attendance records
- Clean and responsive UI built with Java Swing

---

##  Project Structure

- **Main Class**: `GymManagementProject`
- Other core components:
  - `LoginPage`
  - `Dashboard`
  - `AddMember`
  - `ViewMember`
  - `UpdateMember`
  - `DeleteMember`
  - `Attendance`

---

## Database Setup using XAMPP

1. Install and run **XAMPP**.
2. Start **Apache** and **MySQL** modules.
3. Open [phpMyAdmin](http://localhost/phpmyadmin/)
4. Create a new database named: `final_gym_management`
5. Import the SQL file: `final_gym_management.sql` (included with the project)

---

## How to Run the Project

1. Open the project in your preferred Java IDE (e.g., IntelliJ, Eclips NetBeans)
2. Make sure XAMPP is running and the database final_gym_management` is set up
3. Set up database connection using JDBC:
   ```java
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_gym_management", "root", "");

