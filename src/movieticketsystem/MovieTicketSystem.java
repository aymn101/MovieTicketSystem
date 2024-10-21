/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticketsystem;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author aliah
 */
public class MovieTicketSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        String bookingVenue = "TGV 1 Utama";
        String bookingHall = "Hall 3";
        String bookingStatus = "Success";

        String custID = "%1$-15s%2$-25s%3$-10s\n";

        //Customer student, membership;
        Student student = new Student(custID, "Ali", "ali@gmail.com", "013456789", new Movie(), new Food(), "CB20101", "UMP");
        Membership membership = new Membership(custID, "Ali", "ali@gmail.com", "013456789", "GOLD01", 1);

        System.out.print("Enter Customer Type: 1-Student, 2-Membership: ");
        int customerType = scanner.nextInt();

        //For Student
        if (customerType == 1) {
            System.out.println("Enter your details to book ticket(s)!!");
            System.out.print("Enter your name: ");
            student.setCustName(scanner.next());
            System.out.print("Enter your email: ");
            student.setCustEmail(scanner.next());
            System.out.print("Enter your phone no: ");
            student.setCustPhoneNo(scanner.next());

            System.out.println("Enter your student details to get special discount!!");
            System.out.print("Enter matric ID: ");
            student.setMatricID(scanner.next());
            System.out.print("Enter university name: ");
            student.setUniversityName(scanner.next());
        } else {
            //For Membership
            System.out.println("Enter your details to book ticket(s)!!");
            System.out.print("Enter your name: ");
            membership.setCustName(scanner.next());
            System.out.print("Enter your email: ");
            membership.setCustEmail(scanner.next());
            System.out.print("Enter your phone no: ");
            membership.setCustPhoneNo(scanner.next());

            System.out.println("Enter your membership details to get special discount!!");
            System.out.print("Enter member ID: ");
            membership.setMemberID(scanner.next());
            System.out.print("Enter Membership Type: 1-Silver, 2-Gold, 3-Platinum: ");
            membership.setMemberType(scanner.nextInt());
            //membership = new Membership(memberID, memberType);
        }

        Booking bk = new Booking("Damansara", "1", "Success");

        System.out.println("=========Booking=========");
        System.out.println("1 - TGV 1 Utama");
        System.out.println("2 - TGV Mines");
        System.out.println("3 - TGV Sunway Pyramid");
        System.out.println("Enter booking venue: ");
        bk.setBookingVenue(scanner.next());

        //movie
        Movie mv = new Movie();

        System.out.println("========== NOW SHOWING ==========");
        System.out.println("");
        System.out.println("1. The French Dispatch");
        System.out.println("Romance/Comedy");
        System.out.println("1 hour 45 minutes");
        System.out.println("PG-13");
        System.out.println("RM21");
        System.out.println("============================");
        System.out.println("2. Spiderman: No Way Home");
        System.out.println("Action/Adventure");
        System.out.println("2 hours 15 minutes");
        System.out.println("PG-13");
        System.out.println("RM24");
        System.out.println("============================");
        System.out.println("3. Frozen 2");
        System.out.println("Family/Musical");
        System.out.println("2 hour 10 minutes");
        System.out.println("G");
        System.out.println("RM22");
        System.out.println("============================");
        System.out.println("4. The Sun Is Also A Star");
        System.out.println("Romance/Drama");
        System.out.println("1 hour 55 minutes");
        System.out.println("PG");
        System.out.println("RM20");
        System.out.println("============================");
        System.out.println("");

        System.out.println("Choose a movie [1/2/3/4]: ");
        mv.setMovieName(scanner.next());

        switch (mv.getMovieName()) {
            case "1":
                System.out.println("Showtimes ");
                System.out.println("A. 9.30 a.m.  |  B. 10.30 a.m.  |  C. 11.30 a.m.  |  D. 1.30 p.m.  |  E. 2:30 p.m.");
                break;
            case "2":
                System.out.println("Showtimes ");
                System.out.println("A. 9.30 a.m.  |  B. 10.30 a.m.  |  C. 11.30 a.m.  |  D. 1.30 p.m.  |  E. 2:30 p.m.");
                break;
            case "3":
                System.out.println("Showtimes ");
                System.out.println("A. 9.30 a.m.  |  B. 10.30 a.m.  |  C. 11.30 a.m.  |  D. 1.30 p.m.  |  E. 2:30 p.m.");
                break;
            case "4":
                System.out.println("Showtimes ");
                System.out.println("A. 9.30 a.m.  |  B. 10.30 a.m.  |  C. 11.30 a.m.  |  D. 1.30 p.m.  |  E. 2:30 p.m.");
                break;
            default:
                break;
        }

        System.out.println("Choose a showtime [A/B/C/D/E]: ");
        mv.setMovieShowtimes(scanner.next());

        System.out.println("How many ticket(s)do you want to buy?: ");
        bk.setTicketQuantity(scanner.nextInt());

        System.out.println("=========SEAT ROWS=========");
        System.out.println("A - (8 seats)");
        System.out.println("B - (15 seats)");
        System.out.println("C - (15 seats)");
        System.out.println("D - (15 seats)");
        System.out.println("E - (15 seats)");
        System.out.println("F - (15 seats)");
        System.out.println("G - (15 seats)");
        System.out.println("H - (15 seats)");
        System.out.println("I - (15 seats)");
        System.out.println("J - (8 seats)");

        String pickSeatList[] = new String[bk.getTicketQuantity()];
        int pickSeatQty[] = new int[bk.getTicketQuantity()];

        for (int k = 0; k < pickSeatList.length; k++) {
            int l = k + 1;
            System.out.println("Row " + l + " : ");
            pickSeatList[k] = scanner.next();
            System.out.println("Seat number " + l + " : ");
            pickSeatQty[k] = scanner.nextInt();
        }

        Food fd = new Food();

        System.out.println("Do you want to add food? [Y/N]: ");
        String food = scanner.next();

        if (food.equals("Y") || food.equals("y")) {
            System.out.println("=========Food=========");
            System.out.println("Package A (Single 1) - 1xPopCorn (R) + 1xSoftdrinks = RM10");

            System.out.println("Package B (Single 2) - 1xPopCorn (R) + 1xMineral Water = RM10");

            System.out.println("Package C (Combo) - 1xPopCorn (L) + 2xSoftdrinks = RM17");

            System.out.println("Package D (Combo) - 1xPopCorn (L) + 2xMineral Water = RM17");

            System.out.println("Package: ");
            fd.setPackageList(scanner.next());
            System.out.println("Quantity Package: ");
            fd.setPackageQty(scanner.nextInt());

            System.out.println("Do you want to add addons? [Y/N]: ");
            String addOns = scanner.next();

            if (addOns.equals("Y") || addOns.equals("y")) {
                System.out.println("=========Add-Ons=========");
                System.out.println("A - Sausage (5pcs)  - RM10");
                System.out.println("B - Hotdogs         - RM7");
                System.out.println("C - Fries           - RM6");
                System.out.println("D - Nuggets (10pcs) - RM12");

                System.out.println("How many addons you want to add: ");
                fd.setAddOnsAmt(scanner.nextInt());
            }

            int addOnsAmt = fd.getAddOnsAmt();

            AddOns[] addon = new AddOns[addOnsAmt];
            String arrayofaod[] = new String[addOnsAmt];
            int addOnsQty[] = new int[addOnsAmt];

            if (addOns.equals("Y") || addOns.equals("y")) {

                for (int k = 0; k < arrayofaod.length; k++) {
                    int l = k + 1;

                    System.out.println("AddOns " + l + " : ");
                    arrayofaod[k] = scanner.next();
                    System.out.println("Quantity AddOns " + l + " : ");
                    addOnsQty[k] = scanner.nextInt();
                }
            }

            //receipt output
            //bookingDate
            LocalDate bDate = LocalDate.now();
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String bookingDate = bDate.format(formatDate);

            //bookingTime           
            LocalTime bTime = LocalTime.now();
            DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
            String bookingTime = bTime.format(formatTime);

            //date and time set
            bk.setBookingDate(bookingDate);
            bk.setBookingTime(bookingTime);

            if (student instanceof Student) {
                System.out.println("=========Receipt=========");
                System.out.println("Name         : " + student.getCustName());
                System.out.println("Email        : " + student.getCustEmail());
                System.out.println("Phone No     : " + student.getCustPhoneNo());
                System.out.println("Customer Type: Student");
                System.out.println("DISPLAYING RECORD FOR STUDENT DISCOUNT");
                //System.out.println("Matric ID: " + ((Student) student).getMatricID() + " || "
                        //+ "University Name: " + ((Student) student).getUniversityName() + " || " + "Special Discount: " + ((Student) student).specialDiscount());
            } else {
                System.out.println("=========Receipt=========");
                System.out.println("Name         : " + membership.getCustName());
                System.out.println("Email        : " + membership.getCustEmail());
                System.out.println("Phone No     : " + membership.getCustPhoneNo());
                System.out.println("Customer Type: Member");
                System.out.println("DISPLAYING RECORD FOR MEMBERSHIP DISCOUNT");
                //System.out.println("Member ID: " + ((Membership) membership).getMemberID() + " || "
                        //+ "MemberType: " + ((Membership) membership).getMemberType() + " || " + "Special Discount: " + ((Membership) membership).specialDiscount());
            }

            System.out.println("=========Movie=========");
            System.out.println("Movie Name        : " + mv.getMovieName());
            System.out.println("Showtime          : " + mv.getMovieShowtimes());
            System.out.println("Quantity          : " + bk.getTicketQuantity());
            System.out.println("Seat number       : ");
            for (int k = 0; k < pickSeatList.length; k++) {
                System.out.print(pickSeatList[k] + pickSeatQty[k] + ", ");
            }

            System.out.println("=========Booking=========");
            System.out.println("Booking Date : " + bk.getBookingDate());
            System.out.println("Booking Time : " + bk.getBookingTime());
            System.out.println("Booking Venue: " + bk.BookingVenue());
            System.out.println("=========Food=========");
            System.out.println("Food Package Amount: " + bk.getBookingVenue());
            System.out.println("Package: " + fd.getPackageList());
            System.out.println("Quantity Package: " + fd.getPackageQty());

            double addOnsPrice = 0.0;
            double totalAddOnsPrice = 0.0;
            for (int k = 0; k < arrayofaod.length; k++) {
                System.out.println("AddOns: " + arrayofaod[k]);
                System.out.println("Quantity AddOns: " + addOnsQty[k]);

                if ("A".equals(arrayofaod[k])) {
                    addOnsPrice = 10.00 * addOnsQty[k];
                } else if ("B".equals(arrayofaod[k])) {
                    addOnsPrice = 7.00 * addOnsQty[k];
                } else if ("C".equals(arrayofaod[k])) {
                    addOnsPrice = 6.00 * addOnsQty[k];
                } else if ("D".equals(arrayofaod[k])) {
                    addOnsPrice = 12.00 * addOnsQty[k];
                }
                totalAddOnsPrice = totalAddOnsPrice + addOnsPrice;
            }
            
            double moviefoodprice = mv.totalMoviePrice() + fd.totalFoodPrice();
            double grandprice = moviefoodprice + totalAddOnsPrice;
            
            fd.setAddOnsPrice(totalAddOnsPrice);
            
            System.out.println("Movie Price: RM" + mv.totalMoviePrice());
            System.out.println("food Price: RM" + fd.totalFoodPrice());
            //System.out.println("Movie + food Price: RM" + moviefoodprice);
            System.out.println("AddOns Price: RM" + fd.getAddOnsPrice());
            System.out.println("Total Price TEST: RM" + grandprice);
            
            System.out.println("Movie Price TEST: RM" + student.getMovie().totalMoviePrice());
            System.out.println("Food Price TEST: RM" + student.getFood().totalFoodPrice());
            
            System.out.println("Special Discount: RM" + student.specialDiscount());
            
            if(student instanceof Student){
                System.out.println("Grand Total: RM" + student.totalPayment());
            }
            else if(membership instanceof Membership){
                System.out.println("Grand Total: RM" + membership.totalPayment());
            }
        }

    }
}
