package day4and5;

import java.util.PriorityQueue;
import java.util.Scanner;

class Ticket implements Comparable<Ticket> {

    int id;
    String name;
    int priority;

    Ticket(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public int compareTo(Ticket t) {

        return this.priority - t.priority;
    }

    public String toString() {

        return "Ticket ID : " + id +
               " Name : " + name +
               " Priority : " + priority;
    }
}

public class PriorityQueue1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Ticket> pq = new PriorityQueue<>();

        int choice;

        do {

            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Add Ticket");
            System.out.println("2. Serve Ticket");
            System.out.println("3. View All Tickets");
            System.out.println("4. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch(choice) {

            case 1:

                System.out.println("Enter Ticket ID:");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.println("Enter Customer Name:");
                String name = sc.nextLine();

                System.out.println("Enter Priority");
                System.out.println("1 = High");
                System.out.println("2 = Medium");
                System.out.println("3 = Low");

                int priority = sc.nextInt();

                pq.add(new Ticket(id, name, priority));

                System.out.println("Ticket Added Successfully");
                break;

            case 2:

                if(pq.isEmpty()) {

                    System.out.println("No Tickets Available");
                }
                else {

                    System.out.println("Serving Ticket:");
                    System.out.println(pq.poll());
                }

                break;

            case 3:

                if(pq.isEmpty()) {

                    System.out.println("No Tickets Found");
                }
                else {

                    System.out.println("\n--- All Tickets ---");

                    for(Ticket t : pq) {

                        System.out.println(t);
                    }
                }

                break;

            case 4:

                System.out.println("Exiting...");
                break;

            default:

                System.out.println("Invalid Choice");
            }

        } while(choice != 4);

        sc.close();
    }
}