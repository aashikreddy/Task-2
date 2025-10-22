import java.util.*;

class Students {
    private int sid;
    private String sname;
    private double smarks;

    public Students(int sid, String sname, double smarks) {
        this.sid = sid;
        this.sname = sname;
        this.smarks = smarks;
    }

    public int getID() {
        return sid;
    }

    public String getName() {
        return sname;
    }

    public double getMarks() {
        return smarks;
    }

    public String toString() {
        return sid + " " + sname + " " + smarks;
    }
}

public class CRUD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Students> c = new ArrayList<>();
        char cont = 'y';  // variable to control loop

        while (cont == 'y' || cont == 'Y') {
            System.out.println("\n---- CLI-Based CRUD Student Records Management System ----");
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. UPDATE");
            System.out.println("5. DELETE");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Enter Student Marks: ");
                    double smarks = sc.nextDouble();
                    c.add(new Students(sid, sname, smarks));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("-----------------------------");
                    if (c.isEmpty()) {
                        System.out.println("No records found!");
                    } else {
                        for (Students s : c) {
                            System.out.println(s);
                        }
                    }
                    System.out.println("-----------------------------");
                    break;

                case 3:
                    boolean found = false;
                    System.out.print("Enter Student ID to search: ");
                    sid = sc.nextInt();
                    System.out.println("-----------------------------");
                    for (Students s : c) {
                        if (s.getID() == sid) {
                            System.out.println(s);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Record Not Found");
                    System.out.println("-----------------------------");
                    break;

                case 4:
                    found = false;
                    System.out.print("Enter Student ID to update: ");
                    sid = sc.nextInt();
                    sc.nextLine();
                    ListIterator<Students> li = c.listIterator();
                    while (li.hasNext()) {
                        Students s = li.next();
                        if (s.getID() == sid) {
                            System.out.print("Enter new Name: ");
                            sname = sc.nextLine();
                            System.out.print("Enter new Marks: ");
                            smarks = sc.nextDouble();
                            li.set(new Students(sid, sname, smarks));
                            found = true;
                        }
                    }
                    if (found)
                        System.out.println("Record updated successfully!");
                    else
                        System.out.println("Record Not Found");
                    System.out.println("-----------------------------");
                    break;

                case 5:
                    found = false;
                    System.out.print("Enter Student ID to delete: ");
                    sid = sc.nextInt();
                    Iterator<Students> i = c.iterator();
                    while (i.hasNext()) {
                        Students s = i.next();
                        if (s.getID() == sid) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (found)
                        System.out.println("Record deleted successfully!");
                    else
                        System.out.println("Record Not Found");
                    System.out.println("-----------------------------");
                    break;

                case 0:
                    System.out.println("Exiting... Thank you for using the system!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            cont = sc.next().charAt(0);
        }

        System.out.println("Program terminated. Goodbye!");
        sc.close();
    }
}
