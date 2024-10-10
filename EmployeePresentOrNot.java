import java.util.Random;
import java.util.Scanner;

public class EmployeePresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String employeeName = sc.nextLine();
        
        Employee emp = new Employee(employeeName);
        emp.calculateMonthlyAttendance();
        emp.displayDailyAttendanceAndEarnings();
        emp.displayTotalEarnings();
    }
}

class Employee {
    private String name;
    private int[] attendance;
    private int[] dailyEarnings;
    private int totalEarnings;

    public Employee(String name) {
        this.name = name;
        this.attendance = new int[30];
        this.dailyEarnings = new int[30];
        this.totalEarnings = 0;
    }

    private int generateRandomAttendance() {
        Random random = new Random();
        return random.nextInt(3); 
    }

    private int calculateDailyEarnings(int status) {
        switch (status) {
            case 0:
                return 0; 
            case 1:
                return 500; 
            case 2:
                return 1000; 
            default:
                return 0;
        }
    }

    public void calculateMonthlyAttendance() {
        for (int i = 0; i < 30; i++) {
            attendance[i] = generateRandomAttendance();
            dailyEarnings[i] = calculateDailyEarnings(attendance[i]);
            totalEarnings += dailyEarnings[i];
        }
    }

    public void displayDailyAttendanceAndEarnings() {
        System.out.println("Daily attendance status (0: Absent, 1: Half day, 2: Full day) and earnings for " + name + ":");
        for (int i = 0; i < 30; i++) {
            System.out.println("Day " + (i + 1) + ": " + attendance[i] + ", Earnings: " + dailyEarnings[i]);
        }
    }

    public void displayTotalEarnings() {
        System.out.println(name + "'s Total Earnings for the Month: " + totalEarnings);
    }
}
